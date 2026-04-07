import java.util.List;

public class Tratamiento {
    private String id;
    private String nombreTratamiento;
    private int duracionDias;
    private List<String> efectosSecundarios;

    public Tratamiento(String id, String nombreTratamiento, int duracionDias, List<String> efectosSecundarios) {
        this.id = id;
        this.nombreTratamiento = nombreTratamiento;
        this.duracionDias = duracionDias;
        this.efectosSecundarios = efectosSecundarios;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public void setDuracionTratamiento(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public void agregarEfectoSecundario(String efecto) {
        efectosSecundarios.add(efecto);
    }
}
