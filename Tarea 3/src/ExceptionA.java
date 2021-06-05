package src;

public class ExceptionA {
    public static void main(String arg[])
	         {

		         
		         try
		         {
                   // System.out.println(ExceptionB.a());
         			System.out.println(ExceptionC.b());
		         }
		         catch(ArrayIndexOutOfBoundsException excepcion)
		         {
			         System.out.println(" El Indice del arreglo es incorrecto ");
		         }
		         catch(ArithmeticException excepcion)
		         {
			         System.out.println(" El valor que se desea agregar al arreglo es incorrecto");
		         }
		         catch(Exception excepcion)
		         {
			         System.out.println("Se ha generado un error que no es de índices, ni Aritmético");
			         System.out.println("El objeto error es de tipo " + excepcion);
		         }
	         }


            }





  
