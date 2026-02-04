/**
 * MISION: cada tipo de Accion solo se puede llevar a cabo si una o mas condiciones se cumple.
 * Desarrollar los metodos que definen si se puede o no tomar accion
 */
class AnnalynsInfiltration {
    /**
     * Metodo para ataque rapido -> Si el caballero está dormido SI se puede realizar el ataque rapido
     * @param knightIsAwake -> Estado del caballero (TRUE -> Despierto | FALSE -> Dormido)
     * @return -> SI se puede o no realizar el ataque
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    /**
     * Metodo para espiar -> Si alguno de los tres está despierto (caballero, arquero, prisionero), se puede
     * @param knightIsAwake -> Estado del caballero (TRUE -> Despierto | FALSE -> Dormido)
     * @param archerIsAwake -> Estado del arquero (TRUE -> Despierto | FALSE -> Dormido)
     * @param prisonerIsAwake -> Estado del prisionero (TRUE -> Despierto | FALSE -> Dormido)
     * @return -> Si se puede espiar o no
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    /**
     * Metodo para Señalizar al prisionero -> Si prisionero está despierto Y arquero durmiendo
     * @param archerIsAwake -> Estado del arquero (TRUE -> Despierto | FALSE -> Dormido)
     * @param prisonerIsAwake -> Estado del prisionero (TRUE -> Despierto | FALSE -> Dormido)
     * @return -> Si se puede avisar o no
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    /**
     * Metodo para liberar al prisionero -> Exito de dos formas:
     * 1.-> Tiene perro Y arquero dormido
     * 2.-> No tiene perro Y prisionero despierto Y arquero dormido Y caballero dormido
     * @param knightIsAwake -> Estado del caballero (TRUE -> Despierto | FALSE -> Dormido)
     * @param archerIsAwake -> Estado del arquero (TRUE -> Despierto | FALSE -> Dormido)
     * @param prisonerIsAwake -> Estado del prisionero (TRUE -> Despierto | FALSE -> Dormido)
     * @param petDogIsPresent -> Esta el perro o no
     * @return -> Si se puede liberar al prisionero
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake)||(!petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake);
    }
}
