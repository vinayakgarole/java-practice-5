//handshakes  =  ( (N-1) * N ) / 2
import java.util.Scanner;
public class Handshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int total = num * (num-1) / 2;

        System.out.println("For "+ num +" people there will be " +total+" handshakes");
    }
}