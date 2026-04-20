import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private final Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int min = 0, max = PLANET_CLASSES.length - 1;
        return PLANET_CLASSES[(int) Math.round(Math.random() * (max - min) + min)];
    }

    String randomShipRegistryNumber() {
        int min = 1000, max = 10000;
        return "NCC-" + (int) Math.round(Math.random() * (max - min) + min);
    }

    double randomStardate() {
        float min = 41000, max = 42000;
        return (Math.random() * (max - min) + min);
    }
}
