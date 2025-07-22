import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String name = "Password";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("a");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("a", "x");

        /*
        if(name.isEmpty())
        {
            System.out.println("Your name is empty!");
        } else {
            System.out.println("Your name is: " + name);
        }
        System.out.println(name);

        if(name.contains(" "))
        {
            System.out.println("Your name contains spaces");
        } else {
            System.out.println("Your name doest contain spaces ");
        }


        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        } else {
            System.out.println("Hello " + name);
        }


         */

        //Substring

        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Emails must contain @");
        }

        scanner.close();


    }
}
