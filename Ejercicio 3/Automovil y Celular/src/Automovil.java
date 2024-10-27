public class Automovil {

    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje; // tipo de dato nativo se usa la minuscula

    public void detalleauto(){
        //String modelo = "otro"
        System.out.println("La marca del carro es " + this.marca);
        System.out.println("El modelo del carro es " + this.modelo); // this nos sirve para diferenciar los valores dentro un proceso
        System.out.println("El color del carro es " + this.color); // recuerda cuando trabajas con atribustos trabajar con this y el this va a tomar los atributos de la clase default
        System.out.println("El cilindraje del carro es " + this.cilindraje);
    }

    public String detalleautos(){
        StringBuilder sb = new StringBuilder(); //clase propia de Java
        sb.append(" auto.marca = " + this.marca); // append añade cadena de texto en una linea
        sb.append(" auto.modelo = " + this.modelo);
        sb.append(" auto.color = " + this.color);
        sb.append(" auto.cilindraje = " + this.cilindraje);
        return sb.toString(); // sirve por si acaso no tenga un caracter q no sea texto sirve para transformarlo
    }
}
