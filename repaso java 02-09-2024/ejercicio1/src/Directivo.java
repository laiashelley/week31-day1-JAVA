public class Directivo {
    
    private String nombreDirectivo;
    private String apellidoDirectivo;
    private float salarioDirectivo;
    private boolean fumaPuros;

    public Directivo() {
    }

    public Directivo(String nombreDirectivo, String apellidoDirectivo, float salarioDirectivo, boolean fumaPuros) {
        this.nombreDirectivo = nombreDirectivo;
        this.apellidoDirectivo = apellidoDirectivo;
        this.salarioDirectivo = salarioDirectivo;
        this.fumaPuros = fumaPuros;
    }

    public String getNombreDirectivo() {
        return this.nombreDirectivo;
    }

    public void setNombreDirectivo(String nombreDirectivo) {
        this.nombreDirectivo = nombreDirectivo;
    }

    public String getApellidoDirectivo() {
        return this.apellidoDirectivo;
    }

    public void setApellidoDirectivo(String apellidoDirectivo) {
        this.apellidoDirectivo = apellidoDirectivo;
    }

    public float getSalarioDirectivo() {
        return this.salarioDirectivo;
    }

    public void setSalarioDirectivo(float salarioDirectivo) {
        this.salarioDirectivo = salarioDirectivo;
    }

    public boolean isFumaPuros() {
        return this.fumaPuros;
    }

    public boolean getFumaPuros() {
        return this.fumaPuros;
    }

    public void setFumaPuros(boolean fumaPuros) {
        this.fumaPuros = fumaPuros;
    }

    @Override
    public String toString() {
        String fumaPuros = isFumaPuros() ? "Sí" : "No";
        return "Nombre: " + getNombreDirectivo() + "; " +
            "Apellido: " + getApellidoDirectivo() + "; " +
            "Salario: " + getSalarioDirectivo() + "; " +
            "¿Fuma Puros? " + fumaPuros;
    }

}
