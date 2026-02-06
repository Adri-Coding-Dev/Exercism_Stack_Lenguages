public class ExperimentalRemoteControlCar implements RemoteControlCar{

    private int distanciaRecorrida = 0;

    @Override
    public void drive() {
        this.distanciaRecorrida += 20;//El coche en experimentos recorre 20 unidades
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanciaRecorrida;
    }
}
