package questiontwo;

//@author User

public class PreviouslySelectedLetters {
    
    public boolean oldSeletedLetters(String theChoosenWord, String OldSelectedLetters){
        
        // Turning the users input into an char array so we can easily
        char[] theChoosenWordToArray = theChoosenWord.toCharArray();
     
        for(char letter : theChoosenWordToArray){
            
            // This checks if the word that the user entered doesnt conatin any previously used letters
            if(OldSelectedLetters.contains(Character.toString(letter))){
                System.out.println("The letter '" + letter + "' has already been selected, Try another word!");
                return true;
            }
        }
        
        return false;
    }
}
