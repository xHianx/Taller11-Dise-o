import java.util.List;

public class Consulta {
    public int dia;
    public int mes;
    public int año;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private String diagnostico;
    private String tratamiento;
    private List<String> examenesMedicos;

    public Consulta(int dia, int mes, int año, String hora, Paciente paciente, Medico medico,
            ServicioMedico servicioMedico, String diagnostico, String tratamiento, List<String> examenesMedicos) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        setHora(hora);
        setPaciente(paciente);
        setMedico(medico);
        setServicioMedico(servicioMedico);
        setDiagnostico(diagnostico);
        setTratamiento(tratamiento);
        setExamenesMedicos(examenesMedicos);
        this.realizada = false;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public List<String> getExamenesMedicos() {
        return examenesMedicos;
    }

    public void setExamenesMedicos(List<String> examenesMedicos) {
        this.examenesMedicos = examenesMedicos;
    }

    public ServicioMedico getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(ServicioMedico servicioMedico) {
        this.servicioMedico = servicioMedico;
    }

    public void someMethod() {
        System.out.println("Hora de la consulta: " + getHora());
        if (!isRealizada()) {
            setRealizada(true);
        }
    }
}
