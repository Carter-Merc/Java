import java.util.Scanner; 

public class SalesCal{


    public static void main(String[] args){
    Scanner input = new Scanner(System.in); 

       int item= 0; 
       double itemAmount = 0; 
       int counter = 0;
       double totalAmount;
       double totalEarning = 0; 



    System.out.print("There are four Items on this Catalogue \n Each Represented respectively by 1, 2, 3, and 4.\n" );
    System.out.println("Enter the Item Identifier for this sale(1, 2, 3, 4): "); 
    item = input.nextInt(); 



    while(item != -1){
        
        if(item == 1){
           itemAmount += 239.99; 
           counter++;     
        } 
        else if(item == 2){
           itemAmount += 129.75;
           counter++; 
        }
        else if(item == 3){
           itemAmount += 99.95;
           counter++;  
        }
        else if(item == 4){
           itemAmount += 350.89; 
           counter++; 
        }

        totalAmount = itemAmount; 
        totalEarning = (itemAmount * 0.9) + 200.0; 


       

        System.out.println("Enter the Item Identifier for this sale(1, 2, 3, 4) Or -1 to end Program: "); 
        item = input.nextInt(); 

   } 

    
        System.out.println("The total amount Items sold is: " + itemAmount +"$");
        System.out.println("Your total earnings for this sales session is: " + totalEarning +"$");
    
       
      
    }
}
