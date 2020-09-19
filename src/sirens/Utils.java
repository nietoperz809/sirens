package sirens;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class Utils
{
    public static InputStream getRessource (String name)
    {
        InputStream is = ClassLoader.getSystemResourceAsStream (name);
        if (is == null)
        {
            System.out.println ("could not load: "+name);
            return null;
        }
        return new BufferedInputStream (is);
    }
}
