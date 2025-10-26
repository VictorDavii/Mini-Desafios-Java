package service;

import Model.Livro;

import java.util.ArrayList;

public class ServiceBiblioteca {

    private ArrayList<Livro> estante = new ArrayList<>();
    private boolean isDisponivel = true;
    private int id = 1;

    public Livro addLivros(String autor, String titulo){
        Livro newLivro = new Livro(autor, titulo, isDisponivel, id++);
        estante.add(newLivro);
        return newLivro;
    }

    public ArrayList<Livro> exibirEstante(){

        ArrayList<Livro> livrosDisponiveis = new ArrayList<>();

        for (Livro livro: estante){
            if(livro.isDisponivel()){
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public String tituloLivro(int ID){

        String titulo;

        for (Livro livro: estante){
            if(livro.getID() == ID){
               titulo = livro.getTitulo();
               return titulo;
            }
        }
        return null;
    }

    public Livro emprestarLivro(int id){

        for(Livro livro: estante){
            if (livro.getID() == id ){
                livro.setDisponivel(false);
                return livro;
            }
        }
        return null;

    }

    public  Livro devolverLivro(int id){
        for(Livro livro: estante){
            if (livro.getID() == id ){
                livro.setDisponivel(true);
                return livro;
            }
        }
        return null;
    }

}
