public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto(1, "Produto de beleza", 12.00, 3);
        Produto p2 = new Produto(2, "Cafe", 170.00, 1);

        p1.aumentarEstoque(2);
        p2.aumentarEstoque(-3);
        p2.aumentarEstoque(3);
        p1.diminuirEstoque(5);
        p1.diminuirEstoque(1);
        p2.diminuirEstoque(2);


        p1.getDados();
        p2.getDados();
    }
}
