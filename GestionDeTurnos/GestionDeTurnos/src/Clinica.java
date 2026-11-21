public class Clinica {
    private int idClinica;
    private String nombre;
    private String email;
    private String direccion;
    
    public Clinica(int idClinica, String nombre, String email, String direccion) {
        this.idClinica = idClinica;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public Clinica() {
    }

    public String getNombre() {
        return nombre;
    }
    public String email() {
        return email;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getIdClinica() {
        return idClinica;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

}