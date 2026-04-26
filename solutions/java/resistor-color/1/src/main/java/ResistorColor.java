import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    Map<String, Integer> mapaColores = new HashMap<>();
    /*
    Negro: 0
    Marrón: 1
    Rojo: 2
    Naranja: 3
    Amarillo: 4
    Verde: 5
    Azul: 6
    Violeta: 7
    Gris: 8
    Blanco: 9
     */
    int colorCode(String color) {
        switch (color){
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            case "white":
                return 9;
        }
        return 0;
    }

    String[] colors() {
        return new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    }
}
