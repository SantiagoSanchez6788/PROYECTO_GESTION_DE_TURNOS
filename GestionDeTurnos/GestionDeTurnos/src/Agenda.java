public class Agenda {

    String fecha;
    String hora;
    String estado;
    String fechaCancelacion;
    Turno turno;
    Paciente paciente;

    public Agenda() {
    }
    public Agenda(String fecha, String hora, String estado, String fechaCancelacion, Turno turno,Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.fechaCancelacion = fechaCancelacion;
        this.turno = turno;
        this.paciente=paciente;
    }
    
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }
    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente=paciente;
    }

}