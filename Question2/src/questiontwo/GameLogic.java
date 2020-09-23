package questiontwo;

import java.util.InputMismatchException;
import java.util.Scanner;

// @author User

public class GameLogic {
    
    static Scanner userInput = new Scanner(System.in);
   
    public void startWordWarsGame(){
        int startGameTrigger;
        System.out.println("Welcome to the WORD WARS game.");
        System.out.println(" ");
        System.out.println("Press (1) To start the game.");
        System.out.println(" ");
        System.out.println("Press any other key to exit the game");
        System.out.print("Enter your selection: ");
        try{
            startGameTrigger = userInput.nextInt();
            if(startGameTrigger == 1){
                System.out.println("***********************************************");  
                CreatePlayers createPlayers = new CreatePlayers();
                createPlayers.setNameOfPlayerOne();
                createPlayers.setNameOfPlayerTwo();
                theGameLogic(createPlayers.getNameOfPlayerOne(), createPlayers.getNameOfPlayerTwo());
            }
            else{
                System.out.println("Game Closing...");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Game Closing...\n");
        }     
    }  
    
    public void theGameLogic(String nameOfPlayerOne, String nameOfPlayerTwo){
        
        // Keeps track of the score of player 1 and player 2
        int scoreOfPlayerOne = 0;
        int scoreOfPlayerTwo = 0;
        
        // The word that player 1 or player 2 will choose from the remaining letters
        String theChoosenWord;
        
        // if both players agree on the word they will enter 'Y'
        String bothPlayerAgreeWithTheWord;
        boolean isChoosenWordByPlayerReal = false;  
        
        // Keeps track of all selected letters by adding new letters to this variable
        String oldSelectedLetters = "";
        boolean checkAvailableLetters = true;

        
        // Since the whole game will be on a loop, every even number will represent player 1 and vice versa 
        int checkWhoIsPlaying = 0; 
        String thePlayerThatIsPlaying;
        
        // the game will forver be in a loop until player one or two enters '???'
        boolean theGameStarted = true;      
        
        GenerateRemaingLetters generateRemaingLetters = new GenerateRemaingLetters();
        PreviouslySelectedLetters checkLetters = new PreviouslySelectedLetters();
        CheckWhoWonTheGame checkWhoWonTheGame = new CheckWhoWonTheGame();
        KeepTheVowels withoutVowels = new KeepTheVowels();
        CapitaliseTheFirstLetterOfName letter = new CapitaliseTheFirstLetterOfName();
        
        
        System.out.println(" ");
        System.out.println("LETS PLAY WORD WARS!!!");

        // Generating all Alphabet from a - z
        generateRemaingLetters.modifiedLetters("", "");
        
        // This will switch depending on which player is playing 'Player One' or 'Player Two'
        
        do{
            if(checkWhoIsPlaying % 2 == 0){ 
                thePlayerThatIsPlaying = nameOfPlayerOne;
            }
            
            else {
                thePlayerThatIsPlaying = nameOfPlayerTwo;
            }

            System.out.print(letter.capitaliseTheFirstLetterOfName(thePlayerThatIsPlaying) + " enter your word: ");
           
            do{
               theChoosenWord = userInput.nextLine().toLowerCase(); 
            }
            while(theChoosenWord.isEmpty());

            if(theChoosenWord.equalsIgnoreCase("???")){
                checkWhoWonTheGame.theGameWinner(scoreOfPlayerOne, scoreOfPlayerTwo, nameOfPlayerOne, nameOfPlayerTwo);
            }
            
            // This will check if any letter we used from the word any player choose
            
            do{
                // during the first round there are no previously selected letters 
                // Therefore this will start checking from fround one
                if(checkWhoIsPlaying >= 1){
                    if(checkLetters.oldSeletedLetters(theChoosenWord, oldSelectedLetters)){
                        System.out.print(letter.capitaliseTheFirstLetterOfName(thePlayerThatIsPlaying) + " enter your word: ");
                        theChoosenWord = userInput.nextLine().toLowerCase();
                        if(theChoosenWord.equalsIgnoreCase("???")){
                            checkWhoWonTheGame.theGameWinner(scoreOfPlayerOne, scoreOfPlayerTwo, nameOfPlayerOne, nameOfPlayerTwo);
                        }  
                    }
                    else {
                        checkAvailableLetters = false;
                    }
                }
                else if(checkWhoIsPlaying == 0){
                    // checkAvailableLetters = 0 there is no need to check used letters because we are still on the first round                 
                    checkAvailableLetters = false;
                }
            }
            while(checkAvailableLetters);
            checkAvailableLetters = true;

            do{
                System.out.println("Enter (y) yes if both players agree on the word");
                bothPlayerAgreeWithTheWord = userInput.nextLine().toLowerCase();
                switch (bothPlayerAgreeWithTheWord) {
                    case "y":
                        if(thePlayerThatIsPlaying.equalsIgnoreCase(nameOfPlayerOne)){
                            scoreOfPlayerOne++;
                        }
                        else if(thePlayerThatIsPlaying.equalsIgnoreCase(nameOfPlayerTwo)){
                            scoreOfPlayerTwo++;
                        }
                        isChoosenWordByPlayerReal = true;
                        break;
                    case "n":
                        System.out.print(letter.capitaliseTheFirstLetterOfName(thePlayerThatIsPlaying) + ": Enter another word '" + theChoosenWord + "' is not a real word: ");
                        theChoosenWord = userInput.nextLine();
                        break;
                    case "???":
                        checkWhoWonTheGame.theGameWinner(scoreOfPlayerOne, scoreOfPlayerTwo, nameOfPlayerOne, nameOfPlayerTwo);

                    default:
                        System.out.println("Please choose (Y) if you both agree on the word. \nor (N) if not \nor (???) to exit the game");
                        break;
                }
            }
            while(!isChoosenWordByPlayerReal);
            isChoosenWordByPlayerReal = false;

            theChoosenWord = withoutVowels.WordWithOutVowels(theChoosenWord);
            
            if(checkWhoIsPlaying == 0){
                generateRemaingLetters.modifiedLetters(theChoosenWord, "");
            }
            else{
                generateRemaingLetters.modifiedLetters(theChoosenWord, oldSelectedLetters);
            }
            oldSelectedLetters = oldSelectedLetters.concat(theChoosenWord);
            checkWhoIsPlaying++;
        }
        while(theGameStarted);
    
    }
    
}

