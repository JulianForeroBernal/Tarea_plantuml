package logica;

public class Carro implements Conducir, Sonido {
    public void conducir(){
        System.out.println("manejando el carro...");
    }
    public void sonido(){
        System.out.println("pip pip....");
    }
}
