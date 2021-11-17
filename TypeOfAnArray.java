import java.util.Scanner;
public class TypeOfAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {
            int number = scan.nextInt();
            if (number % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        if (evenCount == size)
            System.out.println("Its an even type of array");
        else if (oddCount == size)
            System.out.println("Its an odd type of array");
        else
            System.out.println("Its an mixed type array");
    }
}
