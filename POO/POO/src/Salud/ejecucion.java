package Salud;

public class ejecucion {
    public static void main(String[] args) {
        //objeto
        Persona persona=new Persona();
        //invocar
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }

}
