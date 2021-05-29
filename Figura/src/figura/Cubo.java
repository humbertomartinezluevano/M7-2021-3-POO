package figura;

public class Cubo extends FiguraTridimensional{
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolumen() {
        return lado*lado*lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado*6;
    }

    @Override
    public String descripcion() {
        return "El cubo es una figura tridimensional de 6 caras y 8 vertices, cuyos lados todos miden lo mismo.";
    }
}
