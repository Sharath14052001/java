public class Recursion1 {

    public static void main(String[] args) {
        Recursion1 recursion1=new Recursion1();
        var rec=recursion1.fibonacci(10);
        System.out.println(rec);
    }


    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
