// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario  p4 = new Funcionario();

        p1.setNome("Darluz");
        p2.setNome("João");
        p3.setNome("Amorim");
        p4.setNome("Darlan");

        p1.setIdade(40);
        p2.setIdade(22);
        p3.setIdade(40);
        p3.setIdade(23);

        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("M");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}