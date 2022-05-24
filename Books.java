import java.util.HashSet;

//this class is used to store the hashset that contain
//an x amount of number of books
public class Books {
    HashSet<Book> books;

    //creating the hashset
    Books() {
        books = new HashSet<Book>();
    }

    //for us to add the book to the hashset we need
    //to create the book itself
    public void add(String t, String p){
        books.add(new Book( t, p));
    }

    public void add(Book book){
        books.add(book);
    }

    //checking if the selected id matches with the book id in question
    public Book getBook(int id) {
        for (Book book: books) {
            if (book.getID() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }

    //method to displey book list on the student menu
    public void displayBookList(){
        books.forEach(System.out::println);
    }
}

