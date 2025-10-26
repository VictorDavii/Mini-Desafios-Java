
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF (apenas números): ");
        String CPFNumber = scanner.nextLine();
        IsValidCPF(CPFNumber);

        if (isValidCPF(CPFNumber)) {
            System.out.println("✅ CPF válido!");
        } else {
            System.out.println("❌ CPF inválido!");
        }
    }

    static boolean IsValidCPF(String cpf){

        //1. verificar se tem 11 dígitos numéricos
        if(cpf.matches("\\d{11}")) return false;

        // 2. Evitar CPFs com todos dígitos iguais (ex: 11111111111)
        if(cpf.matches("(\\d)\\1{10}")) return false;

        // 3. Calcular 1º dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int resto = soma % 11;
        int digito1 = (resto < 2) ? 0 : 11 - resto;
        
    }
}

