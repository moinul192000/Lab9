import java.util.Scanner;
public class Task9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1[] = new int[10];
        int num2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a Number :");
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a Number :");
            num2[i] = sc.nextInt();
            for (int j = 0; j < 10; j++){
                if (num1[j] == num2 [i]){
                    System.out.println("Yes");
                    break;
                } else {
                    System.out.println("No");
                    break;
                }
            }

        }


    }
}