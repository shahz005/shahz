import java.util.Scanner;


public class MyClass {
    public static void main(String args[]) {
      rateTeam();
     System.exit(0);
    }
    public static void rateTeam()
    {
        Scanner scan = new Scanner(System.in);
         String playerName;
         int score = -1;
        
        for (int i =1; i<=11; i++)
        {
        System.out.println ("please type in your player name");
        playerName = scan.next();

        System.out.println("please enter the score");
        score = scan.nextInt();
        
        while(score<0 || score>=10){
            System.out.println("enter the correct range 1-10");
            score = scan.nextInt();
        }
     
             
            if (score >=8)
            {
                System.out.println(playerName + ", you are a star!");
            } 
            else if (score<=5)
            {
                System.out.println(playerName + ", you are a flop!!");
            }
            else
                System.out.println(playerName + ", you are a solid");
            
            } 
            
               
            
    
}
}
    