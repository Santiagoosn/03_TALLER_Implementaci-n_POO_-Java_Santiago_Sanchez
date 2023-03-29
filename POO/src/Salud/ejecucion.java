package Salud;

public class ejecucion {
    public static void main(String[] args) {
        //objeto
        Persona Mujer=new Persona();
        //invocar
        Mujer.pedirDatos();
        Mujer.mostrarPersona();
        Mujer.calcularImc();
        Mujer.mayorEdad();
    }

}
