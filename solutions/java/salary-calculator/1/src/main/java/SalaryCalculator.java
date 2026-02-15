/**
 * OBJETIVO: Implementar los metodos necesarios para poder calcular el salario total de un empleado
 */

public class SalaryCalculator {
    /**
     * METODO para aplicar una sancion dependiendo de la cantidad de dias que un empleado se salta el trabajo
     * @param daysSkipped -> Numero de dias que el trabajador se salta el trabajo
     * @return -> penalizacion aplicada (1.0 Si no falta menos de 5 dias | 0.85 si falta 5 o mas dias)
     */
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salarioBase = 1000.00;
        double salaryMultiplier = salaryMultiplier(daysSkipped);
        double bonusTotal = bonusForProductsSold(productsSold);
        salarioBase *= salaryMultiplier;
        return Math.min((salarioBase + bonusTotal), 2000.00);
    } 
}
