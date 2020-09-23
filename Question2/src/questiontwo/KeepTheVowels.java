package questiontwo;

// @author User

public class KeepTheVowels {
    public String WordWithOutVowels(String theChoosenWordRaw){
        
        // truning every letter to lover case so that we do not get confused
        String theChoosenWord = theChoosenWordRaw.toLowerCase();
        String vowels = "[aeiouAEIOU]";
        String theNewChoosenWord;
        
        // Removing all vowels from theNewChoosenWord
        theNewChoosenWord = theChoosenWord.replaceAll(vowels, "").trim();
        return theNewChoosenWord;  
    }
}
