public class Turno {
    private int idTurno;
    private String fecha;
    private String horaInicio;
    private String horaFinal;

    public Turno() {
    }

    public Turno(int idTurno, String fecha, String horaInicio, String horaFinal) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public int getIdTurno() {
        return idTurno;
    }
    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    
}