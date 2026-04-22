public class BoletoBradescoBuilder extends BoletoBuilder {

    public void buildBeneficiario() {
        boleto.nomeBeneficiario = "Empresa Bradesco";
        boleto.cpfCnpjBeneficiario = "11.111.111/0001-11";
        boleto.enderecoBeneficiario = "SP";
    }

    public void buildSacado() {
        boleto.nomeSacado = "Maria Souza";
        boleto.cpfCnpjSacado = "222.222.222-22";
        boleto.enderecoSacado = "RJ";
    }

    public void buildTitulo() {
        boleto.numeroDocumento = "456";
        boleto.dataVencimento = "25/04/2026";
        boleto.valor = 200.00;
    }

    public void buildBanco() {
        boleto.banco = "Bradesco";
        boleto.agencia = "2222";
        boleto.conta = "33333";
        boleto.carteira = "06";
    }
}
