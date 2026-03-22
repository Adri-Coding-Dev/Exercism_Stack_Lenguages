import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        //Cards -> Set(SIN DUPLICADOS)
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        if(collection.contains(card)){
            return false;
        }else{
            collection.add(card);
            return true;
        }
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return (!theirCollection.containsAll(myCollection) && !myCollection.containsAll(theirCollection));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> primeraLista = collections.get(0);
        if(collections.size() > 1) {
            Set<String> segundaLista = collections.get(1);
            Set<String> repetidos = new HashSet<>(primeraLista);
            repetidos.retainAll(segundaLista);
            for (int i = 3; i < collections.size(); i++) {
                Set<String> siguienteLista = collections.get(i);
                repetidos.retainAll(siguienteLista);
            }
            return repetidos;
        }else{
            return primeraLista;
        }
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> todasTarjetas = new HashSet<>();
        for(Set<String> lista : collections){
            todasTarjetas.addAll(lista);
        }
        return todasTarjetas;
    }
}
