package figura;

public class Tetraedro extends FiguraTridimensional{
    double base, altura1, altura2;

    public Tetraedro(double base, double altura1, double altura2) {
        this.base = base;
        this.altura1 = altura1;
        this.altura2 = altura2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura1() {
        return altura1;
    }

    public void setAltura1(double altura1) {
        this.altura1 = altura1;
    }

    public double getAltura2() {
        return altura2;
    }

    public void setAltura2(double altura2) {
        this.altura2 = altura2;
    }

    @Override
    public double calcularVolumen() {
        return (base*altura1/2)*altura2/3;
    }

    @Override
    public double calcularArea() {
        return (base*altura1/2)*4;
    }

    @Override
    public String descripcion() {
        return "El tetraedro es una figura tridimensional de 4 caras y 4 vertices, dichas caras con forma triangular.";
    }
    
}
