import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();

            // Write your code here.
            double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }
}