package practica6;

import java.util.ArrayList;

public class Equipo {
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
    String nomEquipo; 
    String division;
    String nombreEntrenador;
    int torneosParticipados;
    int torneosGanados; 
    int torneosPerdidos;
    
    
    public Equipo(String nomEquipo, String division, String nomEntrenador, int torneosParticipados,int torneosGanados, int torneosPerdidos){
        this.nomEquipo = nomEquipo;
        this.nombreEntrenador = nomEntrenador;
        this.division = division;
        this.torneosParticipados = torneosParticipados;
        this.torneosPerdidos = torneosPerdidos;
        this.torneosGanados = torneosGanados;
    }
    
    
    int cantJugadores = 10;
    
    
    public void addJugadores(){
        String nomJugador;
        String posicion;
        int Numcamisa;
        int puntosAnotados;
        float estatura;
        
        int i = 1;
        int terminar = 1;  // auxiliares para bucles
        int aux = -1;
        
        while(i < 11){
        	//bucle por si se equivocan a la hora de ingresar datos
            do{ 
                nomJugador = CapturaEntrada.capturarCadena("Nombre del jugador "+i);
                posicion = CapturaEntrada.capturarCadena("Posicion del jugador");
                Numcamisa = CapturaEntrada.capturarEntero("Numero de camisa del jugador");
                puntosAnotados = CapturaEntrada.capturarEntero("Puntos anotados por ese jugador");
                estatura = CapturaEntrada.capturarFlotante("Estatura");
                
                //condicion de error
                if((estatura < 0) || (estatura > 4)||(puntosAnotados < 0)||(Numcamisa < 0)) System.out.println("Error, ingrese un valor permitido.");
                else terminar = 0;
                if(Numcamisa == aux){System.out.println("El numero de camisa esta elejido ya"); terminar = 1;}
                else aux = Numcamisa;

                String auxiliarNombre = nomJugador;
                for(Jugador j:jugadores){
                    if(j.getNombre().equals(auxiliarNombre)){
                        System.out.println("No se puede repetir el jugador o estar en diferentes equipos");
                        terminar = 1;
                    }
                    else auxiliarNombre = j.getNombre();
                }

            }while(terminar != 0);
            terminar = 1;
            i++;
            Jugador nuevoJugador = new Jugador(Numcamisa, puntosAnotados, estatura, nomJugador, posicion);
            jugadores.add(nuevoJugador);
        }
    }
    
    //los puntos totales de sumar al final este meto se encarga de esto
    public int puntosT(){
        int puntosT = 0;
        for(int i = 0; i < jugadores.size();i++){
            puntosT += jugadores.get(i).getPuntos();
        }
        return puntosT;
    }
    
    //muestreo en pantalla de los datos del jugardor y los equipos estos metodos se encargand de esto
    public void mostrarJugadores(){
        System.out.println("Nombre ---- Numero de Camisa del jugador");
        for(int i = 0; i < jugadores.size(); i++){
            System.out.println(jugadores.get(i).getNombre()+":"+jugadores.get(i).getnumCamisa());
        }
    }
    
    public void datosEquipo(){
        System.out.println(nomEquipo +","+division);
    }
    public String getnomEquipo(){
        return nomEquipo;
    }
    
    public String getnomEntrenador(){
        return nombreEntrenador;
        }
    
    public String getDivisionEquipo(){
    	return division;
    }
    
    public int gettorneosParticipados(){
        return torneosParticipados;
    }
    
    public int gettorneosPerdidos(){
        return torneosPerdidos;
    }
    
    public int gettorneosGanados(){
        return torneosGanados;
    }
}
  