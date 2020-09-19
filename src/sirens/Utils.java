package sirens;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Objects;

public class Utils
{
    public static InputStream getRessource (String name)
    {
        InputStream is = ClassLoader.getSystemResourceAsStream (name);
        return new BufferedInputStream (is);
    }
}
