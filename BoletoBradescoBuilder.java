public class BoletoBradescoBuilder extends BoletoBuilder {

    public void buildBanco() {
        boleto.banco = "Bradesco";
    }

    public void buildValor() {
        boleto.valor = 300.50;
    }

    public void buildVencimento() {
        boleto.vencimento = "30/04/2026";
    }

    public void buildPagador() {
        boleto.pagador = "Carlos Lima";
    }

    public void buildBeneficiario() {
        boleto.beneficiario = "Empresa 123";
    }
}