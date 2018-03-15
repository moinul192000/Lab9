import java.util.Scanner;
public class Task1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for (int c = 1;c<=3;c++){
            System.out.println("Enter a Number : ");
            a[c] = sc.nextInt();
        }
        a[0] = a[1] + a[2] + a[3];

        for (int i=0; i<=3 ; i++){
            if(i == 3){
                System.out.print(a[i]);
            } else {
                System.out.print(a[i]+",");
            }
        }
    }
}
