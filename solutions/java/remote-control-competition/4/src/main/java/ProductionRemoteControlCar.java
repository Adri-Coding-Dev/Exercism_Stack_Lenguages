class ProductionRemoteControlCar implements RemoteControlCar, Comparable <ProductionRemoteControlCar>{

    private int distanciaRecorrida = 0;
    private int numeroVictorias;

    @Override
    public void drive() {
        this.distanciaRecorrida += 10; //El coche en produccion recorre 10 unidades
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanciaRecorrida;
    }

    public int getNumberOfVictories() {
        return this.numeroVictorias;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numeroVictorias = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(),this.getNumberOfVictories());
    }
}
