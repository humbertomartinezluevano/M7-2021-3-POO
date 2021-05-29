package cuadrilatero;

public class TestCuadrilatero {
    public static void main(String[] args) {
        Paralelogramo paralelogramo = new Paralelogramo(7,7,2,7,3,3,8,3);
        System.out.println("Las coordenadas del paralelogramo son: ("+paralelogramo.getVertx1()+","+paralelogramo.getVerty1()+"), ("+paralelogramo.getVertx2()+","+paralelogramo.getVerty2()+"), ("+paralelogramo.getVertx3()+","+paralelogramo.getVerty3()+"), ("+paralelogramo.getVertx4()+","+paralelogramo.getVerty4()+").");
        System.out.println("El area del paralelogramo es: "+paralelogramo.calcularArea()+".");
        
        Trapezoide trapezoide = new Trapezoide (0,0,-3,0,-3,-6,2,-6);
        System.out.println("Las coordenadas del trapezoide son: ("+trapezoide.getVertx1()+","+trapezoide.getVerty1()+"), ("+trapezoide.getVertx2()+","+trapezoide.getVerty2()+"), ("+trapezoide.getVertx3()+","+trapezoide.getVerty3()+"), ("+trapezoide.getVertx4()+","+trapezoide.getVerty4()+").");
        System.out.println("El area del trapezoide es: "+trapezoide.calcularArea()+".");
        
        Rectangulo rectangulo = new Rectangulo (9,10,4,10,4,5,9,5);
        System.out.println("Las coordenadas del rectangulo son: ("+rectangulo.getVertx1()+","+rectangulo.getVerty1()+"), ("+rectangulo.getVertx2()+","+rectangulo.getVerty2()+"), ("+rectangulo.getVertx3()+","+rectangulo.getVerty3()+"), ("+rectangulo.getVertx4()+","+rectangulo.getVerty4()+").");
        System.out.println("El area del rectangulo es: "+rectangulo.calcularArea()+".");
        
        Cuadrado cuadrado = new Cuadrado (3,3,-3,3,-3,-3,3,-3);
        System.out.println("Las coordenadas del cuadrado son: ("+cuadrado.getVertx1()+","+cuadrado.getVerty1()+"), ("+cuadrado.getVertx2()+","+cuadrado.getVerty2()+"), ("+cuadrado.getVertx3()+","+cuadrado.getVerty3()+"), ("+cuadrado.getVertx4()+","+cuadrado.getVerty4()+").");
        System.out.println("El area del cuadrado es: "+cuadrado.calcularArea()+".");
    }
}
