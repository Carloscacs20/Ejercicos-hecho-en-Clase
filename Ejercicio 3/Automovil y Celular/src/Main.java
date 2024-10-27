//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(); // constructor sirve para reservar un espacio de memoria
        // auto. cuando instanciamos ya nos sale marca, modelo, color y cilindraje
        auto.marca = "BMW";
        auto.modelo = "1320";
        //auto.color = "Rojo";
        auto.cilindraje = 3.2;
        System.out.println("La marca del carro es " + auto.marca); // sout nos sirve para poder escribir
        System.out.println("El modelo del carro es " + auto.modelo); // soutv nos ayuda para escribir mas rapido
        System.out.println("El color del carro es " + auto.color); // cuando no se le asigna un espacio de memoria es un null
        System.out.println("El cilindraje del carro es " + auto.cilindraje);


        Celulares cel = new Celulares();
        cel.marca = "Iphone";
        cel.modelo = "10B8";
        cel.color = "Azul";
        cel.almacenamiento = "128GB";
        System.out.println("La marca del celular es " + cel.marca);
        System.out.println("El modelo del celular es " + cel.modelo);
        System.out.println("El color del celular es " + cel.color);
        System.out.println("El almacenamiento del celular es " + cel.almacenamiento);

        /*Automovil bmw = new Automovil();
        bmw.marca = "Mercedes Benz";
        bmw.modelo = "4020";
        bmw.color = "Gris";
        bmw.cilindraje = 2.5;
        bmw.detalleauto();

        Automovil bm = new Automovil();
        bm.marca = "Chevrolet";
        bm.modelo = "10B5";
        bm.color = "Plata";
        bm.cilindraje = 3.5;
        bm.detalleauto();*/

        Celulares iph = new Celulares();
        iph.marca = "Nokia";
        iph.modelo = "10N3";
        iph.color = "Violeta";
        iph.almacenamiento = "512GB";
        iph.detallecel();

        Automovil bmw = new Automovil();
        bmw.marca = "Mercedes Benz";
        bmw.modelo = "4020";
        bmw.color = "Gris";
        bmw.cilindraje = 2.5;
        System.out.println(bmw.detalleautos());

        Automovil bm = new Automovil();
        bm.marca = "Chevrolet";
        bm.modelo = "10B5";
        bm.color = "Plata";
        bm.cilindraje = 3.5;
        System.out.println(bm.detalleautos());
    }
}