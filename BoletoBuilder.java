public abstract class BoletoBuilder {
    protected Boleto boleto;

    public BoletoBuilder() {
        boleto = new Boleto();
    }

    public abstract void buildBeneficiario();
    public abstract void buildSacado();
    public abstract void buildTitulo();
    public abstract void buildBanco();

    public void gerarCodigoBarrasELinha() {
        boleto.codigoBarras = "12345678901234567890123456789012345678901234";
        boleto.linhaDigitavel = "12345.67890 12345.678901 12345.678901 1 12345678901234";
    }

    public Boleto getBoleto() {
        return boleto;
    }
}
