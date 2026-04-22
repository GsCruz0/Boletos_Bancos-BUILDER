public class Boleto {
    String nomeBeneficiario;
    String cpfCnpjBeneficiario;
    String enderecoBeneficiario;

    String nomeSacado;
    String cpfCnpjSacado;
    String enderecoSacado;

    String numeroDocumento;
    String dataVencimento;
    double valor;

    String banco;
    String agencia;
    String conta;
    String carteira;

    String codigoBarras;
    String linhaDigitavel;

    public void mostrarBoleto() {
        System.out.println("Banco: " + banco);
        System.out.println("Beneficiário: " + nomeBeneficiario);
        System.out.println("Sacado: " + nomeSacado);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Vencimento: " + dataVencimento);
        System.out.println("Linha Digitável: " + linhaDigitavel);
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("---------------------------");
    }
}
