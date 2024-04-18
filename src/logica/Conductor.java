package logica;

public class Conductor extends Scaner{
    private int edad;
    private String nombre;
    public Conductor (int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }
    public String obtNm(){
        System.out.print("ingrese el nombre: ");
        nombre = in.nextLine();
        return nombre;
    } 
    public int obtEdad(){
        System.out.print("ingrese la edad: ");
        edad = in.nextInt();
        return edad;
    }

}
