public class EvenDigitSum {
    static int getEvenDigitSum(int numbers){
        if(numbers<0){
            return -1;
        }
        int sum=0;
        int remainder=0;
        while (numbers>0){
            remainder=numbers%10;
            numbers/=10;
            if(remainder%2==0){
                sum+=remainder;
            }

        }return sum;
    }
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(123456789));
    }
}
