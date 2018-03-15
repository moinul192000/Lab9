import java.util.Scanner;
public class Task3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a Number :");
            num[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            if (i == 0){
                System.out.print(num[i]);
            } else {
                System.out.print(num[i]+",");
            }
        }
    }
}