
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirens;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame
{

    public MainFrame ()
    {
        initComponents ();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents ()
    {

        // Variables declaration - do not modify
        MyButton jToggleButton1 = new MyButton ();
        MyButton jToggleButton4 = new MyButton ();
        MyButton jToggleButton7 = new MyButton ();
        MyButton jToggleButton5 = new MyButton ();
        MyButton jToggleButton3 = new MyButton ();
        MyButton jToggleButton2 = new MyButton ();
        MyButton jToggleButton8 = new MyButton ();
        MyButton jToggleButton6 = new MyButton ();
        MyButton jToggleButton10 = new MyButton ();
        MyButton jToggleButton9 = new MyButton ();
        MyButton jToggleButton11 = new MyButton ();
        MyButton jToggleButton12 = new MyButton ();

        setDefaultCloseOperation (javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane ().setLayout (new java.awt.GridLayout (3, 3));

        jToggleButton1.setText ("HiLo");
        jToggleButton1.addActionListener (evt ->
                ClipHandler.startStop ("Code3HiLo.wav"));
        getContentPane ().add (jToggleButton1);

        jToggleButton4.setText ("Horn");
        jToggleButton4.addActionListener (evt ->
                ClipHandler.startStop ("Code3Horn.wav"));
        getContentPane ().add (jToggleButton4);

        jToggleButton7.setText ("HyperYelp");
        jToggleButton7.addActionListener (evt ->
                ClipHandler.startStop ("Code3HyperYelp.wav"));
        getContentPane ().add (jToggleButton7);

        jToggleButton5.setText ("Wail");
        jToggleButton5.addActionListener (evt ->
                ClipHandler.startStop ("Code3Wail.wav"));
        getContentPane ().add (jToggleButton5);

        jToggleButton3.setText ("Yelp");
        jToggleButton3.addActionListener (evt ->
                ClipHandler.startStop ("Code3Yelp.wav"));
        getContentPane ().add (jToggleButton3);

        jToggleButton2.setText ("FedHilo");
        jToggleButton2.addActionListener (evt ->
                ClipHandler.startStop ("FedSigHiLo.wav"));
        getContentPane ().add (jToggleButton2);

        jToggleButton8.setText ("FedHorn");
        jToggleButton8.addActionListener (evt ->
                ClipHandler.startStop ("FedSigHorn.wav"));
        getContentPane ().add (jToggleButton8);

        jToggleButton6.setText ("FedYelp");
        jToggleButton6.addActionListener (evt ->
                ClipHandler.startStop ("FedSigYelp.wav"));
        getContentPane ().add (jToggleButton6);

        jToggleButton10.setText ("NHorn");
        jToggleButton10.addActionListener (evt ->
                ClipHandler.startStop ("galls_newhorn.wav"));
        getContentPane ().add (jToggleButton10);

        jToggleButton9.setText ("NSiren");
        jToggleButton9.addActionListener (evt ->
                ClipHandler.startStop ("galls_newqsiren.wav"));
        getContentPane ().add (jToggleButton9);

        jToggleButton11.setText ("NThunder");
        jToggleButton11.addActionListener (evt ->
                ClipHandler.startStop ("galls_newthunder.wav"));
        getContentPane ().add (jToggleButton11);

        jToggleButton12.setText ("Equinox");
        jToggleButton12.addActionListener (evt ->
                ClipHandler.startStop ("EquinoxWail.wav"));
        getContentPane ().add (jToggleButton12);

        addKeyListener (new KeyAdapter ()
        {
            @Override
            public void keyPressed (KeyEvent e)
            {
                switch (e.getKeyChar ())
                {
                    case '1':
                        jToggleButton1.doClick();
                        break;
                    case '2':
                        jToggleButton4.doClick();
                        break;
                    case '3':
                        jToggleButton7.doClick();
                        break;
                    case '4':
                        jToggleButton5.doClick();
                        break;
                    case '5':
                        jToggleButton3.doClick();
                        break;
                    case '6':
                        jToggleButton2.doClick();
                        break;
                    case '7':
                        jToggleButton8.doClick();
                        break;
                    case '8':
                        jToggleButton6.doClick();
                        break;
                    case '9':
                        jToggleButton10.doClick();
                        break;
                    case 'a':
                        jToggleButton9.doClick();
                        break;
                    case 'b':
                        jToggleButton11.doClick();
                        break;
                    case 'c':
                        jToggleButton12.doClick();
                        break;
                }
            }
        });

        pack ();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)
    {
        MainFrame jf = new MainFrame ();
        jf.setTitle ("YelpMachine!");
        jf.setVisible (true);
    }
}
