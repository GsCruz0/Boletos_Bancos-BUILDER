public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor();

        BoletoBuilder itau = new BoletoItauBuilder();
        diretor.construir(itau);
        itau.getBoleto().mostrarBoleto();

        BoletoBuilder nubank = new BoletoNubankBuilder();
        diretor.construir(nubank);
        nubank.getBoleto().mostrarBoleto();

        BoletoBuilder bradesco = new BoletoBradescoBuilder();
        diretor.construir(bradesco);
        bradesco.getBoleto().mostrarBoleto();
    }
}