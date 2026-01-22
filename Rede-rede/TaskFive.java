
import java.util.Scanner; 
import java.security.SecureRandom; 

public class TaskFive{

    public static void main(String[] args){
        SecureRandom random = new SecureRandom(); 
        Scanner input = new Scanner(System.in); 

        int randomNumber = random.nextInt(20);  

        System.out.println("I just generated a number, can you guuess it? ");
            int guessedNumber = input.nextInt();

        
                if (guessedNumber > randomNumber){
                
                     System.out.println("Number too High");      
                } else if (guessedNumber < randomNumber) {
                        System.out.println("Number too low");
                }
      
        int counter = 1; 

        while (guessedNumber != randomNumber){

                System.out.println("I just generated another number, can you guuess it? ");
                 guessedNumber = input.nextInt();


                if (guessedNumber > randomNumber){
                
                     System.out.println("Number too High");      
                } else if (guessedNumber < randomNumber) {
                        System.out.println("Number too low");
                }
                counter++;
    
        } 

        
        
        if (guessedNumber == randomNumber){
                    System.out.println("You're correct");
                    System.out.println("The number is " + randomNumber);
                    System.out.println("You guessed " + counter + " times");
                } 
            
            

    }

}





