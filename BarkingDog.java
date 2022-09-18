public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hoursOfDay){
        if(hoursOfDay<0 || hoursOfDay>23){
            System.out.println("invalid");
           return false;
        }
        if (barking==true&&hoursOfDay<8||hoursOfDay>22) {
            System.out.println("need to wake up");
            return true;
        }else {
            System.out.println("don't need to wake up");
            return false;
        }
    }
    public static void main(String[] args){
        shouldWakeUp(true,34);
        shouldWakeUp(false,12);
        shouldWakeUp(true,2);
    }
}
