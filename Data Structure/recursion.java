class fact{
    int fac(int n){
        int r;
        if(n == 1){
            return 1;
        }
        r=n*fac(n-1);
        return r;
    }
}
class recursion{
    public static void main(String args[]){
        fact f = new fact();
        System.out.println("Factorial of 5 ==> "+f.fac(5));
        System.out.println("Factorial of 1 ==> "+f.fac(1));
    }
}