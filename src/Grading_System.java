import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Grading System");
        if (x > 90){
            System.out.println("Excellent");
        } else if (x > 80 && x <= 90) {
            System.out.println("Good");

        }else if(x > 70 && x <= 80){
            System.out.println("Fair");
        }else if(x > 60 && x <= 70){
            System.out.println("Meets expectations");
        }else{
            System.out.println("Below par");

        }
    }
}
