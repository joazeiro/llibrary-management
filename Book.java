//class Book
public class Book {
    protected int id; //id of the book
    public String title; //title of the book
    public String publisher; //author of the book
    public boolean borrowed; //is it borrowed or not?
    private static int currID = 34935; //initial random id

    //when we create a book, we always need its title and author
    public Book(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
        this.id = ++currID; //the id will be the random starting id + 1
        this.borrowed = false; //they will always start as not being borrowed
    }

    //update will be used in case we need to update the title, author or status of a book
    public void update(String title, String publisher, boolean borrowed){
        this.title = title;
        this.publisher = publisher;
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }

   //getter functions
    public int getID() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public boolean getBorrowed() {
        return this.borrowed;
    }
}
