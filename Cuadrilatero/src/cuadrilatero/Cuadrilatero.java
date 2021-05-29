package cuadrilatero;

public abstract class Cuadrilatero {
    protected double vertx1;
    protected double verty1;
    protected double vertx2;
    protected double verty2;
    protected double vertx3;
    protected double verty3;
    protected double vertx4;
    protected double verty4;

    public Cuadrilatero(double vertx1, double verty1, double vertx2, double verty2, double vertx3, double verty3, double vertx4, double verty4) {
        this.vertx1 = vertx1;
        this.verty1 = verty1;
        this.vertx2 = vertx2;
        this.verty2 = verty2;
        this.vertx3 = vertx3;
        this.verty3 = verty3;
        this.vertx4 = vertx4;
        this.verty4 = verty4;
    }

    public double getVertx1() {
        return vertx1;
    }

    public void setVertx1(double vertx1) {
        this.vertx1 = vertx1;
    }

    public double getVerty1() {
        return verty1;
    }

    public void setVerty1(double verty1) {
        this.verty1 = verty1;
    }

    public double getVertx2() {
        return vertx2;
    }

    public void setVertx2(double vertx2) {
        this.vertx2 = vertx2;
    }

    public double getVerty2() {
        return verty2;
    }

    public void setVerty2(double verty2) {
        this.verty2 = verty2;
    }

    public double getVertx3() {
        return vertx3;
    }

    public void setVertx3(double vertx3) {
        this.vertx3 = vertx3;
    }

    public double getVerty3() {
        return verty3;
    }

    public void setVerty3(double verty3) {
        this.verty3 = verty3;
    }

    public double getVertx4() {
        return vertx4;
    }

    public void setVertx4(double vertx4) {
        this.vertx4 = vertx4;
    }

    public double getVerty4() {
        return verty4;
    }

    public void setVerty4(double verty4) {
        this.verty4 = verty4;
    }
    
    public abstract double calcularArea();
}
//Escriba una jerarquía de herencia para las clases Cuadrilátero, Trapezoide,
//Paralelogramo, Rectángulo y Cuadrado. Use Cuadrilátero como la superclase de la
//jerarquía. Agregue todos los niveles que sea posible a la jerarquía. Especifique las
//variables de instancia y los métodos para cada clase. Las variables de instancia
//private de Cuadrilátero deben ser los pares de coordenadas x-y para los cuatro
//puntos finales del cuadrilátero. Escriba un programa que cree instancias de objetos
//de sus clases, y que imprima el área de cada objeto (excepto Cuadrilátero).