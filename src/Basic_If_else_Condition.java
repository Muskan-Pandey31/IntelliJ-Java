import java.util.Scanner;

public class Basic_If_else_Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0){
            System.out.println("The number is even:"+ x);
        }else{
            System.out.println("The number is odd:"+ x);
        }
    }
}
