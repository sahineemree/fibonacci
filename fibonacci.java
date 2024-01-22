import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci değerini bulmak istediğiniz sayıyı giriniz : ");
        int n = input.nextInt();

        int f1 = 1 , f2 = 1 , f3 = 0;

        System.out.print(f1+" " + f2+" ");
        for (int i=0 ; i<n-2 ; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;

        }
        System.out.println();
        System.out.println(n + ". fibonacci sayısı = " + f3);
    }
}