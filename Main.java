import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Examen> examenes = new ArrayList<>();
        List<Tratamiento> tratamientos = new ArrayList<>();
        List<String> efectos = new ArrayList<>();
        List<Paciente> pacientes = new ArrayList<>();

        efectos.add("Náuseas");

        Tratamiento t1 = new Tratamiento("T01", "Quimioterapia", 30, efectos);
        Examen e1 = new Examen("E01", LocalDate.now(), "Biopsia", "Pendiente");

        examenes.add(e1);
        tratamientos.add(t1);

        Paciente p1 = new Paciente(
                "12345",
                "Ana López",
                45,
                "Femenino",
                "Leucemia",
                "II",
                "En tratamiento",
                examenes,
                tratamientos
        );

        Sistema sistema = new Sistema(pacientes);
        sistema.agregarPaciente(p1);

        System.out.println("Sistema funcionando correctamente 🚀");
    }
}
