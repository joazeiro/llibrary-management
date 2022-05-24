import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

//librarian class --> an extension of user
//since librarians are also users
public class Librarian extends User{
    
    //department is an attribute specific to librarians
    public String department;

    //construction of librarian
    Librarian(String name, String age, String username, String password, String department){
        super(name, age, username, password);
        //the name of the department cannot contain anything that is not a letter or space in the name
        this.department = Pattern.matches("^[a-zA-Z\s]*$", name) ? department : User.e();
    }

    //method that the librarian will use to disable a user
    protected void disableUser( User user){
        isActive(this.active);
        user.update(user.name, user.age, user.username, user.password, false);
        //when the librarian disables the user, it counts as a transaction
        Transaction t = new Transaction(("Disable " + user.toString()), new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime()));
        //adding new created transaction to that librarian's
        //list of transactions
        transactions.add(t);

    }

    //method that the librarian will use to enable a user
    //follows the same idea as the disable user
    protected void enableUser(User user){
        isActive(this.active);
        user.update(user.name, user.age, user.username, user.password, true);
        for (Transaction t: this.transactions) {
            if(isInTransaction(user, t)){
                t.update(("Enable " + user.toString()), new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime()));
            }
        }
    }

    //update any info of the librarian
    public void update(String name, String age, String username, String password, String department, boolean active) {
        super.update(name, age, username, password, active);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "department='" + department + '\'' +
                 super.toString();
    }

    //method used to check if a determined info is present
    //in a specific transaction
    private static boolean isInTransaction(User user, Transaction t){
        String details = t.getDetails();
        if(details.equals("")) return false;

        int startIndex = details.indexOf("id=") + 3;
        String newDetails = details.substring(startIndex);
        int endIndex = newDetails.indexOf(",");
        return Integer.parseInt(newDetails.substring(0, endIndex)) == user.id;
    }
}
