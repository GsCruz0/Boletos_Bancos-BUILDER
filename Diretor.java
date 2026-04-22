public class Diretor {
    public void construir(BoletoBuilder builder) {
        builder.buildBeneficiario();
        builder.buildSacado();
        builder.buildTitulo();
        builder.buildBanco();
        builder.gerarCodigoBarrasELinha();
    }
}
