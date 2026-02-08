public class CarsAssemble {

    /**
     * Metodo para calcular la cantidad de coches producidos por hora (Restando por la tasa de exito):
     * 1-4 -> 100%
     * 5-8 -> 90%
     * 9 -> 80%
     * 10 -> 77%
     * @param speed -> Velocidad de la maquina (1-10)
     * @return -> Double produccion de la linea de ensamblaje
     */
    public double productionRatePerHour(int speed) {
        int cantidadCoches = speed*221; //221 coches/hora
        switch (speed){
            case 1,2,3,4:
                return (double) cantidadCoches;
            case 5,6,7,8:
                return (double) (cantidadCoches * 90) / 100;
            case 9:
                return (double) (cantidadCoches * 80) / 100;
            case 10:
                return (double) (cantidadCoches * 77) / 100;
        }
        return 0;
    }

    /**
     * Metodo para calcular la cantidad de coches funcionales por minuto
     * @param speed -> Velocidad de la maquina
     * @return -> Cantidad de items
     */
    public int workingItemsPerMinute(int speed) {
        double cantidadCochesMinuto = (double) 221 / 60;
        double cochesProducidos = cantidadCochesMinuto * speed;
        switch (speed){
            case 1,2,3,4:
                return (int) Math.ceil(cochesProducidos) -1;
            case 5,6,7,8:
                return (int) Math.ceil((cochesProducidos * 90) / 100) -1;
            case 9:
                return (int) Math.ceil((cochesProducidos * 80) / 100) -1;
            case 10:
                return (int) Math.ceil((cochesProducidos * 77) / 100) -1;
        }
        return 0;
    }
}
