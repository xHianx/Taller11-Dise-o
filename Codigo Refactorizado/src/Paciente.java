public class Paciente extends Persona {
    HistorialMedico historialMedico;

    public Paciente(String nombre, int edad, String genero, String direccion, String telefono,
            String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public boolean esAdultoMayor() {
        return super.getEdad() >= 65;
    }
}
