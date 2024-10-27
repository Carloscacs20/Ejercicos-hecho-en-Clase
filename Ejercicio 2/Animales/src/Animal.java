public class Animal {
    String especie;
    String raza;
    String tipo;
    String color;
    String sexo;
    int años;

    public void imprimir(){
        System.out.println("Especie: " + this.especie );
        System.out.println("Raza: " + this.raza);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Color: " + this.color);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Años: " + this.años);
    }

    public String concatenar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Especie: " + this.especie + " ");
        sb.append("Raza: " + this.raza + " ");
        sb.append("Tipo: " + this.tipo + " ");
        sb.append("Color: " + this.color + " ");
        sb.append("Sexo: " + this.sexo + " ");
        sb.append("Años: " + this.años + " ");
        return sb.toString();
    }
}
