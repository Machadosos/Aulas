import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

class Funcionario {
    int id;
    double salario;
    String cargo;
    int departamentoId;

    public Funcionario(int id, double salario, String cargo, int departamentoId) {
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.departamentoId = departamentoId;
    }

    public void aplicarBonus(double bonus) {
        this.salario += bonus;
    }
}

class Departamento {
    int id;
    double vendas;

    public Departamento(int id, double vendas) {
        this.id = id;
        this.vendas = vendas;
    }
}