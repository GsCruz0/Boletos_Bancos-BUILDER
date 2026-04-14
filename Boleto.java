public class Boleto {
    String banco;
    double valor;
    String vencimento;
    String pagador;
    String beneficiario;

    public void mostrarBoleto() {
        System.out.println("Banco: " + banco);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Pagador: " + pagador);
        System.out.println("Beneficiário: " + beneficiario);
        System.out.println("---------------------------");
    }
}