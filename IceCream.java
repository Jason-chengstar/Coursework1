import java.util.Objects;
import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        int price_v = 11;
        int price_c = 41;
        int price_s = 80;
        int price = 0;
        System.out.println("Would you like vanilla ,chocolate or strawberry");
        Scanner sc = new Scanner(System.in);
        String flavor = sc.nextLine();
        if (Objects.equals(flavor, "vanilla")) {
            price = price_v;
        }else if (Objects.equals(flavor, "chocolate")) {
            price = price_c;
        }else if (Objects.equals(flavor, "strawberry")) {
            price = price_s;
        } else {
            System.out.println("We don't have that flavor");

        }
        if (price != 0) {
            System.out.println("How many scoops would you like?");
            int scoops = sc.nextInt();
            if (0 < scoops && scoops <= 3) {
                System.out.println("That would be " + price * scoops + " please");
            } else if (scoops == 0) {
                System.out.println("We don't sell just a cone");
            } else if (scoops > 3) {
                System.out.println("That's too many scoops in a cone");
            }

        }

    }

}