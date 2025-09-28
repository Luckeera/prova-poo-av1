public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto(int codigo, String descricao, double preco, int estoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void getDados(){
        System.out.println("O produto com codigo: " + this.codigo + ", de descricao: " + this.descricao + ", de preco: " + this.preco + ", e de estoque: " + this.estoque);
    }

    public void setPreco(double preco) {
        if (preco > 0){
            this.preco = preco;
            System.out.println("O preco foi setado para: " + this.preco);
        }
        else{
            System.out.println("Valores negativos nao sao aceitos");
        }
    }


    public void setEstoque(int estoque) {
        if(estoque > 0){
            this.estoque = estoque;
            System.out.println("O estoque foi setado para: " + this.estoque);

        }
        else{
            System.out.println("Valores negativos nao sao aceitos");
        }
    }

    public void aumentarEstoque(int valor){
        if (valor > 0){
        estoque += valor;
        System.out.println("Agora o estoque e: " + this.estoque);
        }
        else{
            System.out.println("Valores negativos nao sao aceitos");
        }
    }
    public void diminuirEstoque(int valor){
        if(valor > estoque){
            System.out.println("valores negativos nao sao aceitos");

        }
        else{
            estoque -= valor;
            System.out.println("O estoque agora e: " +this.estoque);
        }
    }

    

}
