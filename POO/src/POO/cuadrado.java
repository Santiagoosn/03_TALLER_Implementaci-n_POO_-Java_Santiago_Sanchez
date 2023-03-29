package POO;

public class cuadrado extends figura{

private float lado;
public cuadrado(float lado){
this.lado=lado;
}

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public void calcularArea(){
        float area=0;
        area=lado*lado;
        System.out.println("El lado del cuadrado es" +lado+ "y su area es" +area);
        
    }
    
}
