public class Futbolista {
    
    private String nombreFutbolista;
    private String apellidoFutbolista;
    private float salarioFutbolista;
    private int golesMarcados;
    private int tarjetasRecibidas;

    public Futbolista() {
    }

    public Futbolista(String nombreFutbolista, String apellidoFutbolista, float salarioFutbolista, int golesMarcados, int tarjetasRecibidas) {
        this.nombreFutbolista = nombreFutbolista;
        this.apellidoFutbolista = apellidoFutbolista;
        this.salarioFutbolista = salarioFutbolista;
        this.golesMarcados = golesMarcados;
        this.tarjetasRecibidas = tarjetasRecibidas;
    }


    public String getNombreFutbolista() {
        return this.nombreFutbolista;
    }

    public void setNombreFutbolista(String nombreFutbolista) {
        this.nombreFutbolista = nombreFutbolista;
    }

    public String getApellidoFutbolista() {
        return this.apellidoFutbolista;
    }

    public void setApellidoFutbolista(String apellidoFutbolista) {
        this.apellidoFutbolista = apellidoFutbolista;
    }

    public float getSalarioFutbolista() {
        return this.salarioFutbolista;
    }

    public void setSalario(float salarioFutbolista) {
        this.salarioFutbolista = salarioFutbolista;
    }

    public int getGolesMarcados() {
        return this.golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getTarjetasRecibidas() {
        return this.tarjetasRecibidas;
    }

    public void setTarjetasRecibidas(int tarjetasRecibidas) {
        this.tarjetasRecibidas = tarjetasRecibidas;
    }

    public void celebrarGol() {
        System.out.println(nombreFutbolista + " " + apellidoFutbolista + " celebra: ¡Gooooool!");
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getNombreFutbolista() + "; " +
            "Apellido: " + getApellidoFutbolista() + "; " +
            "Salario: " + getSalarioFutbolista() + "; " +
            "Goles Marcados" + getGolesMarcados() + "; " +
            "Tarjetas Recibidas: " + getTarjetasRecibidas();
    }

}
