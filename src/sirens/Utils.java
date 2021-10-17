package sirens;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

public class Utils
{
    public static InputStream getResource (String name)
    {
        InputStream is = ClassLoader.getSystemResourceAsStream (name);
        if (is == null)
        {
            System.out.println ("could not load: "+name);
            return null;
        }
        return new BufferedInputStream (is);
    }

    public static URL getResourceAsURL(String name)
    {
        return ClassLoader.getSystemResource(name);
    }
}
