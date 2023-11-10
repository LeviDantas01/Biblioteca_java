import javax.swing.JOptionPane;

public class Book {

    private int isbn; // == id
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public Book(int isbn, String titulo, String autor, int anoPublicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void detalhesLivro() {
        JOptionPane.showMessageDialog(null, "ISBN: " + this.isbn + "\n Titulo: " + this.titulo + "\n Autor: "
                + this.autor + " \n Ano de Publicação: " + this.anoPublicacao + " \n Disponibilidade: "
                + (disponibilidade ? "Disponivel" : "Indisponivel"));
    }

}
