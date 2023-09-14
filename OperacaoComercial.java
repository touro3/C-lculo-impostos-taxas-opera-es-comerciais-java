// Classe base para operações comerciais
class OperacaoComercial {
    private String descricao;
    private double valor;

    public OperacaoComercial(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return descricao + ": R$ " + valor;
    }
}