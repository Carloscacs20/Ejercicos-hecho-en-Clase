//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciación: Llamo a la clase, le pongo un nombre y le lllamo a mi constructor.
        Automovil auto = new Automovil(); //Primer objeto.
        //Asignación de valores
        auto.marca = "BMW";
        auto.modelo = "i320";
        auto.color = "Blanco";

        //El molde es negro pero le estamos modificando por POLIMORFISMO.
        auto.cilindraje = 3.2;

        //sout
        System.out.println("La marca del auto es: "+auto.marca); //Metodo de salida. LLamo al objeto que engloba el atributo.
        //soutv
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);

        Celular celu = new Celular();
        celu.marca = "Iphone";
        celu.modelo = "2KL";
        celu.color = "Azul";
        celu.almacenamiento = 128;

        System.out.println("La marca del celular es: " + celu.marca);
        System.out.println("celu.modelo = " + celu.modelo);
        System.out.println("celu.color = " + celu.color);
        System.out.println("celu.almacenamiento = " + celu.almacenamiento + " GB");

    }
}