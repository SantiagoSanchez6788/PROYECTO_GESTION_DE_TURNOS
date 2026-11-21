import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Paciente paciente= new Paciente();
        Telefono tel= new Telefono();
        Turno turno =new Turno();
        paciente.setNombre("Gustavo");
        paciente.setApellido("Di Martino");
        paciente.setIdPersona(1);
        paciente.setDni("27.313.134");
        paciente.setEmail("GustiDj123@gmail.com.ar");
        paciente.setTelefonoDePersona(tel);
        paciente.setHistoriaClinica("Gripe");
        paciente.setIdPaciente(1);
        Agenda turnito=new Agenda();
        AgendarDAO agendarTurno= new AgendarDAO();
        
        int op = 0;
        Scanner teclado= new Scanner(System.in);
        Medico [] arrMedico= new Medico[3];
        Turno [] arrTurno= new Turno[6];

        while(op != 3){
            System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
            System.out.println("|-=-                       TURNOS MEDICOS                      -=-|");
            System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
            System.out.println("|- == Opción N°1: Agendar turno:                                  |");
            System.out.println("|- == Opción N°2: Mostrar turnos reservados por el paciente:      |");
            System.out.println("|- == Opción N°3: Salir del turnero.                              |");
            System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");

            op= teclado.nextInt();
            switch (op) {
                case 1:
                     System.out.println("|- == Opción N°1 Elegído \n");
                     MedicoDAO.mostrarMedicos(arrMedico);
                     System.out.println("|- - Ingrese el N° del profesional por el cual desea atenderse: ");
                     int med= teclado.nextInt();
                     int result= validarMedico(med, arrMedico);
                     if (result == 1){
                        TurnoDAO.mostrarTurnosBD(med,arrTurno);
                        System.out.println("|- - Ingrese el turno que quiera agendar: ");
                        int tur= teclado.nextInt();
                     int result2=ValidarTurno(tur,arrTurno);
                        if(result2==1){
                        turno.setIdTurno(tur);
                        turnito.setEstado("Confirmado");
                        turnito.setPaciente(paciente);
                        turnito.setTurno(turno);

                        agendarTurno.Agendar_Turno(turnito);
                        agendarTurno.actualizar_Turno(turnito);

                        }else{
                            System.out.println("Turno no existente");
                        }

                     }else{
                        System.out.println("ERROR:El medico seleccionado no existe.");

                     }
    

                    break;
                case 2:
                    System.out.println("|- == Opción N°2 Elegído \n");
    
                    TurnoDAO.mostrarTurnosPaciente(1);
                    break;
                case 3:
                    System.out.println("|- == Opción N°3 Elegído \n");
                    break;
                default:
                    System.out.println("|- == Opcion no valida.\n Ingrese una opcion valida\n");
                    break;
            }

        }
        teclado.close();
        System.out.println("|- == Cierre de Programa. == -|");
    }



    public static int validarMedico(int op, Medico arr[]){
        int val=0;
        for (Medico p : arr){

           if (p!=null & op == p.getIdMedico()){
                val=1;
                return val;
              };

            }
        return val;
    }

   public static int ValidarTurno(int op, Turno arr[]){
    int val=0;

    for(Turno t: arr){    

    
        if( t !=null && op==t.getIdTurno()){
            val=1;
            return val;
            };
        }
    
    return val;
   }
}
