class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int numberLenght = String.valueOf(numberToCheck).length();
        int numeroCopia = numberToCheck;

        int resultado = 0;
        for(int i = 0; i < numberLenght; i ++){
            //153/10=15 153%10=3
            int cifra = numeroCopia % 10;
            numeroCopia /= 10;

            resultado += (int)Math.pow(cifra,numberLenght);
        }
        return resultado == numberToCheck;
    }

}
