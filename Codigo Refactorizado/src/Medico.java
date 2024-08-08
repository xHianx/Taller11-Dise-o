public class Medico extends Persona {

    public Medico(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
    }

    public void atenderPaciente(Paciente paciente, String accion, String detalle) {
        switch (accion) {
            case "consulta":
                System.out.println("Realizando consulta a " + paciente.getNombre());
                prescribirTratamiento(paciente, detalle);
                break;
            case "medicamento":
                adminMedicamento(paciente, detalle);
                break;
            default:
                throw new IllegalArgumentException("Acción desconocida: " + accion);
        }
    }

    private void prescribirTratamiento(Paciente paciente, String tratamiento) {
        // Implementación para prescribir un tratamiento al paciente.
        System.out.println("Prescribiendo tratamiento... " +
                "(Este metodo solo debe ser utilizado en esta clase, nadie mas lo puede utilizar)");
    }

    private void adminMedicamento(Paciente paciente, String medicamento) {
        // Implementación para administrar medicamentos al paciente.
    }
}
