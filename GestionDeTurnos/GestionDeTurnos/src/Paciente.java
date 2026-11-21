public class Paciente extends Persona {

    private int idPaciente;
    private String historiaClinica;

    public Paciente() {
    }
    public Paciente(int idPersona, String nombre, String apellido, String fechaNacimiento, String dni, String email,
            Telefono telefonoDePersona, int idPaciente, String historiaClinica) {
        super(idPersona, nombre, apellido, fechaNacimiento, dni, email, telefonoDePersona);
        this.idPaciente = idPaciente;
        this.historiaClinica = historiaClinica;
    }

    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }
    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
 

    
    
}