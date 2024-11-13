import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        // TO take input import Scanner class at the top of the file
        // import java.util.Scanner;
        // Make an object of the scanner and take input from object
        Scanner scan = new Scanner(System.in);
        System.out.println("You age: ");
        int ageInput = scan.nextInt();
        System.out.println("You are " + ageInput);

        System.out.println("Over 18?");
        boolean over18Input = scan.nextBoolean();

        System.out.println("You weight: ");
        double weightInput = scan.nextDouble();

        // After using scanner for primitive data and want input for String
        // you need to clear the enter input
        scan.nextLine();
        System.out.println("You name?");
        String name = scan.nextLine();
        scan.close(); // must close scanner object to avoid input locks
    }
}