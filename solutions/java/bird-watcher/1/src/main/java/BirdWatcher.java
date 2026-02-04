/**
 * MISION: Desarrollar los metodos para trabajar con el número de aves vistas en una semana
 */
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    /**
     * Metodo para Comprobar los conteos de la semana pasada
     * @return -> Array con el conteo de aves de la semana pasada
     */
    public int[] getLastWeek() {
        return birdsPerDay;
    }

    /**
     * Metodo para comprobar cuantas aves visitaron hoy -> Último elemento
     * @return -> Numero de aves vistas hoy
     */
    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1]; //Ultimo elemento
    }

    /**
     * Metodo para incrementar el conteo de hoy
     */
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1]++;
    }

    /**
     * Metodo para comprobar si hubo un dia sin aves
     * @return -> Si hubo algun dia sin aves (0)
     */
    public boolean hasDayWithoutBirds() {
        for(int i = 0;i < birdsPerDay.length; i++){
            if(birdsPerDay[i]==0) return true;
        }
        return false;
    }

    /**
     * Metodo para calcular el número de aves de los primeros dìas
     * @param numberOfDays -> Numero de dias de suma
     * @return -> Suma total de aves vistas
     */
    public int getCountForFirstDays(int numberOfDays) {
        int dias = Math.min(numberOfDays, birdsPerDay.length);//En caso de que numberOfDays sea mayor de 7, salta Out of Bound
        int suma = 0;
        for(int i=0;i<dias;i++){
            suma += birdsPerDay[i];
        }

        return suma;
    }

    /**
     * Metodo para calcular el numero de dias ocupados -> 5 aves o mas
     * @return -> Numero de dias donde se avistaron 5 o mas aves
     */
    public int getBusyDays() {
        int diasOcupados = 0;
        for(int i = 0;i < birdsPerDay.length; i++){
            if(birdsPerDay[i]>=5){
                diasOcupados ++;
            }
        }
        return diasOcupados;
    }
}
