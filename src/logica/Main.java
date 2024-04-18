package logica;


public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor(0, null);
        Scaner scan = new Scaner();
        int edad  = conductor.obtEdad();
        String nombre = conductor.obtNm();
        scan.in.nextLine();        
        if (edad < 16 ){
            System.out.println(nombre +" solo puede conducir o bicicleta o triciclo");
            System.out.println("por favor indique que vehiculo conducira (1) para bicicleta (2) para tricilco");
            int opcion = scan.in.nextInt();
            while ( opcion < 1 || opcion > 2) {
                System.out.println("esa no es una opcion");
                opcion = scan.in.nextInt();
            }
            if (opcion == 1){
                Bicicleta bici = new Bicicleta();
                bici.conducir();
                bici.sonido();

            }  
            if (opcion == 2){
                Triciclo tric = new Triciclo();
                tric.conducir();
                tric.sonido();
            }  
        }
        if (edad >= 16){
            System.out.println(nombre + "puede conducir: bicicleta, ticiclo y carro");
            System.out.println("por favor indique que vehiculo conducira (1) para bicicleta (2) para tricilco (3) para carro");
            int opcion = scan.in.nextInt();
            while ( opcion<1 || opcion >3) {
                System.out.println("esa no es una opcion");
            }
            if (opcion == 1){
                Bicicleta bici = new Bicicleta();
                bici.conducir();
                bici.sonido();

            }  
            if (opcion == 2){
                Triciclo tric = new Triciclo();
                tric.conducir();
                tric.sonido();
            }  
            if (opcion == 3){
                Carro carro = new Carro();
                carro.conducir();
                carro.sonido();
            }
        }
    }
}
