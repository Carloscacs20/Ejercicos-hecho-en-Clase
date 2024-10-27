public class Animal {
    private String especie;
    private String raza;
    private String tipo;
    private String color;
    private String sexo;
    private int años;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public void imprimirDetalle(){
        System.out.println("Especie: " + this.especie );
        System.out.println("Raza: " + this.raza);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Color: " + this.color);
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Años: " + this.getAños());
    }
}
