package Figuras;

public class Triangulo extends figura {
    public void calcularArea() {
    }

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double Area() {
        return (base * altura) / 2;
    }


}
