public class Designer extends Funcionario{

    public Designer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }

}
