import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    // Métodos para agregar y eliminar elementos de consultas
    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void eliminarConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    // Métodos para agregar y eliminar elementos de recetasMedicas
    public void agregarRecetaMedica(RecetaMedica recetaMedica) {
        recetasMedicas.add(recetaMedica);
    }

    public void eliminarRecetaMedica(RecetaMedica recetaMedica) {
        recetasMedicas.remove(recetaMedica);
    }

    // Getter que devuelve una colección de solo lectura
    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return Collections.unmodifiableList(recetasMedicas);
    }
}
