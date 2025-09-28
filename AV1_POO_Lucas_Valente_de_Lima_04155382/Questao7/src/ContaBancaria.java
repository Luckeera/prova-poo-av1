public class ContaBancaria {
    private int numeroConta;
    private int saldo;
    
    
    
    public ContaBancaria(int numeroConta, int saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void getDados() {
        System.out.println("O numero da sua conta e: "+ this.numeroConta + " e o seu saldo e: " + this.saldo);
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void sacar(int valor){
        if (valor > saldo){
            System.out.println("Voce nao tem saldo suficiente");
        }
        else{
            saldo -= valor;
            System.out.println("O seu saldo agora e: " + this.saldo);
        }
    }
    public void depositar(int valor){
        saldo += valor;
        System.out.println("O seu saldo agora e: " + this.saldo);
    }


    

}
