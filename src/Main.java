public class Main {
    
    public static void main(String[] args) {
        
        Library library = new Library();
        
        Book book = new Book(1, "java", "Oracle", 2010);

        library.addBook(book);

        User user = new User(1, "Levi");

        library.addUser(user);

        library.listaLivroDisponivel();

    }
}
