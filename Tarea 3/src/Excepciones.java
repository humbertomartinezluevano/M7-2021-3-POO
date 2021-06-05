package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        try {
            System.out.println("main llama a unMetodo");
            unMetodo();
        } catch (Exception exc) {
            System.err.println("main recibe y maneja excepcion de unMetodo");
        }
    }
    public static void unMetodo() throws Exception{
        try {
            System.out.println("unMetodo llama a unMetodo2");
            unMetodo2();
        } catch (Exception exc) {
            System.err.println("unMetodo recibe y maneja excepcion de unMetodo2");
            throw exc;
        }
    }
    
    public static void unMetodo2() throws Exception{
        try {
            System.out.println("unMetodo2 arroja excepcion");
            throw new Exception();
        } catch (Exception exc) {
            System.err.println("unMetodo2 maneja excepcion");
            throw exc;
        }
    }
    /*Escriba un programa que ilustre cómo volver a lanzar una excepción. Defina los
    métodos unMetodo y unMetodo2. El método unMetodo2 debe lanzar al principio
    una excepción. El método unMetodo debe llamar a unMetodo2, atrapar la
    excepción y volver a lanzarla. Llame a unMetodo desde el método main, y atrape la
    excepción que se volvió a lanzar. Imprima el rastreo de la pila de esta excepción.*/
}
