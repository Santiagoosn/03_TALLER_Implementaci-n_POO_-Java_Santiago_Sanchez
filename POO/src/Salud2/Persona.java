package Salud2;

import java.util.Scanner;

public class Persona {
//atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;
    public Double resultado;
//metodos
public void pedirDatos(){
    Scanner lectura=new Scanner(System.in);
    System.out.println("por favor digite su tipo de documento");
    tipoDoc=lectura.next();
    System.out.println("por favor digite su documento");
    documento=lectura.nextInt();
    System.out.println("por favor digite su nombre");
    nombre=lectura.next();
    System.out.println("por favor digite su apellido");
    apellido=lectura.next();
    System.out.println("por favor digite su peso");
    peso=lectura.nextDouble();
    System.out.println("por favor digite su estatura");
    estatura=lectura.nextDouble();
    System.out.println("por favor digite su edad");
    edad=lectura.nextInt();
    System.out.println("por favor digite su sexo");
    sexo=lectura.next();
}
public void mostrarPersona(){
System.out.println("su tipo de documento es "+tipoDoc);
System.out.println("su numero de documento es "+documento);
System.out.println("su nombre es "+nombre);
System.out.println("su apellido es "+apellido);
System.out.println("su peso es "+peso);
System.out.println("su estatura es "+estatura);
System.out.println("su edad es "+edad);
System.out.println("su sexo es "+sexo);
}
public double calcularImc(double estatura, double peso){
    resultado=peso/(estatura*estatura);
    if(resultado<20){
        System.out.println("PESOBAJO" + resultado);
    }else if(resultado>20 && resultado<25){
        System.out.println("PESOIDEAL" + resultado);
    }else if(resultado>25){
        System.out.println("SOBREPESO" + resultado);
    }
    return resultado;
}
public void mayorEdad(){
    if(edad>=18){
        System.out.println("Usted es mayor de edad");
    }else if(edad<18)
    System.out.println("Usted es menor de edad");
}
}


