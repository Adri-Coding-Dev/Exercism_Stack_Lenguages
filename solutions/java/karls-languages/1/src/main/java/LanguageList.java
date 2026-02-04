import java.util.ArrayList;
import java.util.List;

/**
 * MISION: Desarrollar metodos usando funciones internas de las listas (Lenguages de programacion)
 */
public class LanguageList {
    private final List<String> languages = new ArrayList<>(); //Lista con la que tendremos que trabajar

    /**
     * Metodo para saber si una lista esta vacia
     * @return -> Si la lista esta vacia o no
     */
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    /**
     * Metodo para añadir un lenguage a la lista
     * @param language -> Nombre del lenguage que vayamos a agregar
     */
    public void addLanguage(String language) {
        languages.add(language);
    }

    /**
     * Metodo para eliminar un lenguage
     * @param language -> Nombre del lenguage que queramos borrar
     */
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    /**
     * Metodo para devolver el primer lenguage de la lista
     * @return -> Nombre del lenguage que este en primera posicion
     */
    public String firstLanguage() {
        return languages.getFirst();
    }

    /**
     * Metodo para devolver la cantidad de elementos de la lista
     * @return -> Cantidad de elementos
     */
    public int count() {
        return languages.size();
    }

    /**
     * Metodo para determinar si un lenguage esta dentro de la lista
     * @param language -> Nombre del lenguage a buscar
     * @return -> Si se encuentra en la lista
     */
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    /**
     * Metodo para determinar si la lista es emocionante (Contiene Java o Kotlin)
     * @return -> Si la lista es emocionante o no
     */
    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
