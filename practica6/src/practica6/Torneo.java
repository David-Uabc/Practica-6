package practica6;
        

import java.util.ArrayList;

class Torneo{
    String nomTorneo; 
    String region;
    int numEquipos;
    int parJugados;
    int parPendientes;
    
    //COSTRUCTOR PARA PODER MANEJAR LOS EQUIPOS Y TORNEOS 
    public Torneo(String nomTorneo, String region, int numEquipos, int parPendientes,int parJugados){
        this.nomTorneo = nomTorneo;
        this.region = region;
        this.numEquipos = numEquipos;
        this.parPendientes = parPendientes;
        this.parJugados = parJugados;
    }
    		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    		int torneosPerdidos;
    		int torneosParticipados; 
    		int torneosGanados;
    		//captura de todos los datos de los equipos
    		public void agregarEquipos(){
    		int terminar = 1, numEquipos = 1; //ayuda para los bucles
    		while(numEquipos < 3){
            String nombreEquipo = CapturaEntrada.capturarCadena("Nombre del equipo");
            String division = CapturaEntrada.capturarCadena("Nombre de la division a la que pertenecen");
            String nombreEntrenador = CapturaEntrada.capturarCadena("Nombre del entrenador");
           
            
            //bucle para que vuelva apreguntar junto con el if si se equicovan con los torneos totales
            do{
                torneosParticipados = CapturaEntrada.capturarEntero("Cantidad de torneos jugados");
                torneosPerdidos = CapturaEntrada.capturarEntero("Cantidad de torneos perdidos");
                torneosGanados = CapturaEntrada.capturarEntero("Cantidad de torneos ganados");
                
                //condicion oara que vuelva a introducir si se quivoca con los torneos totales
                if(torneosParticipados != (torneosPerdidos + torneosGanados)) System.out.println("Los torneos no encajan");
                else terminar = 0;
            	}while(terminar!= 0);
            	numEquipos++;
            	
            	
            Equipo nuevoEquipo = new Equipo(nombreEquipo,division,nombreEntrenador,torneosParticipados, torneosPerdidos, torneosGanados);
            System.out.println("introduce los jugadores de tu equipo.");
            nuevoEquipo.agregarJugadores();
            equipos.add(nuevoEquipo);
        }
    }
    		
    		//captura los datos del torneo
    		
    	public void datosTorneo(){
        System.out.println("En el torneo "+nomTorneo+" hay "+numEquipos+" equipos  de la region "+region);
        System.out.println("Se han jugado "+parJugados+" partidos y quedan "+parPendientes+" pendientes");
        for(int i = 0; i < equipos.size(); i++){
        System.out.println("Equipo "+ (i+1)+": "+equipos.get(i).getnombreEquipo()+" - Puntos = "+equipos.get(i).puntosT()+" - Division = "+equipos.get(i).getDivision());
        equipos.get(i).mostrarJugadores();
        }
    }
}