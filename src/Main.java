import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Selecciona una figura: ");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Pirámide");
        System.out.print("Opción: ");
        int opcion = input.nextInt();



        switch (opcion) {
            case 1:
                calcularTriangulo();
                break;
            case 2:
                calcularCuadrado();
                break;
            case 3:
                calcularCirculo();
                break;
            case 4:
                calcularEsfera();
                break;
            case 5:
                calcularCubo();
                break;
            case 6:
                calcularPiramide();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }



        input.close();
    }



    public static void calcularTriangulo() {
        Scanner input = new Scanner(System.in);



        System.out.print("Ingresa la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = input.nextDouble();



        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.calcularPerimetro();
        triangulo.calcularArea();



        input.close();
    }



    public static void calcularCuadrado() {
        Scanner input = new Scanner(System.in);



        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = input.nextDouble();



        Cuadrado cuadrado = new Cuadrado(lado);
        cuadrado.calcularPerimetro();
        cuadrado.calcularArea();



        input.close();
    }



    public static void calcularCirculo() {
        Scanner input = new Scanner(System.in);



        System.out.print("Ingresa el radio del círculo: ");
        double radio = input.nextDouble();



        Circulo circulo = new Circulo(radio);
        circulo.calcularPerimetro();
        circulo.calcularArea();



        input.close();
    }



    public static void calcularEsfera() {
        Scanner input = new Scanner(System.in);



        System.out.print("Ingresa el radio de la esfera: ");
        double radio = input.nextDouble();



        Esfera esfera = new Esfera(radio);
        esfera.calcularArea();
        esfera.calcularVolumen();



        input.close();
    }



    public static void calcularCubo() {
        Scanner input = new Scanner(System.in);



        System.out.print("Ingresa la longitud del lado del cubo: ");
        double lado = input.nextDouble();



        Cubo cubo = new Cubo(lado);
        cubo.calcularArea();
        cubo.calcularVolumen();



        input.close();
    }



    public static void calcularPiramide() {
        Scanner input = new Scanner(System.in);



        System.out.print("Ingresa la base de la pirámide: ");
        double base = input.nextDouble();
        System.out.print("Ingresa la altura de la pirámide: ");
        double altura = input.nextDouble();



        Piramide piramide = new Piramide(base, altura);
        piramide.calcularArea();
        piramide.calcularVolumen();



        input.close();
    }
}