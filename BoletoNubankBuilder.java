public class BoletoNubankBuilder extends BoletoBuilder {

    public void buildBanco() {
        boleto.banco = "Nubank";
    }

    public void buildValor() {
        boleto.valor = 200.00;
    }

    public void buildVencimento() {
        boleto.vencimento = "25/04/2026";
    }

    public void buildPagador() {
        boleto.pagador = "Maria Souza";
    }

    public void buildBeneficiario() {
        boleto.beneficiario = "Empresa ABC";
    }
}