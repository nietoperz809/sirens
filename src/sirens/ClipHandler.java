package sirens;

import javax.sound.sampled.*;
import java.util.HashMap;

public class ClipHandler
{
    private static final HashMap<String, Clip> map = new HashMap<> ();

    public static void startStop (String name)
    {
        Clip cl = map.get (name);
        if (cl == null)
        {
            try
            {
                cl = (Clip) AudioSystem.getLine (new Line.Info (Clip.class));
                cl.open (AudioSystem.getAudioInputStream (Utils.getResource (name)));
                map.put (name, cl);
            }
            catch (Exception e)
            {
                System.out.println ("no clip");
                return;
            }
        }
        if (cl.isRunning ())
        {
            cl.stop ();
        }
        else
        {
            cl.loop (Clip.LOOP_CONTINUOUSLY);
            cl.start ();
        }
    }
}
