public class App {
    public static void main(String[] args) throws Exception {
    // Uma empresa de transporte por aplicativo quer cadastrar os veículos de seus motoristas.
    // Implemente uma classe Carro com os atributos: marca, modelo e ano.
    // Crie um construtor padrão, que apenas cria o objeto vazio;
    // Crie também um construtor parametrizado, que inicializa todos os atributos de uma só vez.
    // No main, cadastre dois carros: um com o construtor padrão e
    // outro com o construtor parametrizado.
    // Mostre os dados de ambos na tela.

    Carro carro1 = new Carro();
    Carro carro2 = new Carro("Honda", "Fit", 2010);

    carro1.getDados();
    carro2.getDados();
    }
}
