package cuadrilatero;

public class Rectangulo extends Paralelogramo{

    public Rectangulo(double vertx1, double verty1, double vertx2, double verty2, double vertx3, double verty3, double vertx4, double verty4) {
        super(vertx1, verty1, vertx2, verty2, vertx3, verty3, vertx4, verty4);
    }
    
    //Utilicé la fórmula del área de Gauss para calcular el área de los cuadriláteros
    //Es la forma más simple que encontré para calcular el área con coordenadas
    //Que además aplica a cualquier tipo de polígono simple
    @Override
    public double calcularArea() {
        return ((vertx1*verty2+vertx2*verty3+vertx3*verty4+vertx4*verty1)-(verty1*vertx2+verty2*vertx3+verty3*vertx4+verty4*vertx1))/2;
    }
}
