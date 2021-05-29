package figura;

public abstract class Figura {
    public abstract double calcularArea();
    public abstract String descripcion();
    //Este abstract lo tuve que añadir aquí porque no me dejaba compilar
    public abstract double calcularVolumen();
}
