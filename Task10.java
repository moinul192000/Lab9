import java.util.Scanner;
public class Task10 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int c = 0; c < 10 ; c++){
            System.out.println("Enter number: ");
            a[c] = sc.nextInt();
            for (int i = 0; i<=c ; i++){
                if (i == 9){
                    System.out.print(a[i]);
                } else {
                    System.out.print(a[i]+",");
                }
            }
        }
    }
}
