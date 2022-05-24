import java.util.ArrayList;
import java.util.regex.Pattern;

//user class --> librarians and students are also users
class User{
    private static int classID = 0; //initial id
    protected int id; //id of that specific user
    public String name, age; //all users have name and age
    protected String username, password; //all users have username and password
    protected boolean active; //if user is active or not
    //all users have a certain number of transaction under
    //their account
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    //construction of the user
    User(String name, String age, String username, String password){
        this.id = ++classID; //id is always one more than previous user created
        //the name of the user cannot contain anything that is not a letter or space in the name
        //and the age can only be numbers from 0-9
        this.name = Pattern.matches("^[a-zA-Z\s]*$", name) ? name : e();
        this.age = Pattern.matches("[0-9]+", age) ? (Integer.parseInt(age) > 0 && Integer.parseInt(age) <= 100)
                ? age:e() : e();
        this.username = username;
        this.password = password;
        this.active = true; //all users start as active
    }

    //method used to update any info about the student
    public void update(String name, String age, String username, String password, boolean active){
        this.name = Pattern.matches("^[a-zA-Z\s]*$", name) ? name : e();
        this.age = Pattern.matches("[0-9]+", age) ? (Integer.parseInt(age) > 0 && Integer.parseInt(age) <= 100)
                ? age:e() : e();
        this.username = username;
        this.password = password;
        this.active = active;
    }


    //method to get the transactions under the user's account
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    @Override
    public String toString() {
        return  ", id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                '}';
    }

    //method used to throw expection in case the user class received
    //an invalid input for the name
    protected static String e(){
        throw new RuntimeException("Invalid Input for User Class");
    }

    //method used to throw expection in case user tries to perform
    //actions while being inactive
    protected static void isActive(Boolean active) {
        if(!active) throw new RuntimeException("User is not active");
    }
}
