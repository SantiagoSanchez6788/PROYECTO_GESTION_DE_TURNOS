public class Medico extends Persona {

  private int idMedico;
  private String matricula; 
  private Especialidad especialidadMedico;
  private Persona medico; 

  public Medico(int idPersona, String nombre, String apellido, String fechaNacimiento, String dni, String email,
      Telefono telefonoDePersona, int idMedico, String matricula, Especialidad especialidadMedico,Persona medico) {
    super(idPersona, nombre, apellido, fechaNacimiento, dni, email, telefonoDePersona);
    this.idMedico = idMedico;
    this.matricula = matricula;
    this.especialidadMedico = especialidadMedico;
    this.medico=medico;
  }

  public Medico() {
  }

  public int getIdMedico() {
    return idMedico;
  }
  public void setIdMedico(int idMedico) {
    this.idMedico = idMedico;
  }

  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  
  public Especialidad getEspecialidadMedico() {
    return especialidadMedico;
  }
  public void setEspecialidadMedico(Especialidad especialidadMedico) {
    this.especialidadMedico = especialidadMedico;
  }

  public Persona getMedico() {
    return medico;
  }

  public void setMedico(Persona medico) {
    this.medico = medico;
  }

  

}