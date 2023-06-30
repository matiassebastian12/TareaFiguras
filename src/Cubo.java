public class Cubo {
    private double lado;



    public Cubo(double lado) {
        this.lado = lado;
    }



    public void calcularArea() {
        double area = 6 * Math.pow(lado, 2);
        System.out.println("El área del cubo es: " + area);
    }



    public void calcularVolumen() {
        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }
}