package practica6;


public class Jugador{
	
    int Numdorsal; 
    int puntosAnotados;
    float estatura;
    String nombreJugador;
    String posicion;
    
    
    public Jugador(int Numdorsal, int puntosAnotados, float estatura, String nombreJugador, String posicion){
        this.Numdorsal = Numdorsal;
        this.puntosAnotados = puntosAnotados;
        this.estatura = estatura;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
    }
    
    //getters que utilizare para accder a estos datos
    public String getNombre(){
        return nombreJugador;
    }
    public int getDorsal(){
        return Numdorsal;
    }
    public float getEstatura(){
        return estatura;
    }
    public String getPosicion(){
        return posicion;
    }
    public int getPuntos(){
        return puntosAnotados;
    }
}
   