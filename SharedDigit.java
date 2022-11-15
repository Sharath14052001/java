public class SharedDigit {
    static boolean hasSharedDigit(int number1,int number2){
        if(number1<10||number1>99||number2<10||number2>99){
            return false;
        }
        int check=0;
        int remainder1=0;
        int remainder2=0;
        while(number1>0&&number2>0){
           remainder1=number1%10;
           remainder2=number2%10;
           number1/=10;
           number2/=10;
           if(remainder1==remainder2||number1==remainder2||remainder1==number2||number1==number2){
               return true;
           }

        }
        return false;
    }
    public static void main (String[] args){
        System.out.println(hasSharedDigit(12,23));
        int number=12;
        int number2=number%10;
        System.out.println(number2);
    }
}
