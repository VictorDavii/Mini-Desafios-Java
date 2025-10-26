import java.util.HashMap;
import java.util.Map;

public class Agenda {
    HashMap<String, String> contato = new HashMap<String, String>();

    public void adicionarContato(String name, String telefone){
        if(contato.containsKey(name)){
            System.out.println("⚠️ Contato \"" + name + "\" já existe. Telefone será atualizado.");
        }
        contato.put(name, telefone);
        System.out.println("✅ Contato \"" + name + "\" adicionado/atualizado com sucesso!");
    }

    public void buscarContato(String name){
        if (contato.containsKey(name)) {
            System.out.println("📞 Telefone de " + name + ": " + contato.get(name));
        } else {
            System.out.println("❌ Contato \"" + name + "\" não encontrado.");
        }
    }

    public void listarContato(){

        if(contato.isEmpty()){
            System.out.println("📭 Nenhum contato salvo na agenda.");
            return; //retorn para impedir de continuar lendo abiaxo
        }

        System.out.println("\n📋 Lista de contatos:");
        for (Map.Entry<String, String> entrada : contato.entrySet()) {
            System.out.println("Nome: " + entrada.getKey() + " | Telefone: " + entrada.getValue());
        }
    }
}
