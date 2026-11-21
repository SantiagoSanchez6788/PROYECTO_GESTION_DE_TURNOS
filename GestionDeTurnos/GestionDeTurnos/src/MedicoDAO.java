import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicoDAO {
    public static void mostrarMedicos(Medico ARRM[]){
    	//Objeto para ejecutar la consulta en la base de datos
    	AccesoDatos accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
	
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query =  
                        "select medico.idMedico AS NumeroMedico , \n" + 
                        "persona.nombre AS Medico , \n" + //
                        "persona.apellido AS Apellido_Medico , \n" + //
                        "especialidad.descripcion AS especialidad \n" + //
                        "from Persona inner join Medico on idPersona = Persona_idPersona \n" + //
                        "inner join posee on idMedico = Medico_idMedico \n" +
                        "inner join Especialidad on idEspecialidad = Especialidad_idEspecialidad \n" ;
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoDatos();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
            
            //Ejecuta la consulta y almacena el resultado en rs
            rs  = sentencia.executeQuery(query);
            int count=0;
            
            // Procesa el resultSet y muestra la informacion obtenida desde la BD
            while(rs.next()){
            		System.out.println("Numero del Medico: " + rs.getInt("NumeroMedico")+"\n"+
                        "Medico: " + rs.getString("Medico")+ " " +
                    rs.getString("Apellido_Medico") + " Especialidad: " + rs.getString("especialidad"));  
                    Medico medico =new Medico();
                    medico.setIdMedico(rs.getInt("NumeroMedico"));      
                    medico.setNombre(rs.getString("Medico"));
                    medico.setApellido(rs.getString("Apellido_Medico"));
                    ARRM[count]=medico;
                    count++;
                		}    
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
        }
       finally
        {
        	try
        	{
        		// Cierra el ResultSet
        		if (rs!= null) rs.close();
        		// Cierra la sentencia
        		if (sentencia!= null) sentencia.close();
        		// Cierra la conexion
        		if (con != null) con.close();
        		
        	}catch (SQLException e)
        	{
        		System.err.println("Error al cerrar conexion");
        	}
        }
	}
        
}
