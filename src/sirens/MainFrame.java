
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame
{
    public MainFrame ()
    {
//        try
//        {
//            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace ();
//        }

        Container c = getContentPane ();
        setDefaultCloseOperation (javax.swing.WindowConstants.EXIT_ON_CLOSE);
        c.setLayout (new java.awt.GridLayout (3, 3));

        // Variables declaration - do not modify
        new MyButton (c, '1', "HiLo", "Code3HiLo.wav");
        new MyButton (c, '2', "Horn", "Code3Horn.wav");
        new MyButton (c, '3', "HyperYelp", "Code3HyperYelp.wav");
        new MyButton (c, '4', "Wail", "Code3Wail.wav");
        new MyButton (c, '5', "Yelp", "Code3Yelp.wav");
        new MyButton (c, '6', "FedHilo", "FedSigHiLo.wav");
        new MyButton (c, '7', "FedHorn", "FedSigHorn.wav");
        new MyButton (c, '8', "FedYelp", "FedSigYelp.wav");
        new MyButton (c, '9', "NHorn", "galls_newhorn.wav");
        new MyButton (c, 'a', "NSiren", "galls_newqsiren.wav");
        new MyButton (c, 'b', "NThunder", "galls_newthunder.wav");
        new MyButton (c, 'c', "Equinox", "EquinoxWail.wav");
        new MyButton (c, 'd', "Ping", "tm4.wav");
        new MyButton (c, 'e', "Ufo", "tm16.wav");
        new MyButton (c, 'f', "Fire", "tbolt0001.wav");
        new MyButton (c, 'g', "Martin", "mymartin.wav");
        new MyButton (c, 'h', "Startrek", "STTNG35.wav");

        addKeyListener (new KeyAdapter ()
        {
            @Override
            public void keyPressed (KeyEvent e)
            {
                MyButton b = MyButton.getFromKey(e.getKeyChar ());
                if (b != null)
                    b.doClick ();
            }
        });

        pack ();
    }

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
