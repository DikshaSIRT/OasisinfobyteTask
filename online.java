import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {

    String qtionText;
    List<String> options;
    int correctOption; int total=0;

    public Question(String qtionText, List<String> options, int correctOption) {
        this.qtionText = qtionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class online{

    static List<Question> questions = new ArrayList<>();
    static List<User> users = new ArrayList<>();
    static User loggedInUser;
    static boolean sessionOpen = false;

    public static void main(String[] args) {

        initializeQuestions();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\t\n\n**************Welcome****************\n");
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: \n");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {

                case 1:
                    register(sc);
                    break;

                case 2:
                    login(sc);
                    break;

                case 3:
                    System.out.println("Exiting the system.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option!");
            }
        }
    }

    public static void initializeQuestions() {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose subject. \t\n1.java\n2.c \n3.c++\n4.python\n");
        int a=sc.nextInt();
        if(a==1){

        List<String> options1 = new ArrayList<>();
        options1.add("Guido van Rossum");
        options1.add("James Gosling");
        options1.add("Dennis Ritchie");
        options1.add("Bjarne Stroustrup");

        List<String> options2 = new ArrayList<>();
        options2.add("JRE");
        options2.add("JIT");
        options2.add("JDK");
        options2.add("JVM");

        List<String> options3 = new ArrayList<>();
        options3.add("Object-oriented");
        options3.add("Use of pointers");
        options3.add("Portable");
        options3.add("Dynamic and Extensible");

        List<String> options4 = new ArrayList<>();
        options4.add(".js");
        options4.add(".txt");
        options4.add(".class");
        options4.add(".java");

        List<String> options5 = new ArrayList<>();
        options5.add("Polymorphism");
        options5.add("Inheritance");
        options5.add("Compilation");
        options5.add("Encapsulation");
    
        Question Q1 = new Question("Who invented Java Programming?", options1, 1);
        Question Q2 = new Question("Which component is used to compile, debug and execute the java programs?", options2, 2);
        Question Q3 = new Question("Which one of the following is not a Java feature?", options3, 1);
        Question Q4 = new Question("What is the extension of Java code files?", options4, 3);
        Question Q5 = new Question("Which of the following is not an OOPS concept in Java?", options5, 2);

        questions.add(Q1);
        questions.add(Q2);
        questions.add(Q3);
        questions.add(Q4);
        questions.add(Q5);}

        else if(a==2){
            List<String> options1 = new ArrayList<>();
            options1.add("Steve jobs");
            options1.add("James Gosling");
            options1.add("Dennis Ritchie");
            options1.add("Bjarne Stroustrup");
    
            List<String> options2 = new ArrayList<>();
            options2.add("int number;");
            options2.add("float area;");
            options2.add("int count_var;");
            options2.add("int $main;");
    
            List<String> options3 = new ArrayList<>();
            options3.add("Lower case");
            options3.add("Uppercase");
            options3.add("Toggal");
            options3.add("none");
    
            List<String> options4 = new ArrayList<>();
            options4.add(".class");
            options4.add(".txt");
            options4.add(".c");
            options4.add(".java");
    
            List<String> options5 = new ArrayList<>();
            options5.add("Volatile");
            options5.add("true");
            options5.add("Friend");
            options5.add("export");
        
            Question Q1 = new Question("Who is the father of c?", options1, 2);
            Question Q2 = new Question("Which of the following is not a valid c vriable name?", options2, 3);
            Question Q3 = new Question("All keywords in c are?", options3, 0);
            Question Q4 = new Question("What is the extension of c code files?", options4,2);
            Question Q5 = new Question("Which of the following cannot be a  variable name in c?", options5, 0);
    
            questions.add(Q1);
            questions.add(Q2);
            questions.add(Q3);
            questions.add(Q4);
            questions.add(Q5);}
            else if(a==3){  List<String> o1 = new ArrayList<>();
                o1.add("Guido van Rossum");
                o1.add("James Gosling");
                o1.add("Dennis Ritchie");
                o1.add("Bjarne Stroustrup");
        
                List<String> o2 = new ArrayList<>();
                o2.add("/*...*/");
                o2.add("\\");
                o2.add("Both  1 and 4");
                o2.add("//");
        
                List<String> o3 = new ArrayList<>();
                o3.add("left-right");
                o3.add("bottom-up");
                o3.add("Right-left");
                o3.add("Top -down");
        
                List<String> o4 = new ArrayList<>();
                o4.add(".js");
                o4.add(".txt");
                o4.add(".class");
                o4.add(".cpp");
        
                List<String> o5 = new ArrayList<>();
                o5.add("@var");
                o5.add("6var");
                o5.add("var_12");
                o5.add("var@23");
            
                Question Q1 = new Question("Who invented c++ Programming?", o1, 3);
                Question Q2 = new Question("Comments in c++?", o2, 2);
                Question Q3 = new Question("Which is the following approch used by c++?", o3, 1);
                Question Q4 = new Question("What is the extension of c++ code files?", o4, 3);
                Question Q5 = new Question("Correct Identifier in c++?", o5, 2);
        
                questions.add(Q1);
                questions.add(Q2);
                questions.add(Q3);
                questions.add(Q4);
                questions.add(Q5);}
            else if(a==4){  List<String> o1 = new ArrayList<>();
                o1.add("James Gosling");
                o1.add("Guido van Rossum");
                o1.add("Dennis Ritchie");
                o1.add("Bjarne Stroustrup");
        
                List<String> o2 = new ArrayList<>();
                o2.add("no");
                o2.add("Both 1 and 3");
                o2.add("yes");
                o2.add("none");
        
                List<String> o3 = new ArrayList<>();
                o3.add("Compiled");
                o3.add("Both 1 and 2");
                o3.add("interpreted");
                o3.add("none ");
        
                List<String> o4 = new ArrayList<>();
                o4.add(".js");
                o4.add(".txt");
                o4.add(".class");
                o4.add(".py");
        
                List<String> o5 = new ArrayList<>();
                o5.add("lowercase");
                o5.add("uppercase");
                o5.add("Capitalize");
                o5.add("None of the mentioned");
            
                Question Q1 = new Question("Who developed python Programming?", o1, 1);
                Question Q2 = new Question("Python is case sensitive?", o2, 2);
                Question Q3 = new Question("iIs python code compliled or interpreted?", o3, 1);
                Question Q4 = new Question("What is the extension of python?", o4, 3);
                Question Q5 = new Question("All keyword is python are?", o5, 3);
        
                questions.add(Q1);
                questions.add(Q2);
                questions.add(Q3);
                questions.add(Q4);
                questions.add(Q5);}
          
    }

    public static void register(Scanner sc) {

        System.out.print("Enter a Username: ");
        String username = sc.nextLine();
        System.out.print("Enter a Password: ");
        String password = sc.nextLine();

        // Check if the username is already taken
        for (User user : users) {
            if (user.username.equals(username)) {
                System.out.println("Username already taken. Please choose another one.");
                return;
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("Registration successful! You can now log in now.");
    }

    public static void login(Scanner sc) {

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Validate credentials
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                loggedInUser = user;
                sessionOpen = true;
                startExam(sc);
                return;
            }
        }

        System.out.println("Invalid credentials. Please try again!");
    }

    public static void startExam(Scanner sc) {

        System.out.println("\nWelcome, " + loggedInUser.username + "!");
        int total=0;
        for (int i = 0; i < questions.size(); i++) {

            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + question.qtionText);
            for (int j = 0; j < question.options.size(); j++) {
                System.out.println((j + 1) + ". " + question.options.get(j));
            }

            System.out.print("Select your answer (1-" + question.options.size() + "): ");
            int userChoice = sc.nextInt();
            if (userChoice == question.correctOption + 1) {
                 total++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
            System.out.println("\t\t---------------Your total marks is:- " +total+"--------------");
        System.out.println("Exam completed!");
        sessionOpen = false;
    }
}
