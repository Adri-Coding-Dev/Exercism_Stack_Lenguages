class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String resultado = "";
        for(int i = 0; i < phrase.length(); i ++){
            char c = phrase.charAt(i);
            if(i == 0 || this.isAcronymLetter(phrase.charAt(i), phrase.charAt(i - 1))){
                resultado += String.valueOf(c).toUpperCase();
            }
        }
        return resultado;
    }

    private boolean isAcronymLetter(char cCurrent, char prev){
        return Character.isLetter(cCurrent) &&
                (this.isDelimiter(prev) ||
                        Character.isUpperCase(cCurrent) &&
                                Character.isLowerCase(prev));
    }

    private boolean isDelimiter(char c){
        if(c == ' ' || c == '-' || c == '_'){
            return true;
        }
        return false;
    }

}
