import model.Chefe;
import model.Funcionario;
import model.Gerente;
import model.Operario;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalarioService service = CalculadoraSalarioService.getInstance();

        Funcionario operador = new Operario();
        Funcionario chefe = new Chefe();
        Funcionario gerente = new Gerente();

        double salOperador = service.calculaSalario(2000, operador);
        double salChefe = service.calculaSalario(2000, chefe);
        double salGerente = service.calculaSalario(2000, gerente);

        System.out.println("O salario do operador é: R$" + salOperador);
        System.out.println("O salario do Chefe é: R$" + salChefe);
        System.out.println("O salario do gerete é: R$" + salGerente);
    }
}