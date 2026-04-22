public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor();

        BoletoBuilder itau = new BoletoItauBuilder();
        diretor.construir(itau);
        itau.getBoleto().mostrarBoleto();

        BoletoBuilder bradesco = new BoletoBradescoBuilder();
        diretor.construir(bradesco);
        bradesco.getBoleto().mostrarBoleto();

        BoletoBuilder bb = new BoletoBancoBrasilBuilder();
        diretor.construir(bb);
        bb.getBoleto().mostrarBoleto();
    }
}
