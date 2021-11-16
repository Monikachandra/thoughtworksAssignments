import java.util.Scanner;
public class MangoTreeAssignment {
    public static int firstRow(int rows, int treeNo) {
        if (treeNo >= 1 && treeNo <= rows)
            return 1;
      return 0;
    }
    public static int lastColumn(int rows, int columns, int treeNo) {
        int lastRow = rows * columns;
        int tempMango = rows;
        while(tempMango<lastRow) {
            tempMango += rows;
            if (tempMango == treeNo)
                return 1;
        }
        return 0;
    }
    public static int firstColumn(int rows, int columns, int treeNo){
        int lastRow = rows * columns;
        int temporaryMango = 1;
            while(temporaryMango<lastRow) {
                temporaryMango += rows;
                if (temporaryMango == treeNo) {
                    return 1;
                }
            }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int treeNo=sc.nextInt();
        if (firstRow(rows,treeNo)==1 || lastColumn(rows,columns,treeNo)==1 || firstColumn(rows,columns,treeNo)==1 )
            System.out.println("yes");
        else
        System.out.println("no");

    }
}
