/**
 * MISION: Desarrollar metodos que implementara una clase coche
 * - Los coches empiezan con 100 de bateria
 * - Cada conduccion -> 20 Metros && -1 de Bateria
 *
 * PANTAllA LED:
 * - Distancia recorrida
 * - Porcentaje de bateria
 *
 * Sin bateria no se puede conducir
 */

public class JedliksToyCar {
    //ATRIBUTOS
    private  int distanciaRecorrida = 0;
    private  int bateria = 100;

    public JedliksToyCar(){}

    public JedliksToyCar(int distanciaRecorrida, int bateria){
        this.distanciaRecorrida = distanciaRecorrida;
        this.bateria = bateria;
    }

    //GETTERS && SETTERS
    public int getDistanciaRecorrida(){
        return this.distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida){
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getBateria(){
        return this.bateria;
    }

    public void setBateria(int bateria){
        this.bateria = bateria;
    }

    /**
     * Metodo para comprar un coche
     * @return -> Una instancia del coche
     */
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    /**
     * Metodo para mostrar la distancia recorrida (al iniciar la instancia, la distancia es 0)
     * @return -> Distancia recorrida
     */
    public String distanceDisplay() {
        return "Driven " + getDistanciaRecorrida() + " meters";
    }

    /**
     * Metodo para mostrar el porcentaje de la bateria
     * @return -> Porcentaje de bateria
     */
    public String batteryDisplay() {
        if(this.bateria>0) {
            return "Battery at " + getBateria() + "%";
        }else{
            return "Battery empty";
        }
    }

    /**
     * Metodo conducir donde se alteran las variables
     */
    public void drive() {
        if(this.bateria>0) {
            setDistanciaRecorrida(this.distanciaRecorrida + 20); //Cada vez que se conduzca, avanzamos 20 metros
            setBateria(this.bateria - 1); //Cada vez que se conduzca, bajamos la bateria
        }
    }
}
