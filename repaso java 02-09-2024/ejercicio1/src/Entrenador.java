public class Entrenador {
    
    private String nombreEntrenador;
    private String apellidoEntrenador;
    private float salarioEntrenador;
    private int experienciaEntrenador;

    public Entrenador() {
    }

    public Entrenador(String nombreEntrenador, String apellidoEntrenador, float salarioEntrenador, int experienciaEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
        this.apellidoEntrenador = apellidoEntrenador;
        this.salarioEntrenador = salarioEntrenador;
        this.experienciaEntrenador = experienciaEntrenador;
    }

    public String getNombreEntrenador() {
        return this.nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return this.apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public float getSalarioEntrenador() {
        return this.salarioEntrenador;
    }

    public void setSalarioEntrenador(float salarioEntrenador) {
        this.salarioEntrenador = salarioEntrenador;
    }

    public int getExperienciaEntrenador() {
        return this.experienciaEntrenador;
    }

    public void setExperienciaEntrenador(int experienciaEntrenador) {
        this.experienciaEntrenador = experienciaEntrenador;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombreEntrenador() + "; " +
            "Apellido: " + getApellidoEntrenador() + "; " +
            "Salario: " + getSalarioEntrenador() + "; " +
            "Experiencia: " + getExperienciaEntrenador() + " años";
    }

}
