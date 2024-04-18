package logica;

public class Bicicleta implements Conducir, Sonido {
    public void conducir(){
        System.out.println("pedalenado la bicicleta...");
    }
    public void sonido(){
        System.out.println("ring ring....");
    }
}
