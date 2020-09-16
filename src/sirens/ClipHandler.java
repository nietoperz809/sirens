package sirens;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.InputStream;
import java.util.HashMap;

public class ClipHandler
{
    private static HashMap<String, Clip> map = new HashMap<>();

    private static Clip playWave (InputStream is) throws Exception
    {
        final Clip clip = (Clip) AudioSystem.getLine (new Line.Info (Clip.class));
        clip.open (AudioSystem.getAudioInputStream (is));
        clip.loop (Clip.LOOP_CONTINUOUSLY);
        clip.start ();
        return clip;
    }

    public static void startStop (String name)
    {
        Clip cl = map.get (name);
        if (cl != null)
        {
            cl.stop();
            cl.close();
            map.remove (name);
        }
        else
        {
            InputStream is = ClassLoader.getSystemResourceAsStream (name);
            try
            {
                cl = playWave (is);
                map.put (name, cl);
            } catch (Exception e)
            {
                System.out.println (e);
            }
        }
    }
}
