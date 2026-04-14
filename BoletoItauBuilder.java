public class BoletoItauBuilder extends BoletoBuilder {

    public void buildBanco() {
        boleto.banco = "Itaú";
    }

    public void buildValor() {
        boleto.valor = 150.75;
    }

    public void buildVencimento() {
        boleto.vencimento = "20/04/2026";
    }

    public void buildPagador() {
        boleto.pagador = "João Silva";
    }

    public void buildBeneficiario() {
        boleto.beneficiario = "Empresa XYZ";
    }
}