public class BoletoItauBuilder extends BoletoBuilder {

    public void buildBeneficiario() {
        boleto.nomeBeneficiario = "Empresa Itaú";
        boleto.cpfCnpjBeneficiario = "00.000.000/0001-00";
        boleto.enderecoBeneficiario = "São Paulo";
    }

    public void buildSacado() {
        boleto.nomeSacado = "João Silva";
        boleto.cpfCnpjSacado = "111.111.111-11";
        boleto.enderecoSacado = "SP";
    }

    public void buildTitulo() {
        boleto.numeroDocumento = "123";
        boleto.dataVencimento = "20/04/2026";
        boleto.valor = 150.75;
    }

    public void buildBanco() {
        boleto.banco = "Itaú";
        boleto.agencia = "1234";
        boleto.conta = "56789";
        boleto.carteira = "109";
    }
}
