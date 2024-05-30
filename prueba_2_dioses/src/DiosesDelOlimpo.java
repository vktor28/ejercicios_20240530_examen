public class DiosesDelOlimpo extends Dioses {

    private String caracteriticaDios;

    public DiosesDelOlimpo() {
    }

    public DiosesDelOlimpo(String nombre, int edad, double gradoFuerza, String caracteriticaDios) {
        super(nombre, edad, gradoFuerza);
        this.caracteriticaDios = caracteriticaDios;
    }

    public String getCaracteriticaDios() {
        return this.caracteriticaDios;
    }

    public void setCaracteriticaDios(String caracteriticaDios) {
        this.caracteriticaDios = caracteriticaDios;
    }


    @Override
    public String toString() {
        return getNombre().toUpperCase() + " - " + getCaracteriticaDios() + "\n" +
        "Edad: " + getEdad() + " | " +
        "Fuerza: " + getGradoFuerza();
    }

}
