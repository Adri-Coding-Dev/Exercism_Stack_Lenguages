public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public static String describe(Character personaje){
        return "You're a level " + personaje.getLevel() + " " + personaje.getCharacterClass() + " with " + personaje.getHitPoints() + " hit points.";
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public static String describe(Destination destino){
        return "You've arrived at " + destino.getName() + ", which has " + destino.getInhabitants() + " inhabitants.";
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public static String describe(TravelMethod metodoTransporte){
        switch (metodoTransporte){
            case WALKING: return "You're traveling to your destination by walking.";
            case HORSEBACK: return "You're traveling to your destination on horseback.";
            default: return null;
        }
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public static String describe(Character personaje,Destination destino, TravelMethod metodoTransporte){
        return describe(personaje) + " " + describe(metodoTransporte) + " " + describe(destino);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public static String describe(Character personaje, Destination destino){
        return describe(personaje) + " " + describe(TravelMethod.WALKING) + " " + describe(destino);
    }
}
