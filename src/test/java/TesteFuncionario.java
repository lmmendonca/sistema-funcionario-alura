import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteFuncionario {

    @Test
    public void testaFuncionario() {
        Funcionario funcionario = new Funcionario("Leonardo", "08662040918", 2500.50);

        Assertions.assertEquals("Leonardo",funcionario.getNome());
        Assertions.assertEquals("08662040918",funcionario.getCpf());
        Assertions.assertEquals(2500.50,funcionario.getSalario());
        Assertions.assertEquals(250.05,funcionario.getBonificacao());
    }

    @Test
    public void testaFuncionarioTipo1() {
        Funcionario funcionario = new Funcionario("Leonardo", "08662040918", 2500.50);

        funcionario.setTipo(1);
        Assertions.assertEquals(2500.50,funcionario.getBonificacao());
    }

    @Test
    public void testaFuncionarioTipoGerente() {
        Funcionario funcionario = new Funcionario("Leonardo", "08662040918", 2500.50);

        funcionario.setTipo(2);
        Assertions.assertEquals(3500.50,funcionario.getBonificacao());
    }

}
