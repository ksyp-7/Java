import java.util.*;
class disp{
    int size;
    int i=1;
    disp(int X){
        size=X;
    }
    void dis(int a,int b){
        int c;
        if(i<=size){
            System.out.print(a+"\t");
            c=a+b;
            a=b;
            b=c;
            i++;
            dis(a,b);
        }
    }
}

class Fibonsic{
    public static void main(String args[]){
    int no;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of elements : ");
    no=sc.nextInt();
    disp d=new disp(no);
    d.dis(0,1);
    }
}