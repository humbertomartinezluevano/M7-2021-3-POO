package figura;

public class Circulo extends FiguraBidimensional{
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return 3.1416*radio*radio;
    }
    
    @Override
    public String descripcion() {
        return "El circulo es una figura bidimensional que consiste de puntos en un plano que están a una misma distancia de otro punto llamado centro.";
    }

    @Override
    public double calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}