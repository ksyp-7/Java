import java.util.*;
public class si {   
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b,c,si;
        System.out.print("Enter prise ==> ");
        a=s.nextInt();
        System.out.print("Enter Rate Of Intrust==> ");
        b=s.nextInt();
        System.out.print("Enter Dureation ==> ");
        c=s.nextInt();
        si=(a*b*c)/100;
        System.out.print("Intrust ==> "+si);
    }
}
