import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.SQLException;
import java.sql.Connection;

public class AgendarDAO{
    
    public void Agendar_Turno(Agenda turnito) {
        String sql = "INSERT INTO AGENDAR (FECHA, HORA, ESTADO, TURNO_IDTURNO,PACIENTE_IDPACIENTE) VALUES ( ?, ?, ?, ?, ?)";
    
        try (
        Connection conexion = new AccesoDatos().getConexion();
        PreparedStatement stmt = conexion.prepareStatement(sql)) 
        {
        LocalDate fecha=LocalDate.now();
        LocalTime hora = LocalTime.now();

        // Asignar los parametros en la consulta
        stmt.setObject(1, fecha);
        stmt.setObject(2,hora);
        stmt.setString(3,turnito.getEstado());
        stmt.setInt(4, turnito.getTurno().getIdTurno());
        stmt.setInt(5, turnito.getPaciente().getIdPaciente());

        stmt.executeUpdate();
        System.out.println("---TURNO AGENDADO---\n");
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("---TURNO NO AGENDADO---\n");
        }
    }

    public void actualizar_Turno(Agenda turnito){
        String sql = "UPDATE DETALLE_TURNO SET ESTADOTURNO=? WHERE TURNO_IDTURNO=? ";
        try (
        Connection conexion = new AccesoDatos().getConexion();
        PreparedStatement stmt = conexion.prepareStatement(sql)) 
    {

        // Asignar los parametros en la consulta
        stmt.setString(1, "RESERVADO");
        stmt.setInt(2, turnito.getTurno().getIdTurno());


        stmt.executeUpdate();
        System.out.println("---DETALLE TURNO ACTUALIZADO--\n");
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("---FALLA EN LA ACTUALIZACION---\n");
        }
    }

    public void Cancelar_Turno(Agenda turnito){
        String sql = "UPDATE DETALLE_TURNO SET ESTADOTURNO=? WHERE TURNO_IDTURNO=? ";
        try (
        Connection conexion = new AccesoDatos().getConexion();
        PreparedStatement stmt = conexion.prepareStatement(sql)) 
    {

        // Asignar los parametros en la consulta
        stmt.setString(1, "CANCELADO");
        stmt.setInt(2, turnito.getTurno().getIdTurno());


        stmt.executeUpdate();
        System.out.println("---DETALLE TURNO ACTUALIZADO--\n");
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("---FALLA EN LA ACTUALIZACION---\n");
        }
    }
}