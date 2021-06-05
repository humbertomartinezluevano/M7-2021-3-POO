package src;

public class ExcepcionA extends Exception{  
        
         ExcepcionA(String s){  
         super(s);  
        }  
       
    
       public static void ValidarEstado(String Estado)throws ExcepcionA{  
        if(Estado != "Aguascalientes")  
         throw new ExcepcionA("Eres de otro Estado");  
        else  
         System.out.println("Puedes votar");  
      }  


    }