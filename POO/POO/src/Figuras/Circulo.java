package Figuras;

public class Circulo extends figura {
    public void calcularArea() {
      
    }

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double Area() {
        return Math.pow(radio, 2)*3.1416;
    }

}