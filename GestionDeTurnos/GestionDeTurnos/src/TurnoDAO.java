import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public class TurnoDAO{

    public static void mostrarTurnosBD(int id,Turno ARR[]){
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoDatos accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
	
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query =  
                        "select idTurno, \n" + //
                        "horaInicio , \n" + //
                        "horaFinal, \n" + //
                        "fecha, \n" + //
                        "nombre as Medico \n" + //
                        "from Turno inner join Detalle_turno on idTurno = Turno_idTurno \n" + //
                        "inner join Medico on Medico_idMedico = idMedico \n" +
                        "inner join Persona on Persona_idPersona = idPersona \n" +
                        "where estadoTurno = 'disponible' and idMedico = "+id+"";
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        // Tomi hola
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
            	
            		int idTurno = rs.getInt("idTurno");
            		System.out.println("Turno n°: " + String.valueOf(idTurno)+"\n"+
                    "Hora de Inicio: " + rs.getString("horaInicio") + " Hora de Finalizacion: " + rs.getString("horaFinal")+"\n"+
                    "Fecha: " + rs.getString("Fecha")+ "\n"+
                    "Profecional: " + rs.getString("Medico"));
                    Turno turnito= new Turno();
                    turnito.setIdTurno(idTurno);
                    turnito.setHoraInicio(rs.getString("horaInicio"));
                    turnito.setHoraFinal(rs.getString("horaFinal"));
                    turnito.setFecha(rs.getString("Fecha"));
                    ARR[count]=turnito;
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

    public static void mostrarTurnosPaciente(int id){
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoDatos accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
	
        
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query =  
                        "SELECT idTurno, \n" + //
                        "agendar.fecha, \n" + //
                        "horaInicio, \n" + //
                        "horaFinal, \n" + //
                        "estadoTurno, \n" + //
                        "PM.nombre AS NombreMedico,\n" + //
                        "PM.apellido AS ApellidoMedico \n" + //
                        "from Paciente  \n"+
                        "JOIN persona ON persona.idPersona = paciente.persona_idPersona\n"+
                        "join agendar on idPaciente = paciente_idPaciente \n" +
                        "join Turno on turno.idTurno = agendar.turno_idTurno \n" +
                        "join detalle_turno on detalle_turno.Turno_idTurno = idTurno \n" +
                        "join medico on idMedico = medico_idMedico \n" + 
                        "inner join Persona PM on PM.idpersona = medico.persona_idPersona \n" +
                        "where estadoTurno = 'RESERVADO' and idPaciente = "+id+"";
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        // Tomi hola
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoDatos();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.createStatement();

            //Ejecuta la consulta y almacena el resultado en rs
            rs  = sentencia.executeQuery(query);
            
            // Procesa el resultSet y muestra la informacion obtenida desde la BD
            while(rs.next()){
            	
            		int idTurno = rs.getInt("turno.idTurno");
            		System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|\n" +
                    "Turno n°: " + String.valueOf(idTurno)+"\n"+
                    "Fecha: " + rs.getString("fecha") +"\n"+ 
                    "Hora de inicio: " + rs.getString("horaInicio") +"\n"+
                    "Hora de Finalizacion: " + rs.getString("horaFinal")+"\n"+
                    "Profesional: " + rs.getString("NombreMedico")+" "+ rs.getString("ApellidoMedico"));        	         		         			
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