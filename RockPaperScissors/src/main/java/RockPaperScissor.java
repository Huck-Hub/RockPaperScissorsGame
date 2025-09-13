import java.util.Random;

// backend
public class RockPaperScissor {
    // all the choices a computer can choose from
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    // store computer choice so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    // stores the computer choice so that we can retrieve and display it to the frontend
    private int computerScore, playerScore;

    // used to generate a random number
    private Random random;

    // constructor to initialize random object
    public RockPaperScissor() {
        random = new Random();
    }

    // call this method to play the game
    // playerChoice must be either "Rock", "Paper", "Scissors"
    // this method will return win, loose or draw
    public String playRockPaperScissors(String playerChoice) {
        // generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // evaluates the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player Wins!";
                playerScore++;
            } else if (playerChoice.equals("Scissors")) {
                result = "Computer Wins!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        } else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissors")){
                result = "Player Wins!";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        } else {
            // computerChoice is scissors
            if(playerChoice.equals("Rock")){
                result = "Player Wins!";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer Wins!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        }

        return result;
    }
}
