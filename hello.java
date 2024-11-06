import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student number: ");
        String number = sc.nextLine();
        System.out.println("Hello,student "+number);
    }

}
