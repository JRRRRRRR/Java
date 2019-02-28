import java.lang.*;
import java.util.Scanner;
public class lab71{
    public static void main(String[] args) {
        String first, second, third, temp;
        System.out.println("Enter the first city: ");
        Scanner stdin = new Scanner(System.in);
        first = stdin.nextLine();
        System.out.println("Enter the second city: ");
        Scanner stdin2 = new Scanner(System.in);
        second = stdin2.nextLine();
        System.out.println("Enter the third city: ");
        Scanner stdin3 = new Scanner(System.in);
        third = stdin3.nextLine();
        if (first.compareTo(second) > 0){
            temp=first;
            first=second;
            second=temp;
        }
        if(first.compareTo(third) > 0){
            temp=first;
            first=third;
            third=temp;
        }
        if(second.compareTo(third) > 0){
            temp=second;
            second=third;
            third=temp;
        }

        System.out.println(first + " " + second + " " + third);
    }
}