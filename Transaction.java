//transaction class
public class Transaction {
    private static int classID = 0; //intial id of transactions
    protected int id; //id of the specific transaction
    public String details; //details of transaction
    public String date; //date of the transaction

    //transaction constructor
    public Transaction( String details, String date){
        this.id = ++classID;
        this.details = details;
        this.date = date;
    }

    //updating info in the transaction
    public void update(String details, String date){
        this.details = details;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    //getter functions
    public int getID(){
        return this.id;
    }

    public String getDetails(){
        return this.details;
    }

    public String getDate(){
        return this.date;
    }

    //method used to print a receipt for the user
    public void printReceipt(){
        System.out.println("=====================================================");
        System.out.println("     Transaction ID: " + id);
        System.out.println("======================================================");
        System.out.println(" Details of transaction: " + details);
        System.out.println("\n");
        System.out.println("    Date of the transaction: " + date + "\n");
    }
}
