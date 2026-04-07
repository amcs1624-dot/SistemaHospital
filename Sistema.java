import java.util.List;

public class Sistema {
    private List<Paciente> listaPacientes;

    public Sistema(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void eliminarPaciente(String idPaciente) {
        // lógica básica (puedes mejorarla luego)
    }

    public Paciente buscarPaciente(String idPaciente) {
        return null;
    }
}
