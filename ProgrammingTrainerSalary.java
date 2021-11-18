import java.util.Scanner;

public class ProgrammingTrainerSalary {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] week=new int[7];
        int salary=0;
        int totalDuration=0;
        for(int i=0;i<7;i++) {
            week[i] = scan.nextInt();
            totalDuration+=week[i];
            if (week[i]>8)
                salary+=(week[i]-8)*15+week[i]*100;
            else
                salary+=week[i]*100;
        }
        if(totalDuration-week[0]-week[6]>40)
            salary+=(totalDuration-week[0]-week[6]-40)*25;
        if(week[0]!=0)
            salary+=week[0]*50;
        if(week[6]!=0)
            salary+=week[6]*25;
        System.out.println("Jeevitha's monthly salary is  "+ salary);
    }
}
