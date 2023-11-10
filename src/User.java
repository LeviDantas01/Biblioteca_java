import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class User {

    private int id;
    private String nome;
    private List<Book> listLivros;

    public User(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.listLivros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Book> getListLivros() {
        return listLivros;
    }

    public void setListLivros(List<Book> listLivros) {
        this.listLivros = listLivros;
    }

    public void empresarLivro(Book book) {
        if (book.isDisponibilidade() == true) {
            listLivros.add(book);
        } else {
            JOptionPane.showMessageDialog(null, "Livro não está disponivel");
        }
    }

    public boolean devolveLivro(Book book) {
        listLivros.remove(book);
        return true;
    }

}
