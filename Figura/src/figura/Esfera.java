package figura;

public class Esfera extends FiguraTridimensional{
    double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularVolumen() {
        return (4/3)*3.1416*radio*radio*radio;
    }

    @Override
    public double calcularArea() {
        return 4*3.1416*radio*radio;
    }
    
    @Override
    public String descripcion() {
        return "La esfera es una figura tridimensional, que tiene el mismo concepto que el circulo, pero aplicado a un espacio 3D.";
    }
}
