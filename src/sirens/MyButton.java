package sirens;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.awt.*;
import java.awt.event.*;

class MyButton extends JToggleButton
{
    static final ButtonUI ui = new MetalToggleButtonUI ()
    {
        @Override
        protected Color getSelectColor ()
        {
            return Color.PINK;
        }
    };

    public MyButton ()
    {
        super ();
        setPreferredSize (new Dimension (100, 100));
        setMinimumSize (new Dimension (100, 100));
        setUI (ui);

        addFocusListener (new FocusListener ()
        {
            @Override
            public void focusGained (FocusEvent e)
            {
                Container c = getParent ().getParent ().getParent ().getParent ();
                c.requestFocus ();
            }

            @Override
            public void focusLost (FocusEvent e)
            {

            }
        });
    }
}
