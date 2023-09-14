// Classe para cálculo do IPI
class IPI {
    private static final double ALIQUOTA = 0.25;

    public static double calcular(OperacaoComercial operacao) {
        if (operacao instanceof Produto) {
            return operacao.getValor() * ALIQUOTA;
        } else {
            return 0.0;
        }
    }
}