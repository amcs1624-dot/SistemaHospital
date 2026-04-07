import java.util.List;

public class Paciente {
    private String identificacion;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estadoActual;
    private List<Examen> listaExamen;
    private List<Tratamiento> listaTratamiento;

    public Paciente(String identificacion, String nombre, int edad, String genero,
                    String tipoCancer, String etapa, String estadoActual,
                    List<Examen> listaExamen, List<Tratamiento> listaTratamiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estadoActual = estadoActual;
        this.listaExamen = listaExamen;
        this.listaTratamiento = listaTratamiento;
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        listaTratamiento.add(tratamiento);
    }

    public void agregarExamen(Examen examen) {
        listaExamen.add(examen);
    }
}
