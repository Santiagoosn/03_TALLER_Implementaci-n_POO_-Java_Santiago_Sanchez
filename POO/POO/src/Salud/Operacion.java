package Salud;

import java.util.Scanner;

public class Operacion {
    //atributos
    public Double peso;
    public Double estatura;
    public Double resultado;
    //metodos
    public void calcularImc(){
        Scanner Lectura=new Scanner(System.in);
        System.out.println("por favor ingresar el peso");
        peso=Lectura.nextDouble();
        System.out.println("por favor ingresar la estatura");
        estatura=Lectura.nextDouble();
    }
    public void operacion(){
        resultado=peso/estatura*2;
        if(resultado<20){
            System.out.println("usted tiene sobrepeso" + resultado);
        }else if(resultado>20 && resultado<25){
            System.out.println("usted tiene sobre peso" + resultado);
        }else if(resultado>25){
            System.out.println("usted tiene sobre peso" + resultado);
        }
        
    }
    public void mostrarResultado(){
        System.out.println("El IMC ");
    }
    
}
