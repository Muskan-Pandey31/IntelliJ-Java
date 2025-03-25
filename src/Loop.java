import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("------While loop------");
        while(i <= 100){
            System.out.println(i);
            i++;
        }
        System.out.println("Done");
        System.out.println("------For loop------");
//        int j = sc.nextInt();
        for (int j = 0; j <= 10; j++){
            System.out.println(j);
        }
    }
}
