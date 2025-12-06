import java.util.Scanner; 

public class Nokia_C13{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in); 

    String menu = """

        || NOKIA C13 || 
    1. Phone Book
    2. Messages
    3. Chat
    4. Call Register
    5. Tones
    6. Settings
    7. Call Divert
    8. Games
    9. Calculator
    10. Reminders
    11. Clock
    12. Profiles
    13. SIM Services

  ------------------------- """; 

    System.out.println(menu);
    System.out.println("Enter Option: ");
    int menuOption = input.nextInt();
    
    switch(menuOption){

        case 1 -> {
        
        String phoneBookOption = """ 
          -----Phone Book-----

            1. Search
            2. Service Nos.
            3. Add name
            4. Erase
            5. Edit
            6. Assign tone
            7. Send b'card
            8. Option
            9. Speed dials
            10. Voice tags

          ---------------------- """;
        System.out.println(phoneBookOption);    
        System.out.println("Enter Option: ");
        menuOption = input.nextInt();
            switch(menuOption){
                case 1 -> {
                        menu = """ 
                      ----- Search Phonebook------
                          Frequently Called
                          Favorites Contacts
                          Blocked Contacts
                          General
                     -------------------------------"""; 
                System.out.println(menu);}
                case 2 -> {System.out.println("Service Nos");}
                case 3 -> {System.out.println("Add Names");}
                case 4 -> {System.out.println("Erase");}
                case 5 -> {System.out.println("Edit");}
                case 6 -> {System.out.println("Assign tone");}
                case 7 -> {System.out.println("Send b'card");}
                case 8 -> {
                        menu = """
                    ----- OPTIONS ------
                        1. Type of views
                        2. Memory Status
                    --------------------""";
                    System.out.println(menu); 
                     System.out.print("Enter option: ");
                     menuOption = input.nextInt();
                
                    switch(menuOption){
                        case 1 -> {System.out.println("Type of view");}
                        case 2 -> {System.out.println("Type of view");}
                        case 3 -> {System.out.println("Enter valid number");}
                    }  
                
                
                }
                case 9 -> {System.out.println("Speed dials");}
                case 10 -> {System.out.println("voice tags");}
                default -> {System.out.println("Enter valid Number");}

            }      
    
        } 

        case 2 -> {
            menu =""" 
        -------- MESSAGES ------
        1. Write Message
        2. Inbox
        3. Outbox
        4. Picture Messages
        5. Template
        6. Smileys
        7. Messages settings
        8. Info Service
        9. Voice mailbox number
        10. Service command editor
        ------------------------------ """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        menuOption = input.nextInt();
        switch (menuOption){
            case 1 -> {System.out.println(" Write message");}
            case 2 -> {System.out.println("inboxx");}
            case 3 -> {System.out.println("outbox");}
            case 4 -> {System.out.println("picture message");}
            case 5 -> {System.out.println("Template");}
            case 6 -> {System.out.println("Smileys");}
            case 7 -> { 
                menu = """ 
              ----- Message Settings -----

                  1. Set 1
                  2. Common 3

              ------------------------------ """;        
              System.out.println(menu);
              System.out.print("Enter option: ");
              menuOption = input.nextInt();
               switch(menuOption){
                  case 1 -> {
                      menu = """
                     ------ Set ------
                      1. Message centre number
                      2. Message sent as
                      3. Message validity
  
                     ---------------------- """;
                     System.out.println(menu); 
                     System.out.print("Enter option: ");
                     menuOption = input.nextInt();

                        switch(menuOption){
                            case 1 -> {System.out.println("Message center number");}
                            case 2 -> {System.out.println("Message sent as");}
                            case 3 -> {System.out.println("Message validity");}
                                                 
                        }
                  }
               case 2 -> {
                     menu =""" 
                            ----- Message Common Setting -----
                            1. Delivery
                            2. Reply via same centre
                            3. Character support
                          --------------------------------- """;
                          System.out.println(menu);
                          System.out.print("Enter option: ");
                          menuOption = input.nextInt();
    
                             switch(menuOption){
                                case 1 -> {System.out.println("Delivery");}
                                case 2 -> {System.out.println("Reply via same centre");}
                                case 3 -> {System.out.println("Character support");}
                             }

                    
                 } 
              }
                 
             
            }
            case 8 -> {System.out.println("Info Service");}
            case 9 -> {System.out.println("Voice mailbox number");}
            case 10 -> {System.out.println("Servic Command Editor");}  

        }
         
        }
        case 3 -> {System.out.println("Chat");}
        case 4 -> {
            menu = """ 

           ----- Call Register----- 
            1. Missed Calls
            2. Received
            3. Dailled Numbers
            4. Erase recebt call lists
            
         ----------------------------- """;  
        System.out.println(menu);
        System.out.print("Enter option: ");
        menuOption = input.nextInt();

            switch(menuOption){
                case 1 -> {System.out.println("Missed Calls");}
                case 2 -> {System.out.println("Received");}
                case 3-> {System.out.println("Dailed Numbers");}
                case 4 -> {System.out.println("Erase recent call lists");}
            }
        
    
          
        } 
        case 5 -> {
            menu = """ 
          ------- TONES -------
        1. Ringing tone
        2. Ringing volume
        3. incoming call alert
        4. Composer
        5. Message alert tone
        6. Keypad tones
        7. Warning and game tones
        8. Vibrating alert
        9. Screen saver
        ---------------------------- """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        menuOption = input.nextInt();
            switch (menuOption){
                case 1 -> {System.out.println("Ringing tone");}
                case 2 -> {System.out.println("Ringing volume");}
                case 3 -> {System.out.println("Incoming alert");}
                case 4 -> {System.out.println("Composer");}
                case 5 -> {System.out.println("Message alert tone");}
                case 6 -> {System.out.println("Keypad tones");}
                case 7 -> {System.out.println("Warning and game tones");}
                case 8 -> {System.out.println("Vibrating alert");}
                case 9 -> {System.out.println("Screen saver");}
    
            }
        
        
        } 
        case 6 -> {
             menu = """
            -------- SETTINGS ------
            1. Call settings
            2. Phone Settings
            3. Security Settings
            4. Restore Factory Settings
            ---------------------------- """;
            System.out.println(menu);
            System.out.print("Enter option: ");
            menuOption = input.nextInt();

                switch(menuOption) {
                
                    case 1 -> {
                     menu = """ 

                   -----Call settings-------
                    1. Automatic redial
                    2. Speed dialling
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                   -------------------------- """;  
                    }
                }
    
               
        }
       
    }

    
    
    }
}























