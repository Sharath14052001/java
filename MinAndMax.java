import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int min=219344555;
        int max=-222222222;
int counter=0;
        while(true){
            int order =counter+1;
            System.out.println("enter number:" + order);
            boolean hasNextInt= scanner.hasNextInt();

            if(hasNextInt){
                int number= scanner.nextInt();
                counter++;
                if(number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min= "+min + " max ="+ max);
        scanner.close();
    }
}

