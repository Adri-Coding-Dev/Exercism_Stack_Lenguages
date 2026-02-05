import static java.lang.Math.ceil;

/**
 * MISION: Organizar carreras entre distintos tipos de coches teledirigidos
 */
class NeedForSpeed {
    int bateria;
    int speed;
    int batteryDrain;
    int distanciaRecorrida;

    /**
     * Crear constructor que reciba como parametro la velocidad y la bateria
     * @param speed -> Velocidad del coche
     * @param batteryDrain -> Bateria del coche
     */
    NeedForSpeed(int speed, int batteryDrain) {
        this.bateria = 100;
        this.distanciaRecorrida = 0;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.bateria<this.batteryDrain;
    }

    /**
     * Metodo para devolver la distancia recorrida
     * @return -> Distancia recorrida
     */
    public int distanceDriven() {
        return this.distanciaRecorrida;
    }

    /**
     * Metodo para conducir el coche -> Aumenta la distancia (velocidad)
     * Gasta bateria -> batteryDrain
     */
    public void drive() {
        if(this.bateria >= this.batteryDrain) {
            this.distanciaRecorrida += this.speed;
            this.bateria -= this.batteryDrain;
        }else{
            this.bateria = 0;
        }
    }

    public static NeedForSpeed nitro() {
      return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    /**
     * Crear constructor de pista de carreras
     * @param distance -> Longitud de la carrera
     */
    RaceTrack(int distance) {
        this.distance = distance;
    }

    /**
     * Metodo para determinar si un coche puede alcanzar la meta
     * @param car -> Coche a evaluar
     * @return -> si puede terminar la carrera o no
     */
    public boolean canFinishRace(NeedForSpeed car) {
        return ( (int) Math.ceil ( (double) this.distance / car.speed) * car.batteryDrain ) <= 100;
    }
}
