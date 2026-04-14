public class Diretor {
    public void construir(BoletoBuilder builder) {
        builder.buildBanco();
        builder.buildValor();
        builder.buildVencimento();
        builder.buildPagador();
        builder.buildBeneficiario();
    }
}