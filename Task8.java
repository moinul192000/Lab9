import java.util.Scanner;
public class Task8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a Number :");
            num[i] = sc.nextInt();
        }

        for (int i = 9; i >= 0; i--){
            if(num[i] % 2 == 0){
                System.out.println(num[i]+" Is even Number");
            }
        }
    }
}