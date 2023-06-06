/*Write a program to input two integers A & B from user and print their HCF.
 */
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        System.out.print("Enter any two integers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf=1;
        for (int i = 1; i <= a || i<= b; i++) {
            if(a % i == 0 && b % i == 0) hcf=i;
        }
        System.out.print("HCF of " + a + " & " + b + " is " +hcf); 
    }
}