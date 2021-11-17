import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int operations=0;
        System.out.print(number + " ");
        while (number != 1 ){
            if (number % 2 != 0) {
                number = 3 * number + 1;
            } else {
                number /= 2;
            }
            System.out.print(number + " ");
            operations++;
        }
        System.out.print(operations + " ");

    }
}
