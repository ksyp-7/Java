import java.util.*;
class Linear{
    public static void main(String args[]){
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array ==>  ");
        size = sc.nextInt();
        int a[] = new int[size];
        int no,i,ck=0;
        for(i=0; i<size; i++){
            System.out.print("Enter a["+i+"] element: ");
            a[i]=sc.nextInt();
        }


        System.out.print("Enter Search Element :   ");
        no=sc.nextInt();


        for(i=0; i<size; i++){
            if(a[i] == no){
                System.out.print(no+" Is Found At Position No "+i);
                ck=1;
                break;
            }
        }
        if(ck == 0){
            System.out.print(no+" Is Not Found ");
        }
    }
}