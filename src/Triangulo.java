public class Triangulo {
    private double base;
    private double altura;



    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }



    public void calcularPerimetro() {
        double perimetro = 3 * base;
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }



    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

}

