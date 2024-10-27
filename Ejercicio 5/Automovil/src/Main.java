//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciar objetos
        Automovil bmw = new Automovil();
        // Automovil() es el nombre del constructor.
        bmw.marca = "BMW";
        bmw.modelo = "i320";
        bmw. color = "Negro";
        bmw. cilindraje = 3;

        //Invocación a los metodos
        System.out.println("Información \n" + bmw.verDetalle());
        System.out.println("bmw.acelerar = " + bmw.acelerar());
        System.out.println("bmw.frenar = " + bmw.frenar(80));
        //Se debe especificar el tipo cuando es decimal. Ejemplo = 0.7f
        System.out.println("bmw.capacidadTanque(40,07) = " + bmw.capacidadTanque(40,0.7f));
        //Llamar a otro metodo
        System.out.println("bmw.capacidadTanque(40,70) = " + bmw.capacidadTanque(40,70f));

    }
}