public class Telefono {
    int idTelefono;
    String numTelefono;

    public Telefono() {
    }
    public Telefono(int idTelefono, String numTelefono) {
        this.idTelefono = idTelefono;
        this.numTelefono = numTelefono;
    }

    public int getIdTelefono() {
        return idTelefono;
    }
    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }
    public String getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
       
}