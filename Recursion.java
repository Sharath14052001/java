public class Recursion {
    public static void main(String[] args) {
        System.out.println(powerOf2(-6));
    }

    static int powerOf2(int n) {
        int power;
        if(n<0){
            return -1;
        }
        if (n == 0) {
            return 1;
        } else {
            power = 2 * powerOf2(n - 1);
        }
        return power;
    }
}
