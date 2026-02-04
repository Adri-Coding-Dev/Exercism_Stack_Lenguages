import java.util.HashMap;

class SqueakyClean {
    /**
     * MISION: Formateador de cadenas de texto
     * Dada una cadena de texto no Nula:
     * 1.- Remplazar espacios blancos por guiones bajos
     * 2.- Convertir kebab-case a camelCase
     * 3.- Convertir leetspeak a texto normal
     * 4.- Omitir caracteres que no sean letras
     */

    /**
     * Metodo para formatear una cadena de texto
     * @param identifier -> Cadena sin formatear
     * @return -> Cadena formateada
     */
    static String clean(String identifier) {

        // 1.- Reemplazar espacios por guiones bajos
        identifier = identifier.replace(" ", "_");

        // 2.- Convertir kebab-case a camelCase
        while(identifier.contains("-")) {
            int idx = identifier.indexOf('-');
            if(idx < identifier.length() - 1) {
                char next = Character.toUpperCase(identifier.charAt(idx + 1));
                identifier = identifier.substring(0, idx) + next + identifier.substring(idx + 2);
            } else {
                // guion al final, solo lo eliminamos
                identifier = identifier.substring(0, idx);
            }
        }

        // 3.- Convertir leetspeak a texto normal
        HashMap<Character, Character> traduccion = new HashMap<>();
        traduccion.put('4', 'a');
        traduccion.put('3', 'e');
        traduccion.put('0', 'o');
        traduccion.put('1', 'l');
        traduccion.put('7', 't');

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < identifier.length(); i++){
            char c = identifier.charAt(i);
            if(traduccion.containsKey(c)){
                sb.append(traduccion.get(c));
            } else {
                sb.append(c);
            }
        }

        // 4.- Omitir caracteres que no sean letras ni guion bajo
        StringBuilder clean = new StringBuilder();
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(Character.isAlphabetic(c) || c == '_'){
                clean.append(c);
            }
        }

        return clean.toString();
    }
}
