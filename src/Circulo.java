public class Circulo {
    private double radio;



    public Circulo(double radio) {
        this.radio = radio;
    }



    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);
    }



    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}
