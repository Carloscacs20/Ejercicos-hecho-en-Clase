public class Celulares {

    String marca;
    String modelo;
    String color;
    String almacenamiento;

    public void detallecel(){
        //StringBuilder sb = new  StringBuilder(); esto es un constructor
        System.out.println("La marca del celular es " + this.marca);
        System.out.println("El modelo del celular es " + this.modelo);
        System.out.println("El color del celular es " + this.color);
        System.out.println("El almacenamiento del celular es " + this.almacenamiento);
    }
}
