import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args){

        int num;
        int counter=2;

        Scanner key = new Scanner(System.in);

        System.out.println("Please enter a number greater than zero: "); //Option 1
        num = key.nextInt();

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
            System.out.println("Invalid number.");
        }
    }
}
