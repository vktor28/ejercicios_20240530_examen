public class DiosesModernos extends Dioses {

    private String plataformaImpacto;

    public DiosesModernos() {
    }

    public DiosesModernos(String nombre, int edad, double gradoFuerza, String plataformaImpacto) {
        super(nombre, edad, gradoFuerza);
        this.plataformaImpacto = plataformaImpacto;
    }

    public String getPlataformaImpacto() {
        return this.plataformaImpacto;
    }

    public void setPlataformaImpacto(String plataformaImpacto) {
        this.plataformaImpacto = plataformaImpacto;
    }

    @Override
    public String toString() {
        return getNombre().toUpperCase() + " -  Dios/a de " + getPlataformaImpacto() + "\n" +
        "Edad: " + getEdad() + " | " +
        "Fuerza: " + getGradoFuerza();
    }
    
}
