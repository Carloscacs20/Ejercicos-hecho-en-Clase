public class Automovil {
    //Declaración de atributos
    public String marca;
    public String modelo;
    public String color = "Verde"; //Así viene el molde.
    public float cilindraje;
    public float consumo = 40;

    //Creación de metodo para imprimir
    public String verDetalle(){
        String dv = "La marca es -> " + this.marca + "\n"+
                    "El modelo es -> " + this.modelo + "\n" +
                    "El color es -> " + this.color +  "\n"+
                    "El cilindraje es -> "+ this.cilindraje;
        return dv;
        // Clase: Upper Camel Case, empiezan con mayúscula.
        // Los métodos: Lower Camel Case, la primera con minúscula y si es más de una palabra las otras empiezan con mayúsculas.
        // Es una variable a la que se asigna un valor
        //  this: Toma el valor del atributo de la clase.
        //  Metodo: Comportamiento del estado de los atributos
    }

    //Creación de metodo que retorna.
    public String acelerar(){
        return "El auto marca + " + this.marca + " Está acelerando";
    }

    //Creación de metodo que recibe y retorna parametro.
    public String frenar(int kmph){
        return "El auto modelo + " + this.modelo + " Está frenando a -> " +kmph;
    }

    //Creación de metodo que recibe dos parametros y retorna.
    public float capacidadTanque(int cap, float porConsumo ){
        float cm = consumo / (cap*porConsumo);
        return cm;

    }

    /*
    Se puede crear dos métodos con el mismo nombre se llama SOBRECARGA DE MÉTODOS.
    Siempre y cuando mis parametros sean diferentes alguno ya sea el tipo o el número de variables.
    Polimorfismo: Mismo metodo con diferentes formas de realizar acciones.
     */

    public float capacidadTanque(int cap, int porConsumo ){
        float cm = consumo / (cap*(porConsumo/100));
        return cm;

    }

}
