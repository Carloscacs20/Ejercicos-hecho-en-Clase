//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal ani1 = new Animal();

        ani1.setEspecie("Gato");
        ani1.setRaza("Burmes");
        ani1.setColor("Negro");
        ani1.setTipo("Carnivoro");
        ani1.setSexo("Macho");
        ani1.setAños(3);
        ani1.imprimirDetalle();

        System.out.println("-------------------------");

        Animal ani2 = new Animal();

        ani2.setEspecie("Perro");
        ani2.setRaza("Golden");
        ani2.setColor("Cafe claro");
        ani2.setTipo("Carnivoro");
        ani2.setSexo("Hembra");
        ani2.setAños(6);
        ani2.imprimirDetalle();

        System.out.println("-------------------------");

        Animal ani3 = new Animal();

        ani3.setEspecie("Vaca");
        ani3.setRaza("Angus");
        ani3.setColor("Negro");
        ani3.setTipo("Herbivoro");
        ani3.setSexo("Hembra");
        ani3.setAños(7);
        ani3.imprimirDetalle();
    }
}