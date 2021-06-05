package src;

public class ExcepcionB extends ExcepcionA{
    
        ExcepcionB(String s) {
        super(s);
        }

        public static void ValidarEdad(int edad)throws ExcepcionB{  
          if(edad<18)  
           throw new ExcepcionB("Eres menor, no puedes votar");  
          else  
           System.out.println("Puedes votar");  
        }  
          
      }  

