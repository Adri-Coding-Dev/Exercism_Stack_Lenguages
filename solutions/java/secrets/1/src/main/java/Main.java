public class Main {
    public static void main(String[] args){
        int numero = 12345; // Ejemplo
        int otroNumero = 123123;
        for (int i = 0; i < 32; i++) {
            // Desplaza el número 'i' posiciones a la derecha y hace AND con 1
            int bit = (numero >> i) & (otroNumero >> i);
            System.out.print(bit);
        }
    }
}
