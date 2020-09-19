package sirens;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

class ImagePanel extends JComponent
{
    private Image image;

    public ImagePanel ()
    {
        try
        {
            this.image = ImageIO.read (Utils.getResource ("copcar.jpg"));
        }
        catch (IOException e)
        {
            System.out.println ("no image");
        }
    }

    @Override
    protected void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        //System.out.println (getWidth ()+","+getHeight ());
        if (image != null)
            g.drawImage (image, 0, 0, getWidth (), getHeight (),this);
    }
}
