public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(){}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void receberaumento(float x){
        this.salario = salario + x;
    }
}
