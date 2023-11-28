import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class javaCollection {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        n = sc.nextInt();
        ArrayList<String> ls = new ArrayList<String>();
        HashSet<String> st = new HashSet<String>();
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ls.add(s);
            st.add(s);
            int val = mp.getOrDefault(s, 0);
            mp.put(s, val + 1);
        }
        // System.out.println(mp);
        System.out.println("\nList Contains:");
        for (var item : ls) {
            System.out.println(item);
        }
        System.out.println("\nSet Contains:");
        for (var item : st) {
            System.out.println(item);
        }
        System.out.println("\nFrequency of the words:");
        for (var item : mp.entrySet()) {
            System.out.println("Word = " + item.getKey() + ", Frequency = " + item.getValue());
        }

        sc.close();
    }
}
