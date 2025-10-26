package Service;

import Model.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Estoque {

    private int id = 1;
    private ArrayList<Produto> produtos = new ArrayList<>();

    //1 Cadastro de produto: criar produto com id, nome, preço e quantidade.
    public Produto addProduto(String name, double price, int qtn) {

        Produto produto = new Produto(id++, name, price, qtn); //adiciona um produto novo

        produtos.add(produto); //adionando o produto criado acima no Array de PRODUTOS

        return produto;
    }

    //2. Listar todos produtos
    public ArrayList<Produto> listaTodos() {

        if (produtos.size() != 0) {
            for (Produto u : produtos) {
                System.out.println(u);
            }
            return produtos;
        }
        System.out.println("ESTOQUE ZERADO!");
        return null;
    }

    //3. Buscar produto: por ID e nome.
    public Produto filtrarID(int id) {

        for (Produto u : produtos) {

            if (u.getId() == id) {
                return u;
            }
        }

        return null;
    }

    public Produto filtrarName(String name) {

        for (Produto u : produtos) {

            if (u.getName().equalsIgnoreCase(name)) {
                return u;
            }
        }
        return null;
    }

    //4. Atualizar produto: alterar preço e nome.
    public Produto atualizarName(String oldName, String newName) {

        Produto u = filtrarName(oldName);

        if (u != null) { // <-- verifica se encontrou o produto
            u.setName(newName);
            return u;
        }

        return null; // retorna null se não encontrou
    }

    public Produto atualizarPrice(String findName, double newPrice) {

        Produto u = filtrarName(findName);

        if (u != null) { // <-- verifica se encontrou o produto
            u.setPrice(newPrice);
            return u;
        }

        return null; // retorna null se não encontrou
    }

    //Remover produto: excluir do cadastro.
    public boolean removerProduto(int id) {
        return produtos.removeIf(p -> p.getId() == id);
    }

    //7. relatorio do estoque
    public double calcularValorTotal() {
        return produtos.stream().mapToDouble(Produto::getValorTotal).sum();
    }

    public ArrayList<Produto> produtosBaixoEstoque() {
        ArrayList<Produto> lista = new ArrayList<>();
        for (Produto u : produtos) {
            if (u.getQtn() < 5) lista.add(u);
        }
        return lista;
    }
}


