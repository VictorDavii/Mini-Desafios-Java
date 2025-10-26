import funcionario.Funcionario;
import gerente.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", 3000);
        Gerente g1 = new Gerente("Mariana", 5000, 2000);

        System.out.println(f1.getNome() + " - Pagamento: R$" + f1.calcularPagamento());
        System.out.println(g1.getNome() + " - Pagamento: R$" + g1.calcularPagamento());
    }
}