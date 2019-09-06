import java.util.Random;
import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args){

        int num=0;
        int counter=2;
        String random="";

        Scanner key = new Scanner(System.in);

        System.out.println("Would you like to generate a random number? (Y/N)");
        random = key.next();
        if(random.equalsIgnoreCase("Y")){
            Random r = new Random();
            num = 1 + r.nextInt(10000);
            System.out.println("Your random number is " + num);
        }else if(random.equalsIgnoreCase("N")){
            System.out.println("Please enter a number greater than zero: ");
            num = key.nextInt();
        }else{
            System.out.println("");
        }

        if(num == 1){
            System.out.println(num + " is not prime");
        }else if(num == 2){
            System.out.println(num + " is prime");
        }else if(num > 2){
            while(num > counter){
                if(num%counter == 0){
                    System.out.println(num + " is not prime");
                    break;
                }else{
                    if(num == counter + 1){
                        System.out.println(num + " is prime");
                        break;
                    }else{
                        counter++;
                    }
                }
            }
        }else{
            System.out.println("Invalid response.");
        }
    }
}
