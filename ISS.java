// Classe para cálculo do ISS
class ISS {
    private static final double ALIQUOTA = 0.046;

    public static double calcular(OperacaoComercial operacao) {
        if (operacao instanceof Servico) {
            return operacao.getValor() * ALIQUOTA;
        } else {
            return 0.0;
        }
    }
}