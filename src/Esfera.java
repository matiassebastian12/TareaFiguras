public class Esfera {
    private double radio;



    public Esfera(double radio) {
        this.radio = radio;
    }



    public void calcularArea() {
        double area = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la esfera es: " + area);
    }



    public void calcularVolumen() {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
