package practica6;


public class Jugador{
	
    int Numcamisa; 
    int puntosAnotados;
    float estatura;
    String nombreJugador;
    String posicion;
    
    
    public Jugador(int Numcamisa, int puntosAnotados, float estatura, String nombreJugador, String posicion){
        this.Numcamisa = Numcamisa;
        this.puntosAnotados = puntosAnotados;
        this.estatura = estatura;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
    }
    
    //getters que utilizare para accder a estos datos
    public String getNombre(){
        return nombreJugador;
    }
    public int getnumCamisa(){
        return Numcamisa;
    }
    public float getEstatura(){
        return estatura;
    }
    public String getPos(){
        return posicion;
    }
    public int getPuntos(){
        return puntosAnotados;
    }
}
   