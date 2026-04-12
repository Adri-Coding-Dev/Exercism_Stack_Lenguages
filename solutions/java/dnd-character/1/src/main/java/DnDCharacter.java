import java.util.ArrayList;
import java.util.List;

class DnDCharacter {

    int ability(List<Integer> scores) {
        int suma = 0;
        int min = scores.get(0);
        for(int n : scores){
            suma +=n;
            if(n < min){
                min = n;
            }
        }
        return suma - min;
    }

    List<Integer> rollDice() { //Rodar Dados
        List<Integer> listaTiradas = new ArrayList<>();
        for(int i = 0; i < 4; i ++){
            int tirada = tirarDado();
            listaTiradas.add(tirada);
        }
        return listaTiradas;
    }

    private static int tirarDado(){
        return (int) Math.round(Math.random()*(6 - 1) + 1);
    }

    int modifier(int constitucion) {
        if(constitucion - 10 < 0){
            return (constitucion - 10) / 2 +1;
        }else {
            return (constitucion - 10) / 2;
        }
    }

    int getStrength() {
        return sumaTresMayores(tirarDado(), tirarDado(), tirarDado(), tirarDado());
    }

    int getDexterity() {
        return sumaTresMayores(tirarDado(), tirarDado(), tirarDado(), tirarDado());
    }

    int getConstitution() {
        return sumaTresMayores(tirarDado(), tirarDado(), tirarDado(), tirarDado());
    }

    int getIntelligence() {
        return sumaTresMayores(tirarDado(), tirarDado(), tirarDado(), tirarDado());
    }

    int getWisdom() {
        return sumaTresMayores(tirarDado(), tirarDado(), tirarDado(), tirarDado());
    }

    int getCharisma() {
        return sumaTresMayores(tirarDado(), tirarDado(), tirarDado(), tirarDado());
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    private static int sumaTresMayores(int tirada1, int tirada2, int tirada3, int tirada4){
        int tiradaMinima = Math.min(tirada1, Math.min(tirada2, Math.min(tirada3, tirada4)));
        if(tiradaMinima == tirada1){
            return tirada2 + tirada3 + tirada4;
        }else if(tiradaMinima == tirada2){
            return tirada1 + tirada3 + tirada4;
        } else if (tiradaMinima == tirada3) {
            return tirada1 + tirada2 + tirada4;
        }else{
            return tirada1 + tirada2 + tirada3;
        }
    }
}
