import java.util.Scanner;
public class Task11 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0 ; i <= 9; i++){
            System.out.println("Enter Number");
            a[i] = sc.nextInt();
            for (int c = 0; c < i; c++){
                if (a[i]==a[c]){
                    System.out.println("Invalid Input.Enter Different number.");
                    i--;
                }
            }
        }
    }
}
