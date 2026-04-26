import java.util.List;

class ResistorColorTrio {
    List<String> colores = List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
    String label(String[] colors) {
        String color1 = colors[0];
        String color2 = colors[1];
        String color3 = colors[2];
        int numeroColor1 = colores.indexOf(color1);
        int numeroColor2 = colores.indexOf(color2);
        int multiplicador = colores.indexOf(color3);

        long resistenciaTotal = (long) ((numeroColor1 * 10 + numeroColor2) * Math.pow(10, multiplicador));
        String prefijoMetrico;

        if (resistenciaTotal >= 1_000_000_000) {
            prefijoMetrico = "gigaohms";
            resistenciaTotal /= 1_000_000_000;
        }else if(resistenciaTotal >= 1_000_000){
            prefijoMetrico = "megaohms";
            resistenciaTotal /= 1_000_000;
        } else if (resistenciaTotal >= 1_000) {
            prefijoMetrico = "kiloohms";
            resistenciaTotal /= 1_000;
        } else{
            prefijoMetrico = "ohms";
        }

        return resistenciaTotal + " " + prefijoMetrico;
    }
}
