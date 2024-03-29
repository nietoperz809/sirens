package sirens;

import com.sun.java.swing.plaf.windows.WindowsToggleButtonUI;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

class MyButton extends JToggleButton
{
    private static final HashMap<Character, MyButton> keyMap = new HashMap<>();

    private static final ButtonUI ui = new MetalToggleButtonUI()
    {
        @Override
        protected Color getSelectColor ()
        {
            return Color.PINK;
        }
    };

    public static  MyButton getFromKey (Character c)
    {
        return keyMap.get (c);
    }

    public MyButton (Container pane, char key, String title, String wavefile)
    {
        super ();
        keyMap.put (key, this);
        setText ("<html>["+key+"]<br>"+title+"</html>");
        setForeground (Color.RED); // text color
        setBorder (BorderFactory.createLineBorder (Color.RED, 2));
        addActionListener (evt -> ClipHandler.startStop (wavefile));

        Dimension d = new Dimension(90,70);
        setPreferredSize (d);
        setMinimumSize (d);
        setUI (ui);

        pane.add(this);

        addFocusListener (new FocusAdapter ()
        {
            @Override
            public void focusGained (FocusEvent e)
            {
                Container c = getParent ();
                while (!(c instanceof MainFrame))
                    c = c.getParent ();
                c.requestFocus ();
            }
        });
    }
}
