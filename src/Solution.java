
   import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // HashSet only stores unique elements
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        // 1. Read the number of integers N
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            // 2. Read N integers and add them to the HashSet
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    uniqueNumbers.add(sc.nextInt());
                }
            }

            // 3. Print the unique numbers separated by space
            Iterator<Integer> it = uniqueNumbers.iterator();
            while (it.hasNext()) {
                System.out.print(it.next());
                if (it.hasNext()) {
                    System.out.print(" ");
                }
            }
            // Optional: Print a newline at the end
            System.out.println();
        }

        sc.close();
    }
}