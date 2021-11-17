import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] array = new int[size];
        int minimum=Integer.MAX_VALUE,maximum=Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            array[i] = scan.nextInt();
            if (array[i]>maximum)
                maximum=array[i];
            if(array[i]<minimum)
                minimum=array[i];
        }
        int range= maximum -minimum;
        System.out.println("The range of the array is "+ range);

    }
}
