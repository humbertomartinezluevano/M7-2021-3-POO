package src;
import java.io.IOException;

public class ExceptionB extends ExceptionA
{
    public static boolean a() throws IOException
    {
        int [] uno = new int[20];
        uno[3] = 24/0;
        return false;	
    }
}