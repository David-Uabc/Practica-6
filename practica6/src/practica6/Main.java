package practica6;

public class Main {
	
	    public static void main(String[] args){
        Torneo torneo  = new Torneo("Grandes ligas NBA Mexico", "MEXICO", 5, 12,25);// relleno con la liga(yo la puse como el torneo tambien) region asi como los quipos que estaran y ademas
        //los partidos judados y faltantes
        torneo.addEquipos();
        System.out.println("\n");
        torneo.datosTorneo();
    }
	
}
