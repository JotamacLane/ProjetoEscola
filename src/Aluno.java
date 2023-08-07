public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public void cancelarMatricula(){
        this.matricula = " ";
        System.out.println("Matricula cancelada.");
    }
}
