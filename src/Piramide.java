public class Piramide {
    private double base;
    private double altura;



    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }



    public void calcularArea() {
        double areaBase = Math.pow(base, 2);
        double areaLateral = base * altura;
        double areaTotal = areaBase + areaLateral;
        System.out.println("El área de la pirámide es: " + areaTotal);
    }



    public void calcularVolumen() {
        double volumen = (base * base * altura) / 3;
        System.out.println("El volumen de la pirámide es: " + volumen);
    }
}
