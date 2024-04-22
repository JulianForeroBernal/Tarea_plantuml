package logica;

public class Triciclo extends Vehiculo {
    public void conducir(){
        System.out.println("pedaleando el triciclo...");
    }
    public void sonido(Bicicleta bicicleta){
       bicicleta.sonido();
    }
}
