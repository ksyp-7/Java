import java.util.*;
public class max{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("Enter no 1 ==> ");
        a=s.nextInt();
        System.out.print("Enter no2 ==> ");
        b=s.nextInt();
        if(a>=b){
            System.out.print(a+" Is Grater Than "+b);
        }
        else{
            System.out.print(b+" Is Grater Than "+a);
        }
    }
}