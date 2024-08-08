public class ServicioMedico {
    private String nombre;
    private String descripcion;
    private Costo costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = new Costo(costo);
        setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo.getValor();
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {

        this.duracion = duracion;
    }
}
