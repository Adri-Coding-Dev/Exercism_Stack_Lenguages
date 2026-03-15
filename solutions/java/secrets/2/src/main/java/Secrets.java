public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        /**
         * Secrets.flipBits(0b1100, 0b0101);
         * # => 0b1001
         */
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & (~ mask);
    }
}