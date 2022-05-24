//Group Project COP 3330
//Maria Eduarda Joazeiro Gomes, Joseph Maria, and Dishang Shah

/*
                The objective of this program was to develop a library management
                system using concepts of Object Oriented Programming that we have
                        learned throughout this semester of Spring 2022
*/


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.HashSet;

//main class
public class Main {
    static Books books;
    static HashSet<User> users;

    //creating our initial "database" of students
    public static HashSet<User> getUsers(){
        HashSet<User> users = new HashSet<User>();

        users.add(new Student("Tristen Tate", "21", "TT12568", "Tristen12", "Computer Science", "1"));
        users.add(new Student("Emilee Bender", "22", "EB56561", "Emilee56", "Biology", "2"));
        users.add(new Student("Marilyn Russell", "21", "MR56521", "Marilyn78", "Computer Science", "2"));
        users.add(new Student("Xander Grant", "22", "XG78955", "Xander53", "Biology", "3"));
        users.add(new Student("Madelynn May", "23", "MM56565", "Madelynn33", "Computer Science", "1"));
        users.add(new Student("Nathen Franco", "20", "NF56455", "Nathen65", "Biology", "4"));
        users.add(new Student("Beckett Pham", "25", "BP85646", "Beckett66", "Computer Science", "2"));
        users.add(new Student("Jerimiah Crane", "25", "JC56452", "Jerimiah87", "Computer Science", "1"));
        users.add(new Student("Romeo Schmitt", "22", "RS56465", "Romeo57", "Biology", "2"));
        users.add(new Student("Mateo Keith", "21", "MK56456", "Mateo89", "Computer Engineering", "3"));
        users.add(new Student("Hunter Huff", "22", "HH53561", "Hunter57", "Computer Science", "1"));
        users.add(new Student("Payton Jones", "23", "PJ31515", "Payton89", "Computer Science", "2"));
        users.add(new Student("Sarai Ramsey", "22", "SR53153", "Sarai89", "Computer Science", "4"));
        users.add(new Student("Daniel Bailey", "24", "DB56421", "Daniel77", "Computer Engineering", "3"));
        users.add(new Student("Derrick Braun", "25", "DB54612", "Derrick88", "Computer Engineering", "2"));
        users.add(new Student("Reese Hawkins", "26", "RH65645", "Reese89", "Computer Science", "2"));
        users.add(new Student("Isabelle Carson", "27", "IC65642", "Isabelle57", "Computer Science", "2"));
        users.add(new Student("Yaretzi Mejia", "28", "YM65121", "Yaretzi99", "Computer Science", "1"));
        users.add(new Student("Melanie Cooper", "24", "MC53311", "Melanie78", "Biology", "3"));
        users.add(new Student("Juliette Miranda", "21", "JM65421", "Juliette63", "Computer Science", "3"));
        users.add(new Student("Aileen Salas", "22", "AS45645", "Aileen45", "Computer Engineering", "3"));
        users.add(new Student("Tessa Benjamin", "22", "TB56412", "Tessa56", "Computer Science", "2"));
        users.add(new Student("Colby Stafford", "24", "CS64621", "Colby89", "Computer Science", "4"));
        users.add(new Student("Aisha Koch", "21", "AK65454", "Aisha56", "Computer Science", "4"));
        users.add(new Student("Arianna Aguilar", "22", "AA56454", "Arianna55", "Computer Engineering", "2"));
        users.add(new Student("Peyton Baird", "21", "PB65461", "Peyton53", "Computer Science", "3"));
        users.add(new Student("Juliana Leonard", "22", "JL64623", "Juliana58", "Biology", "1"));
        users.add(new Student("Rene Fuentes", "22", "RF65461", "Rene89", "Computer Science", "2"));
        users.add(new Student("Aidan Boyd", "22", "AB65461", "Aidan45", "Computer Engineering", "3"));
        users.add(new Student("Alexandra May", "21", "AM65461", "Alexandra66", "Computer Science", "4"));
        users.add(new Student("Sarai Garrett", "21", "SG56412", "Sarai45", "Computer Science", "1"));
        users.add(new Student("Cheyanne Alexander", "22", "CA56451", "Cheyanne55", "Computer Science", "2"));
        users.add(new Student("Spencer Terry", "21", "ST56461", "Spencer75", "Computer Engineering", "3"));
        users.add(new Student("Jayvon Duarte", "22", "JD56512", "Jayvon65", "Computer Science", "4"));
        users.add(new Student("Dalia Freeman", "22", "DF54641", "Dalia56", "Computer Engineering", "2"));
        users.add(new Student("Nathan Villa", "21", "NV56412", "Nathan88", "Computer Science", "3"));
        users.add(new Student("Barrett Wu", "21", "BM56451", "Barrett23", "Biology", "1"));
        users.add(new Student("Destinee Meyers", "22", "DM56461", "Destinee13", "Computer Engineering", "2"));
        users.add(new Student("Campbell Buck", "23", "CB64612", "Campbell15", "Computer Engineering", "3"));
        users.add(new Student("Nathaniel Shea", "23", "NS54612", "Nathaniel23", "Computer Engineering", "4"));
        users.add(new Student("Ella Shannon", "23", "ES56462", "Ella36", "Computer Science", "2"));
        users.add(new Student("Aimee Reid", "21", "AR54621", "Aimee45", "Computer Engineering", "1"));
        users.add(new Student("Anabel Costa", "22", "AC45621", "Anabel56", "Computer Science", "2"));
        users.add(new Student("Alina Gould", "21", "AG45612", "Alina12", "Computer Science", "2"));
        users.add(new Student("Marlon Rodgers", "22", "MR56461", "Marlon56", "Computer Engineering", "4"));
        users.add(new Student("Isis Haas", "23", "IH45612", "Isis78", "Computer Engineering", "2"));
        users.add(new Student("Talan Sampson", "22", "TS56412", "Talan23", "Computer Engineering", "2"));
        users.add(new Student("Jaylyn Rivera", "22", "JR65461", "Jaylyn89", "Computer Science", "4"));
        users.add(new Student("Giovanni Robbins", "23", "GR64612", "Giovanni59", "Computer Engineering", "2"));
        users.add(new Student("Nikhil Woodward", "22", "NW65461", "Nikhil89", "Computer Engineering", "2"));
        return users;
    }
    
    //creating our initial "database" of books
    public static Books getBooks(){
        Books books = new Books();
        books.add(new Book ("Learn Java for Dummies", "John Smith "));
        books.add(new Book ("Learn JavaScript in 10 Minutes", "Jack Arnold "));
        books.add(new Book ("Learn IOS","Edgar Alan Poe"));
        books.add(new Book ("Learn SQL","James Rodriguez"));
        books.add(new Book ("Learning .Net is not boring","Hungry Jack"));
        books.add(new Book ("Shine while learing Ruby","Britney Spears"));
        books.add(new Book ("Move like a snake with Phython", "Bill Gates"));
        books.add(new Book ("Learn PHP and work in Facebook","Bill Gates"));
        books.add(new Book ("Learn C only if you are smart", "Goofy"));
        books.add(new Book ("Learn C++ in a year++", "Atreyu"));
        books.add(new Book ("Vahana Masterclass","Alfredo Covelli"));
        books.add(new Book ("India’s 71-Year Test: The Journey to Triumph in Australia","R.Kaushik"));
        books.add(new Book ("Right Under Our Nose","R. Giridharan"));
        books.add(new Book ("Making of a General-A Himalayan Echo","Lt. Gen. Konsam Himalay Singh"));
        books.add(new Book ("The Commonwealth of Cricket","Ramachandra Guha"));
        books.add(new Book ("Manohar Parrikar-Off the Record","Waman Subha Prabhu"));
        books.add(new Book ("The Little Book of Encouragement","Dalai Lama"));
        books.add(new Book ("Beautiful Things’ A Memoir","Hunter Biden"));
        books.add(new Book ("By Many a Happy Accident: Recollections of a Life","Former Vice President Mohammad Hamid Ansari"));
        books.add(new Book ("Platform Scale: For A Post-Pandemic World","Sangeet Paul Choudary"));
        books.add(new Book ("Unfinished","Priyanka Chopra Jonas"));
        books.add(new Book ("The Terrible, Horrible, Very Bad Good News","Meghna Pant"));
        books.add(new Book ("ASOCA: A Sutra","Irwin Allan Sealy"));
        books.add(new Book ("Maverick Messiah: A Political Biography of N T Rama Rao","Ramesh Kandula"));
        books.add(new Book ("Rashtra Pratham - 82 Varshon ki Swarnim Gatha","Amit Shah"));
        books.add(new Book ("Stories I Must Tell: The Journey of an Actor","Kabir Bedi"));
        books.add(new Book ("Advantage India: The Story of Indian Tennis","Anindya Dutta"));
        books.add(new Book ("Dynasty to Democracy: The Untold Story of Smriti Irani’s Triumph","Anant Vijay"));
        books.add(new Book ("Battle Ready for 21st Century","	Lt Gen AK Singh and Brig. Narendra Kumar"));
        books.add(new Book ("My Experiments with Silence","Samir Soni"));
        books.add(new Book ("Names of the Women","Jeet Thayil"));
        books.add(new Book ("Suparipalana","Dr. Shailendra Joshi"));
        books.add(new Book ("Manohar Parrikar: Brilliant Mind, Simple Life","Nitin Gokhale"));
        books.add(new Book ("Odisha Itihaas","Utkal Keshari Harekrushna Mahtab"));
        books.add(new Book ("The Braille edition of the book Exam Warriors","PM Narendra Modi"));
        books.add(new Book ("Believe-What Life and Cricket Taught Me","Suresh Raina"));
        books.add(new Book ("The Christmas Pig","JK Rowling"));
        books.add(new Book ("Whereabouts","Jhumpa Lahiri"));
        books.add(new Book ("The Living Mountain: A Fable for Our Times","Amitav Ghosh"));
        books.add(new Book ("Climate Change Explained—For One and All","Aakash Ranison"));
        books.add(new Book ("The Bench","Meghan Markle"));
        books.add(new Book ("Elephant in the Womb","Kalki Koechlin"));
        books.add(new Book ("Life in the Clock Tower Valley","Shakoor Rather"));
        books.add(new Book ("Sikkim: A History of Intrigue and Alliance","	Preet Mohan Singh Malik"));
        books.add(new Book ("Nehru, Tibet and China","	Preet Mohan Singh Malik"));
        books.add(new Book ("India and Asian Geopolitics: The Past, Present","Shivshankar Menon"));
        books.add(new Book ("Sach Kahun Toh","Neena Gupta"));
        books.add(new Book ("Stargazing: The Players in my Life","Ravi Shastri"));
        books.add(new Book ("Languages of Truth: Essays 2003-2020","Salman Rushdie"));
        books.add(new Book ("Savarkar: A Contested Legacy (1924-1966)","Vikram Sampath"));
        books.add(new Book ("7 Lessons from Everest - Expedition Learnings from life and Business ","Aditya Gupta"));
        books.add(new Book ("1232km: The Long Journey Home","Vinod Kapri"));
        books.add(new Book ("Home in the World","Amartya Sen"));
        books.add(new Book ("The Nutmeg’s Curse: Parables for a Planet in Crisis","Amitav Ghosh"));
        books.add(new Book ("Beyond Here and Other Poems","Bishnupada Sethi"));
        books.add(new Book ("The 7 Sins of Being a Mother","Tahira Kashyap Khurrana"));
        books.add(new Book ("Habba Khatoon","Kajal Suri"));
        books.add(new Book ("Will","Will Smith and Mark Manson"));
        books.add(new Book ("My Joys and Sorrows- as a Mother of a Special Child","Krishna Saksena"));
        books.add(new Book ("It’s a Wonderful Life","Ruskin Bond"));
        books.add(new Book ("Fiercely Female: The Dutee Chand Story","Sundeep Mishra"));
        books.add(new Book ("Policymaker’s Journal: From New Delhi to Washington DC","Kaushik Basu"));
        books.add(new Book ("Kashmiri Century: Portrait of a Society in Flux","Khemlata Wakhlu"));
        books.add(new Book ("Lady Doctors: The Untold Stories of India’s First Women in Medicine","Kavitha Rao"));
        books.add(new Book ("The Pregnancy Bible","	Kareena Kapoor"));
        books.add(new Book ("The Art of Conjuring Alternate Realities: How Information Warfare Shapes Your World",""));
        books.add(new Book ("The Great Big Lion","Shivam Shankar Singh and Anand Venkatanarayanan"));
        books.add(new Book ("The India Story ","Bimal Jalan"));
        books.add(new Book ("The Stranger In The Mirror(Autobiography of  Rakeysh Omprakash Mehra)","Reeta Ramamurthy Gupta and  Rakeysh Omprakash Mehra"));
        books.add(new Book ("Palleku Pattabhishekam","Yalamanchili Sivaji"));
        books.add(new Book ("Bank With A Soul: Equitas","Dr. C K Garyali"));
        books.add(new Book ("An Ordinary Life: Portrait of an Indian Generation","Ashok Lavasa  "));
        books.add(new Book ("In An Ideal World","Kunal Basu"));
        books.add(new Book ("My Own Mazagon","	Captain Ramesh Babu"));
        books.add(new Book ("Leopard Diaries – the Rosette in India","Sanjay Gubbi"));
        books.add(new Book ("Balakot Air Strike: How India Avenged Pulwama","Manan Bhatt"));
        books.add(new Book ("The Year That Wasn’t – The Diary of a 14-Year-Old","Brisha Jain"));
        books.add(new Book ("The Earthspinner","Anuradha Roy"));
        books.add(new Book ("How the Earth Got Its Beauty","Sudha Murty"));
        books.add(new Book ("OPERATION KHUKRI","Rajpal Punia & Ms Damini Punia"));
        books.add(new Book ("Accelerating India: 7 Years of Modi Government","	K J Alphons"));
        books.add(new Book ("Back to the Roots","Tamannaah Bhatia"));
        books.add(new Book ("Gita Govinda: Jaydeva’s Divine Odyssey","Dr. Utpal K. Banerjee"));
        books.add(new Book ("Human Rights and Terrorism in India","Subramanian Swamy"));
        books.add(new Book ("Translating Myself and Others","Jhumpa Lahiri"));
        books.add(new Book ("Shining Sikh Youth of India","	Dr. Prabhleen Singh "));
        books.add(new Book ("400 Days","Chetan Bhagat"));
        books.add(new Book ("Jungle Nama","Amitav Ghosh"));
        books.add(new Book ("The Fractured Himalaya: How the Past Shadows the Present in India-China Relations","Arup Guha"));
        books.add(new Book ("the Battle of Rezang La","Nirupama Rao"));
        books.add(new Book ("Karmayoddha Granth","Kulpreet Yadav"));
        books.add(new Book ("Relentless","	Amit Shah"));
        books.add(new Book ("A Child of Destiny","Yashwant Sinha"));
        books.add(new Book ("The Thin Mind Map","	K. Ramakrishna Rao"));
        books.add(new Book ("A Commentary and Digest on The Air, Act 1981","Dharmendra Rai"));
        books.add(new Book ("Death – An Inside Story","Apoorva Kumar Singh"));
        books.add(new Book ("An Extraordinary Life: A biography of Manohar Parrikar","Jaggi Vasudev"));
        books.add(new Book ("Invincible – A Tribute to Manohar Parrikar","Sadguru Patil & Mayabhushan Nagvenkar"));
        books.add(new Book ("My Encounters in Parliament","Tarun Vijay"));
        books.add(new Book ("Messiah Modi: A Tale of Great Expectations","Bhalchandra Mungekar"));
        return books;
    }

    //method used to validate if whatever the user input was matches what is
    //expected on that input --> mostly to avoid bugs
    //if the input is not what is expected, ask user to try again
    public static int validateInt(int min, int max, String output){
        Scanner input = new Scanner(System.in);
        String num = input.next();
        boolean flag = Pattern.matches("[0-9]+", num) && (Integer.parseInt(num) >= min && Integer.parseInt(num) <= max);

        while(!flag){
            System.out.print("\nPlease enter a valid input!\n"+output);
            num = input.next();
            flag = Pattern.matches("[0-9]+", num) && ((Integer.parseInt(num) >= min) && (Integer.parseInt(num) <= max));
        }
        return Integer.parseInt(num);
    }

    //method used to validate if whatever the user input was matches what is
    //expected on that input --> mostly to avoid bugs
    //if the input is not what is expected, ask user to try again
    public static String validateIntS(int min, int max, String output){
        Scanner input = new Scanner(System.in);
        String num = input.next();
        boolean flag = Pattern.matches("[0-9]+", num) && (Integer.parseInt(num) >= min && Integer.parseInt(num) <= max);

        while(!flag){
            System.out.print("\nPlease enter a valid input!\n"+output);
            num = input.next();
            flag = Pattern.matches("[0-9]+", num) && ((Integer.parseInt(num) >= min) && (Integer.parseInt(num) <= max));
        }
        return num;
    }

    //method used to validate if whatever the user input was matches what is
    //expected on that input --> mostly to avoid bugs
    //if the input is not what is expected, ask user to try again
    public static String validateString( String output){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean flag = Pattern.matches("^[a-zA-Z]*$", s);

        while(!flag){
            System.out.print("\nPlease enter a valid input!\n"+output);
            s = input.next();
            flag = Pattern.matches("^[a-zA-Z]*$", s);
        }
        return s;
    }


    //menu if the user is a student
    public static void menu(Student student){

        //students can only borrow or return a book
        do {
            System.out.print("What would you like to do? (1) Borrow a book (2) Return a book (3) to log out: ");
            int choice = validateInt(1, 3, "What would you like to do? (1) Borrow a book (2) Return a book");

            if (choice == 1) {
                //we show users the books we have and they will pick which
                //one they would like to borrow
                books.displayBookList();
                System.out.print("Which book would you like to borrow? (Select it by id)");
                int selection = validateInt(34935, 35037, "Which book would you like to borrow? (Select it by id)");

                student.borrow(selection, books);
            }
            else if(choice == 2){
                if(student.getBooksArray().isEmpty())System.out.println("You don't have any books");
                
                //if they want to return a book, the book has to be present
                //in their list of borrowed books
                else {
                    System.out.println("Enter the id of the book you would like to return");
                    student.getBooksArray().forEach(b -> System.out.println(b));
                    System.out.print("Which book would you like to return? (Select it by id)");
                    int id = validateInt(34935, 35037, "Which book would you like to return? (Select it by id)");

                    if (student.returnBook(id, books)) {
                        System.out.println("The book was returned successfully!");
                        student.getTransactions().forEach(Transaction::printReceipt);
                    } else {
                        System.out.println("The book is couldn't be returned");
                    }
                }
            }
            else break;
        }while(true);
    }

    //librarian's menu
    public static void menu(Librarian librarian){

        //librarians can only enable and disable users
        //both methods are declared in the librarian class
        do {
            System.out.print("What would you like to do? (1) Disable a User (2) Enable a User (3) log out: ");
            int choice = validateInt(1, 2, "What would you like to do? (1) Disable a User (2) Enable a User");

            if (choice == 1) {
                //librarians pick which user they would like to disable through id
                System.out.print("What is the user's ID that you would like to disable?");
                users.forEach(u -> System.out.println(u));
                int tempID = validateInt(0, 100000, "What is the user's ID that you would like to disable?");
                boolean flag = true;

                for(User user: users){
                    if(user.active && user.id == tempID){
                        librarian.disableUser(user);
                        System.out.println("The user was disabled successfully!");
                        //print receipt for user after the process is complete
                        librarian.getTransactions().forEach(Transaction::printReceipt);
                        flag = false;
                        break;
                    }
                }
                if(flag) System.out.println("The user couldn't be disabled");
            }
            else if(choice == 2){
                //librarians pick which user they would like to enable through id
                System.out.print("What is the user's ID that you would like to enable?");
                users.forEach(u -> System.out.println(u));
                int tempID = validateInt(0, 100000, "What is the user's ID that you would like to enable?");
                boolean flag = true;

                for(User user: users){
                    if(!user.active && user.id == tempID){
                        librarian.enableUser(user);
                        System.out.println("The user was enabled successfully!");
                        //print receipt for user after the process is complete
                        librarian.getTransactions().forEach(Transaction::printReceipt);
                        flag = false;
                        break;
                    }
                }
                if(flag) System.out.println("The user couldn't be enabled");
            }
            else break;
        }while(true);
    }

    //method used to create a user
    public static User createUser(){

        String name;
        String age;
        String username;
        String password;
        int choice;

        Scanner input = new Scanner(System.in);

        //getting user input for all information needed to create a new user
        //acount and validating if all their choices are 
        //valid inputs
        System.out.print("Enter your first and last name: ");
        name = validateString("Enter your first and last name: ");
        System.out.print("Enter your age: ");
        age = validateIntS(0, 100, "Enter your age: ");
        System.out.print("Pick a username: ");
        username = input.next();
        System.out.print("Pick a password: ");
        password = input.next();

        //user will select if they are a librarian or student to
        //continue inputting the necessary info
        System.out.print("Are you a librarian or student? (1) Student(2) Librarian: ");
        choice = validateInt(1, 2, "Are you a librarian or student? (1) Student(2) Librarian: ");


        //if they are a student, we need to know their course and year
        if(choice == 1){

            String year, course;

            System.out.print("What college year are you in? ");
            year = validateIntS(1, 4, "What college year are you in? ");
            System.out.print("What is your major? ");
            course = validateString("What is your major? ");

            return new Student(name, age, username, password, course, year);
        }


        //and if they are a librarian, we need their department
        System.out.print("What is your department? ");
        String department = validateString("What is your department? ");
        return new Librarian(name, age, username, password, department);
    }

    //method to log in
    public static User logIn(HashSet<User> users){

        Scanner input = new Scanner(System.in);
        boolean flag;
        User user = null;

        //if user already has an account, they will input their
        //username and password and log in to start performing
        //actions
        System.out.print("Enter your username: ");
        String currentUsername = input.next();

        System.out.print("Enter your password: ");
        String currentPassword = input.next();

        //check if username and password entered match
        //any of the username and password of a specific user listed
        //in the hashset
        for(User u: users){
            if(u.username.equals(currentUsername) && u.password.equals(currentPassword)){
                return u;
            }
        }
        flag = true;


        //if they enter a wrong username and password, they can try again or
        //just close the program
        while(flag){
            System.out.println("Invalid User. Please try again or enter -1 to close program");

            System.out.print("Enter your username: ");
            currentUsername = input.next();

            if(currentUsername.equals("-1")) System.exit(-1);

            System.out.print("Enter your password: ");
            currentPassword = input.next();

            for(User u: users){
                if(u.username.equals(currentUsername) && u.password.equals(currentPassword)){
                    user = u;
                    flag = false;
                    break;
                }
            }

        }
        return user;

    }


    //main method
    public static void main(String[] args) {

        //get our "database" of users and books
        users = getUsers();
        books = getBooks();

        //prompting user to pick if they want to log in or create a new account
        System.out.print("Enter (1) to log in or (2) to create new account: ");
        int choice = validateInt(1,2, "Enter(1) to log in or (2) to create new account: ");

        //program will automatically check if they are
        //student or librarian
        if(choice == 1) {
            User u = logIn(users);
            String Uclass = String.valueOf(u.getClass());
            if(Uclass.equals("class Student")) {
                menu((Student) u);
            }
            else menu((Librarian) u);

        }
        
        //otherwise, we have to create their user account
        else{
            User u = createUser();
            users.add(u);

            String Uclass = String.valueOf(u.getClass());
            if(Uclass.equals("class Student")) {
                menu((Student) u);
            }
            else menu((Librarian) u);
        }
    }
}
