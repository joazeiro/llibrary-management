import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.util.ArrayList;

//student class --> an extension of user
//since students are also users
public class Student extends User{
    
    //students have course and year attributes which do not
    //apply to all users
    public String course, year;
    //arraylist of books that the used has borrowed
    //at that moment
    private ArrayList<Book> booksArray = new ArrayList<>();

    //construction of student
    Student(String name, String age, String username, String password, String course, String year){
        super(name, age, username, password);
        
        //the name of the course cannot contain anything that is not a letter or space in the name
        //and the year can only be numbers from 0-9
        this.course = Pattern.matches("^[a-zA-Z\s]*$", course) ? course : e();
        this.year = Pattern.matches("[0-9]+", year) ? (Integer.parseInt(year) > 0 && Integer.parseInt(year) <= 4)
                ? year:e() : e();
    }

    //used to update any necessary info on students account
    public void update(String name, String age, String username, String password, String course, String year, boolean active) {
        super.update(name, age, username, password, active);
        this.course = course;
        this.year = year;
    }

    //method used when a student is going to borrow a book
    public void borrow(int id, Books books){
        //check if user is active or not
        //can only borrow books if they are active
        isActive(this.active);
        //check if they have more than 3 borrowed books
        if(this.booksArray.size() == 3){
            System.out.println("You can't borrow more than 3 books");
        }
        //if they have less than 3 --> procceed with transaction
        else{
            Book tmp = books.getBook(id);

            if(tmp == null){
                System.out.println("Books is not available anymore");
                return;
            }

            if(tmp.borrowed){
                System.out.println("This books is already borrowed");
                return;
            }

            tmp.update(tmp.getTitle(), tmp.getPublisher(), true);
            booksArray.add(tmp);

            //borrowing a book generates a new transaction
            Transaction currentTransaction = new Transaction(("Borrowed " + tmp.toString()), new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime()));
            transactions.add(currentTransaction);

            System.out.println("Books was borrowed successfully!");
        }
    }

    //method used to return book
    public boolean returnBook(int id, Books books){
        isActive(this.active);
        //check if the student has more than 0 books borrowed
        //if there are no books to be returned
        //user cannot return any book
        if(!booksArray.isEmpty()){
            for (Book b: booksArray) {
                //check if id provided is a book currently borrowed
                //by that user
                if(b.getID() == id){
                    b.update(b.getTitle(), b.getPublisher(), false);
                    booksArray.remove(b);

                    //generate a new transaction
                    for (Transaction t: transactions) {
                        if(isInTransaction(b, t)){
                            t.update(("Returned " + b.toString()), new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime()));
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    //used to get the books array
    public ArrayList<Book> getBooksArray() {
        return booksArray;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", year='" + year + '\'' +
                ", booksArray=" + booksArray +
                ", transactions=" + transactions +
                super.toString();
    }

    //method used to check if a determined info is present
    //in a specific transaction
    private static boolean isInTransaction(Book book, Transaction t){
        String details = t.getDetails();
        if(details.equals("")) return false;

        int startIndex = details.indexOf("id=") + 3;
        String newDetails = details.substring(startIndex);
        int endIndex = newDetails.indexOf(",");
        return Integer.parseInt(newDetails.substring(0, endIndex)) == book.getID();
    }
}
