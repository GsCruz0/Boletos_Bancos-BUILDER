public abstract class BoletoBuilder {
    protected Boleto boleto;

    public BoletoBuilder() {
        boleto = new Boleto();
    }

    public abstract void buildBanco();
    public abstract void buildValor();
    public abstract void buildVencimento();
    public abstract void buildPagador();
    public abstract void buildBeneficiario();

    public Boleto getBoleto() {
        return boleto;
    }
}