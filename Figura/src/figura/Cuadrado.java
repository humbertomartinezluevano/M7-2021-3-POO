package figura;

public class Cuadrado extends FiguraBidimensional{
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    
    @Override
    public String descripcion() {
        return "El cuadrado es una figura bidimensional de cuatro lados, los cuales todos miden lo mismo; los ángulos internos de un cuadrado son todos de 90 grados.";
    }

    @Override
    public double calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
