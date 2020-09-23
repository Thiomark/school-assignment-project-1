package questiontwo;

// @author User

public class CheckWhoWonTheGame {
    public void theGameWinner(int scoreOfPlayerOne, int scoreOfPlayerTwo, String nameOfPlayerOne, String nameOfPlayerTwo){
        if(scoreOfPlayerOne == scoreOfPlayerTwo){
            System.out.println("THE GAME IS TIED: with a scrore of : " +  scoreOfPlayerOne);
            System.out.println("YOUR NAMES WILL BOTH GO ON THE WALL OF SHAME!!!");
            System.out.println("THE GAME IS NOW OVER. THANKYOU FOR PLAYING WORD WAR!!!");
        }
        else if(scoreOfPlayerOne > scoreOfPlayerTwo){
            System.out.println("WINNER OF THEM GAME IS: " + nameOfPlayerOne.toUpperCase() + " with a score of: " + scoreOfPlayerOne);
            System.out.println("YOUR NAME HAS BEEN SAVED TO THE WALL OF FAME!!!");
            System.out.println("THE GAME IS NOW OVER. THANKYOU FOR PLAYING WORD WAR!!!");
        }
        else if(scoreOfPlayerOne < scoreOfPlayerTwo){
            System.out.println("WINNER OF THEM GAME IS: " + nameOfPlayerTwo.toUpperCase() + " with a score of: " + scoreOfPlayerTwo);
            System.out.println("YOUR NAME HAS BEEN SAVED TO THE WALL OF FAME!!!");
            System.out.println("THE GAME IS NOW OVER. THANKYOU FOR PLAYING WORD WAR!!!");
        }
        System.exit(0);
    }
}
