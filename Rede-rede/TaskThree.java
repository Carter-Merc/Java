
import java.util.Scanner; 
import java.security.SecureRandom; 

public class TaskThree{

    public static void main(String[] args){
        SecureRandom random = new SecureRandom(); 
        Scanner input = new Scanner(System.in); 

        int randomNumber = random.nextInt(20);        
        System.out.println("I just generated a number, can you guuess it? ");
        int guessedNumber = input.nextInt();

        if (guessedNumber == randomNumber){
            System.out.println("You're correct"); 
        } 

        if (guessedNumber > randomNumber){
        
             System.out.println("Number too High");      
        } else if (guessedNumber < randomNumber) {
                System.out.println("Number too low");
            }
//        else {
//            System.out.println("You are wrong, the number is " + randomNumber);
//        }
        

    }

}
