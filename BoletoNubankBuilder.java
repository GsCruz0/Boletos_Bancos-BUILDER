public class BoletoBancoBrasilBuilder extends BoletoBuilder {

    public void buildBeneficiario() {
        boleto.nomeBeneficiario = "Empresa BB";
        boleto.cpfCnpjBeneficiario = "22.222.222/0001-22";
        boleto.enderecoBeneficiario = "DF";
    }

    public void buildSacado() {
        boleto.nomeSacado = "Carlos Lima";
        boleto.cpfCnpjSacado = "333.333.333-33";
        boleto.enderecoSacado = "MG";
    }

    public void buildTitulo() {
        boleto.numeroDocumento = "789";
        boleto.dataVencimento = "30/04/2026";
        boleto.valor = 300.50;
    }

    public void buildBanco() {
        boleto.banco = "Banco do Brasil";
        boleto.agencia = "1111";
        boleto.conta = "99999";
        boleto.carteira = "18";
    }
}
