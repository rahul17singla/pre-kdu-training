import java.util.Scanner;

public class javaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        System.out.println("The length of the first string is: " + firstString.length());
        System.out.println("The length of the second string is: " + secondString.length());
        if (firstString.length() == secondString.length()) {
            System.out.println("The length of the two strings are the same.");
        } else {
            System.out.println("The length of the two strings is not the same.");
        }

        if (firstString.equals(secondString)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }

        sc.close();
    }
}
