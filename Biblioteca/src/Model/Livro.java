package Model;

public class Livro {

    private String autor;
    private String titulo;
    private boolean disponivel;
    private int id;

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getID() {
        return id;
    }


    public Livro(String autor, String titulo, boolean disponivel, int id) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }

}
