import java.time.LocalDate;

public class Examen {
    private String idExamen;
    private LocalDate fechaExamen;
    private String tipoExamen;
    private String resultado;

    public Examen(String idExamen, LocalDate fechaExamen, String tipoExamen, String resultado) {
        this.idExamen = idExamen;
        this.fechaExamen = fechaExamen;
        this.tipoExamen = tipoExamen;
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
