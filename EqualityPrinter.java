public class EqualityPrinter {
    public static void printEqual(int a,int b, int c){
        if(a<0||b<0||c<0){
            System.out.println("invalid");
        } else if (a==b&&b==c&&a==c) {
            System.out.println("all values are same");
        }else {
            System.out.println("different values");
        }
    }
    public static void main(String [] args){
        printEqual(1,4,5);
        printEqual(-1,3,5);
        printEqual(1,1,1);
    }
}
