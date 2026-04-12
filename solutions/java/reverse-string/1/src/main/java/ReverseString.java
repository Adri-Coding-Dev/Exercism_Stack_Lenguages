class ReverseString {

    String reverse(String inputString) {
        if(inputString.length() > 0) {
            String reverseInputString = "";
            for (int i = inputString.length() - 1; i >= 0; i--) {
                char caracter = inputString.charAt(i);
                reverseInputString += String.valueOf(caracter);
            }
            return reverseInputString;
        }else{
            return inputString;
        }
    }
  
}
