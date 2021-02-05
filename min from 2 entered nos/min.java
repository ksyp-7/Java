import java.util.*;
public class min{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("Enter no1 ==> ");
        a=s.nextInt();
        System.out.print("Enter no2 ==> ");
        b=s.nextInt();
        if(a<b){
            System.out.print(a+" Is Less Than "+b);
        }else{
            System.out.print(b+" Is Less Than "+a);
        }
    }
}