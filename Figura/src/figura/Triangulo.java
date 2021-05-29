package figura;

public class Triangulo extends FiguraBidimensional{
    double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }
    
    @Override
    public String descripcion() {
        return "El triangulo es una figura bidimensional de 3 lados, la suma de sus ángulos internos siempre es 180 grados.";
    }

    @Override
    public double calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
