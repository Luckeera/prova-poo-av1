public class Aluno {
    // com os atributos: nome, matricula, notaAv1 e notaAv2.
    public String nome;
    public int matricula;
    public double notaAv1;
    public double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;

    }

    public void verificarAprovacao() {
        double media = calcularMedia() ;
        if (media >= 7){
            System.out.println("O aluno foi aprovado");
        }
        else {
            System.out.println("O aluno nao foi aprovado");
        }

        
    }
    
}
