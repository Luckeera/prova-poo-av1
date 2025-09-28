public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria(1234, 1000);

        c1.getDados();
        c1.depositar(400);
        c1.depositar(1000);
        c1.getDados();
        c1.sacar(1300);
        c1.getDados();
    }
}
