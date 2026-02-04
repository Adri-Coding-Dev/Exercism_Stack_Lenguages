/**
 * MISION: Desarrollar un metodo para sumar, multiplicar y dividir dos numeros y lanzar excepciones en caso de error
 */
class CalculatorConundrum {
    Throwable ArithmeticException = null;
    /**
     * Metodo para calular suma, multiplicacion o division
     * @param operand1 -> Numero 1 a calcular
     * @param operand2 -> Numero 2 a calcular
     * @param operation -> Tipo de operacion ["+","*","/"]
     * @return -> Cadena resultante = "<operand1> <operation> <operand2> = <Resultado>"
     */
    public String calculate(int operand1, int operand2, String operation) {
        //Lanzar excepciones
        /* - Cuando operation es nullo
         * - Cuando operacion esta vacio
         * - Cuando operacion no es ni suma ni multiplicacion ni division
         * - Cuando se divide entre 0
         */

        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else{
            try {
                //El operador es valido
                switch (operation) {
                    case "+":
                        return operand1 + " " + operation + " " + operand2 + " = " + (operand1 + operand2);
                    case "*":
                        return operand1 + " " + operation + " " + operand2 + " = " + (operand1 * operand2);
                    case "/":
                        return operand1 + " " + operation + " " + operand2 + " = " + (operand1 / operand2);
                    default:
                        throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                }
            }catch(ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        }
    }
}
