package POO;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        float lado;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado=lectura.nextFloat();

        cuadrado c1=new cuadrado(lado);
        c1.calcularArea();
        lectura.close();
    }
}
