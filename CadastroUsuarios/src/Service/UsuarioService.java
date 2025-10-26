package Service;
import Model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioService {

    private ArrayList<Usuario> usuarios= new ArrayList<>();
    private int id = 1;

    public Usuario cadastrar(String nome, String email, String senha) {
        Usuario usuario = new Usuario(id++, nome, email, senha);
        usuarios.add(usuario);
        return usuario;
    }
    public Usuario buscarPorEmail(String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null; // não achou
    }

    public ArrayList<Usuario> listarTodos() {
        return usuarios;
    }

    public boolean remover(int id) {
        return usuarios.removeIf(u -> u.getId() == id);
    }
    public boolean atualizarSenha(int id, String novaSenha) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                u.setPassword(novaSenha);
                return true;
            }
        }
        return false;
    }
}
