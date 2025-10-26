public class Divisao implements Operacao{
    @Override
    public double calcular(double numero1, double numero2) {
        if (numero2 == 0) {
            return Double.NaN;
        }
        return numero1 / numero2;
    }
}
