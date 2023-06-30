public class Cuadrado {
    private double lado;



    public Cuadrado(double lado) {
        this.lado = lado;
    }



    public void calcularPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }



    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }
}