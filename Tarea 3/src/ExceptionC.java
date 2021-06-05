package src;

import java.io.IOException;

public class ExceptionC extends ExceptionB 
         {
	         public static boolean b() throws IOException
	         {
		         int [] dos = new int[20];
		         dos[-3] = 24;
				return false;	
	         }
         }

