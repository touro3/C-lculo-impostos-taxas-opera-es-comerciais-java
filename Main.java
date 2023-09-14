 import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        Produto produto = new Produto("Produto A", 100.0);
        Servico servico = new Servico("Serviço B", 200.0);

        double issProduto = ISS.calcular(produto);
        double icmsProduto = ICMS.calcular(produto);
        double ipiProduto = IPI.calcular(produto);

        double issServico = ISS.calcular(servico);
        double icmsServico = ICMS.calcular(servico);
        double ipiServico = IPI.calcular(servico);

        double totalProduto = produto.getValor() + issProduto + icmsProduto + ipiProduto;
        double totalServico = servico.getValor() + issServico + icmsServico + ipiServico;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Detalhes da Operação Comercial - Produto:");
        System.out.println("Preço original do produto: R$ " + df.format(produto.getValor()));
        System.out.println("ISS: R$ " + df.format(issProduto));
        System.out.println("ICMS: R$ " + df.format(icmsProduto));
        System.out.println("IPI: R$ " + df.format(ipiProduto));
        System.out.println("Total: R$ " + df.format(totalProduto));

        System.out.println("\nDetalhes da Operação Comercial - Serviço:");
        System.out.println("Preço original do serviço: R$ " + df.format(servico.getValor()));
        System.out.println("ISS: R$ " + df.format(issServico));
        System.out.println("ICMS: R$ " + df.format(icmsServico));
        System.out.println("IPI: R$ " + df.format(ipiServico));
        System.out.println("Total: R$ " + df.format(totalServico));
    }
}
