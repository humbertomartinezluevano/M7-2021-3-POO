package figura;

public class PruebaFigura {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.5);
        Triangulo triangulo = new Triangulo(2.4,1.7);
        Cuadrado cuadrado = new Cuadrado(4.4);
        Esfera esfera = new Esfera(5.5);
        Cubo cubo = new Cubo(4.4);
        Tetraedro tetraedro = new Tetraedro(2.4,1.7,3.3);
        Figura figuras[] = new Figura[6];
        figuras[0] = circulo;
        figuras[1] = triangulo;
        figuras[2] = cuadrado;
        figuras[3] = esfera;
        figuras[4] = cubo;
        figuras[5] = tetraedro;
        int i = 0;
        //Ciclo para imprimir información de figuras
        do{
            if(figuras[i] instanceof FiguraBidimensional){
                System.out.println(figuras[i].descripcion());
                System.out.println("El area de esta figura es: "+figuras[i].calcularArea()+".");
            }
            else if(figuras[i] instanceof FiguraTridimensional){
                System.out.println(figuras[i].descripcion());
                System.out.println("El volumen de esta figura es: "+figuras[i].calcularVolumen()+".");
                System.out.println("El area superficial de esta figura es: "+figuras[i].calcularArea()+".");
            }
            i++;
        }while(i<6);
    }
}
