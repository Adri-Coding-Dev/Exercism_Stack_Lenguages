class ResistorColorDuo {
    static int resultado = 0;
    static int cantidadCifra = 1;
    int value(String[] colors) {
        String colorActual = colors[0];
        agregarCifra(colorActual);
        colorActual = colors[1];
        agregarCifra(colorActual);

        return resultado;
    }

    private void agregarCifra(String colorActual) {
        switch (colorActual){
            case "black":
                break;
            case "brown":
                resultado += (int) Math.pow(10, cantidadCifra);
                break;
            case "red":
                resultado += (int) (Math.pow(10, cantidadCifra) * 2);
                break;
            case "orange":
                resultado += (int) Math.pow(10, cantidadCifra) * 3;
                break;
            case "yellow":
                resultado += (int) Math.pow(10, cantidadCifra) * 4;
            break;
            case "green":
                resultado += (int) Math.pow(10, cantidadCifra) * 5;
            break;
            case "blue":
                resultado += (int) Math.pow(10, cantidadCifra) * 6;
            break;
            case "violet":
                resultado += (int) Math.pow(10, cantidadCifra) * 7;
            break;
            case "grey":
                resultado += (int) Math.pow(10, cantidadCifra) * 8;
            break;
            case "white":
                resultado += (int) Math.pow(10, cantidadCifra) * 9;
            break;
        }
        cantidadCifra --;
    }
}
