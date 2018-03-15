import java.util.Scanner;
public class Task2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i<10 ;i++){
            System.out.println("Enter a Number :");
            num[i] = sc.nextInt();
        }

        System.out.println("Enter array index number: ");
        int indx = sc.nextInt();
        if (indx >= 0 && indx <= 9){
            System.out.println(num[indx]);
        } else {
            System.out.println("You have entered an invalid index Number.");
        }

    }
}
