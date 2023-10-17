import model.Funcionario;

public class CalculadoraSalarioService {

    private static class InstanceHolder {
        public static CalculadoraSalarioService instance = new CalculadoraSalarioService();
    }

    private CalculadoraSalarioService() {
        super();
    }

    public static CalculadoraSalarioService getInstance(){
        return InstanceHolder.instance;
    }

    public double calculaSalario(double salario, Funcionario funcionario) {
        return  salario + (salario * funcionario.getBonus());
    }
}