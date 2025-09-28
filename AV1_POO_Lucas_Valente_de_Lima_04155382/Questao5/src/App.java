public class App {
    public static void main(String[] args) throws Exception {
        //Uma escola de ensino superior deseja informatizar o processo de registro de alunos.
        //Crie uma classe Aluno que represente um estudante
        // com os atributos: nome, matricula, notaAv1 e notaAv2.
        //A classe deve permitir:

        //Calcular a média das avaliações;

        //Verificar se o aluno foi aprovado (média ≥ 7).

        //No main, registre dois alunos diferentes, altere os valores de um deles e
        // mostre a situação final de cada estudante.
        Aluno al1 = new Aluno("Lucas", 123, 5.0, 7.0);
        Aluno al2 = new Aluno("Cassio", 1234, 6.0, 8.0);

        al1.verificarAprovacao();

        al1.notaAv2 = 10.0;
        al1.verificarAprovacao();
        al2.verificarAprovacao();
    }
}
