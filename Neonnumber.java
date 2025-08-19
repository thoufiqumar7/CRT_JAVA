import java.util.Scanner;

public class Neonnumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int a=n*n;
        int sum=0;
        while(a>0){
            sum +=a%10;
            a = a/10;
        }
        if(sum == n){
            System.out.println("It is a neon number");
        }
        else{
            System.out.println(" It is not");
        }
    }
}
