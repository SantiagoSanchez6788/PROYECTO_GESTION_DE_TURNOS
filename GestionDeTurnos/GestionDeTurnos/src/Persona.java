public class Persona{

    private int idPersona;
    private String nombre;
    private String Apellido;
    private String fechaNacimiento;
    private String dni;
    private String email;
    private Telefono telefonoDePersona;

    public Persona(int idPersona, String nombre, String apellido, String fechaNacimiento, String dni, String email, Telefono telefonoDePersona) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        Apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.email = email;
        this.telefonoDePersona = telefonoDePersona;
    }
    public Persona(){

    }

    public int getIdPersona() {
        return idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Telefono getTelefonoDePersona() {
        return telefonoDePersona;
    }
    public void setTelefonoDePersona(Telefono telefonoDePersona) {
        this.telefonoDePersona = telefonoDePersona;
    }
      
    
}