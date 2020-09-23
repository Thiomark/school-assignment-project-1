package questiontwo;

// @author User

import java.util.Arrays;

public class GenerateRemaingLetters {

    public void modifiedLetters(String oldSelectedLetters, String theChoosenWord){
        
        // Regex does work with ""
        // This is for the first round where by they are no letters removed 
        if(oldSelectedLetters.equals("") && theChoosenWord.endsWith("")){
            
            // Creating all the alphabets from A - Z
            char[] alphabet = new char[26];

            for(char ch = 'a'; ch <= 'z'; ++ch){
                    alphabet[ch-'a'] = ch;  
            }
            System.out.print("Alphabet letters left: ");
            for(char letter : alphabet){
                System.out.print(letter + " ");
            }
            System.out.println("");
        }
        else{
            // Regex requres everything to be inside []
            String lettersThatWillBeRemoved = "[" + oldSelectedLetters + theChoosenWord + "]";
            lettersThatWillBeRemoved = lettersThatWillBeRemoved.trim();

            // Generating all letters

            char[] alphabet = new char[26];

            for(char ch = 'a'; ch <= 'z'; ++ch){
                    alphabet[ch-'a'] = ch;  
            }

            // Using Regex to remove letters that we do not need
     
            String stringOfalphabets = Arrays.toString(alphabet).trim();

            String newStringOfalphabets = stringOfalphabets
                    .replaceAll(lettersThatWillBeRemoved, "")
                    .replaceAll("\\[|\\]", "")
                    .replaceAll(",", "").trim();
            char[] listOfLetters = newStringOfalphabets.toCharArray();
            System.out.print("Alphabet letters left: ");
            for(char letter : listOfLetters){
                if(letter == ' '){

                }
                else{
                   System.out.print(letter + " "); 
                }   
            }
            System.out.println("");
        }
    }
}
