import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i=1;
            while(sc.hasNext()){
                String s=sc.nextLine();
                System.out.println(i+++" "+s);
            }
        }  
    }
}