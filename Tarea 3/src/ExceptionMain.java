import src.ExcepcionA;
import src.ExcepcionB;


public class ExceptionMain {
    public static void main(String args[]){
        try{
          // ExcepcionA.ValidarEstado("S");
           ExcepcionB.ValidarEdad(15);
           
        }catch(Exception m){System.out.println("Exception occured: "+m);
        

       }

    }



}