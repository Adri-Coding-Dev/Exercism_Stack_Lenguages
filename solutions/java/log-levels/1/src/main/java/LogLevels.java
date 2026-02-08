import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
    /**
     * Metodo para devolver el mensaje de una lista de log:
     * [ERROR]: Invalid operation -> Invalid operation
     * @param logLine -> Linea sin formatear
     * @return -> Linea formateada
     */
    public static String message(String logLine) {
        String limpio = logLine.replaceFirst("^\\[.*?\\]\\s*:\\s*", "").trim();// Imprime: Stack overflow
        return limpio;
    }

    /**
     * Metodo para devolver el tipo de nivel del log
     * [ERROR]: Invalid operation -> error
     * @param logLine -> Linea sin formatear
     * @return -> Linea formateada
     */
    public static String logLevel(String logLine) {
            //REGEX: ^\[.*?\]\s*
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(logLine);

        if(matcher.find()){
            String resultado = matcher.group(1);
            return resultado.toLowerCase();
        }

        return null;
    }

    public static String reformat(String logLine) {
        String parte1 = message(logLine);
        String parte2 = logLevel(logLine);
        return parte1 +" (" + parte2 +")";
    }
}
