import java.util.ArrayList;
import java.util.List;

public class SistemaAtencionMedico {
    private static final double DESCUENTO_ADULTO_MAYOR = 0.25;
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    public void agendarConsulta(Consulta consulta) {
        Paciente paciente = consulta.getPaciente();
        double costoConsulta = consulta.getServicioMedico().getCosto();
        int edadPaciente = paciente.getEdad();
        costoConsulta = calcularValorFinalConsulta(costoConsulta, edadPaciente);
        System.out.println("Se han cobrado " + costoConsulta + " dolares de su tarjeta de credito");
        paciente.getHistorialMedico().getConsultas().add(consulta); // Hacer esto es incorrecto
    }

    public double calcularValorFinalConsulta(double costoConsulta, int edadPaciente) {
        double valorARestar = 0;
        if (edadPaciente >= 65) {
            valorARestar = costoConsulta * DESCUENTO_ADULTO_MAYOR; // Reemplazo del número mágico con una constante
        }
        return costoConsulta - valorARestar;
    }

    // se puede parametrizar (obtener...)
    public Paciente obtenerPaciente(String nombrePaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equals(nombrePaciente))
                return paciente;
        }
        return null;
    }

    public ServicioMedico obtenerServicioMedico(String nombreServicio) {
        for (ServicioMedico servicioMedico : serviciosMedicos) {
            if (servicioMedico.getNombre().equals(nombreServicio))
                return servicioMedico;
        }
        return null;
    }

    public Medico obtenerMedico(String nombreMedico) {
        for (Medico medico : medicos) {
            if (medico.getNombre().equals(nombreMedico))
                return medico;
        }
        return null;
    }
}
