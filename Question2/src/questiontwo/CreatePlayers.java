package questiontwo;

// @author User

import java.util.Scanner;

public class CreatePlayers {
    static Scanner userInput = new Scanner(System.in);
    private String nameOfPlayerOne;
    private String nameOfPlayerTwo;
    
    // The set methods for player 1
    public void setNameOfPlayerOne(){
        System.out.print("Enter player 1 name: ");
        this.nameOfPlayerOne = userInput.nextLine();
    }
    
    // The set methods for player 2
    public void setNameOfPlayerTwo(){
        System.out.print("Enter player 2 name: ");
        this.nameOfPlayerTwo = userInput.nextLine();
    }
    
    // The get methods for player 1
    public String getNameOfPlayerOne(){
        return this.nameOfPlayerOne;
    }
    
    // The set methods for player 2
    public String getNameOfPlayerTwo(){
        return this.nameOfPlayerTwo;
    }  
}
