public class DetalleTurno extends Turno{
    
    Turno turno;
    String fechaCancelacion;
    String estadoTurno;

    public DetalleTurno() {
    }
    public DetalleTurno(Turno turno, String fechaCancelacion, String estadoTurno) {
        this.turno = turno;
        this.fechaCancelacion = fechaCancelacion;
        this.estadoTurno = estadoTurno;
    }
    
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public String getFechaCancelacion() {
        return fechaCancelacion;
    }
    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
    public String getEstadoTurno() {
        return estadoTurno;
    }
    public void setEstadoTurno(String estadoTurno) {
        this.estadoTurno = estadoTurno;
    }
       
}