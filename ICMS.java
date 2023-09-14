// Classe para cálculo do ICMS
class ICMS {
    private static final double ALIQUOTA = 0.17;

    public static double calcular(OperacaoComercial operacao) {
        if (operacao instanceof Produto || operacao instanceof Servico) {
            return operacao.getValor() * ALIQUOTA;
        } else {
            return 0.0;
        }
    }
}