import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Library {

    private List<Book> livrosDisponiveis;
    private List<User> usuariosRegistrados;

    public Library() {
        this.livrosDisponiveis = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    public void addBook(Book book) {
        livrosDisponiveis.add(book);
    }

    public void removeBook(Book book) {
        livrosDisponiveis.remove(book);
    }

    public void addUser(User user) {
        usuariosRegistrados.add(user);
    }

    public void empresarLivro(User user, Book book) {
        if (livrosDisponiveis.contains(book)) {
            user.empresarLivro(book);
            livrosDisponiveis.remove(book);
            JOptionPane.showMessageDialog(null,
                    "Livro: " + book.getTitulo() + " Emprestado ao usuario: " + user.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "Livro: " + book.getTitulo() + " não esta disponivel");
        }
    }

    public void devolveLivro(User user, Book book) {
        if (user.devolveLivro(book)) {
            livrosDisponiveis.add(book);
            JOptionPane.showMessageDialog(null, "Livro: " + book.getTitulo() + " Devolvido por " + user.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "Livro não foi emprestado por " + user.getNome());
        }
    }

    public void listaLivroDisponivel() {

        String e = "";
        for (Book book : livrosDisponiveis) {
            e = "ISBN: " + book.getIsbn() + " Titulo: " + book.getTitulo();
        }

        JOptionPane.showMessageDialog(null, e);
    }
}
