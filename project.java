// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

//main class
public class Main {
  //main method
  public static void main(String[] args) {

    //creates word list of hard words
    String[] hardWordList = {"motorcycle", "depression", "artificial", "dependence", "foundation", "admiration", "chimpanzee", "memorandum", "provincial", "possession", "resolution", "conspiracy", "accessible", "reputation", "difficulty", "appearance", "overcharge", "mastermind", "illustrate", "protection", "presidency", "remunerate", "reasonable", "compliance", "conviction", "profession", "allocation", "convulsion", "pedestrian", "relaxation", "decoration", "repetition", "distortion", "tournament", "population", "integrated", "houseplant", "hypnothize", "commission", "experience", "reflection", "assessment", "basketball", "redundancy", "settlement", "productive", "generation", "leadership", "government", "preference", "correction", "regulation", "relinquish", "prevalence", "conclusion", "attractive", "democratic", "production", "chauvinist", "repetition", "innovation", "absorption", "litigation", "corruption", "hypnothize", "convention", "assessment", "atmosphere", "projection", "experiment", "goalkeeper", "compliance", "federation", "difficulty", "motivation", "dependence", "stereotype", "transition", "acceptable", "decoration", "laboratory", "instrument", "hypothesis", "presidency", "distortion", "definition", "assignment", "earthquake", "engagement", "conscience", "brilliance", "systematic", "separation", "opposition", "connection", "television", "foundation", "disappoint", "basketball", "instrument", "prediction", "assignment", "proportion", "dictionary", "curriculum", "disappoint", "reputation", "excitement", "provincial", "connection", "continuous", "investment", "regulation", "conspiracy", "accountant", "remunerate", "articulate", "generation", "indication", "redundancy", "straighten", "discipline", "obligation", "resolution", "incredible", "earthquake", "mastermind", "attraction", "acceptance", "nomination", "repetition", "discourage", "commitment", "absorption", "distribute", "difficulty", "motorcycle", "censorship", "unpleasant", "production", "philosophy", "conference", "conscience", "correspond", "restaurant", "government", "television", "microphone"};

    //creates word list
    String[] wordList = {"reveal", "desert", "manner", "record", "global", "accent", "depart", "appear", "please", "bottom", "follow", "oppose", "inside", "define", "regret", "gossip", "friend", "deport", "course", "helmet", "reject", "slogan", "exempt", "rhythm", "budget", "ballet", "proper", "resign", "credit", "praise", "clique", "depend", "pierce", "tycoon", "sermon", "polite", "mirror", "gravel", "gutter", "prince", "endure", "bishop", "insure", "chorus", "writer", "infect", "regard", "engine", "return", "tumble", "pocket", "muscle", "battle", "jockey", "marble", "retire", "second", "square", "dinner", "agenda", "growth", "animal", "viable", "foster", "cotton", "doctor", "update", "source", "unrest", "clinic", "latest", "reform", "fossil", "exotic", "pastel", "basket", "helmet", "defend", "cancer", "behead", "accept", "column", "bother", "matrix", "attack", "charge", "system", "wonder", "report", "bloody", "suffer", "preach", "hammer", "cousin", "mother", "settle", "museum", "gravel", "option", "throne", "writer", "runner", "trance", "return", "native", "legend", "spring", "repeat", "labour", "credit", "format", "corner", "gutter", "lesson", "blonde", "sacred", "empire", "bitter", "battle", "hunter", "excuse", "canvas", "exceed", "absent", "preach", "bronze", "mobile", "ethnic", "banner", "frozen", "cereal", "viable", "parade", "killer", "review", "agency", "gallon", "system", "trench", "bishop", "string", "artist", "ignite", "delete", "deadly", "jungle", "racism", "reader", "vision", "cellar", "earwax", "stroll", "suntan", "bitter", "master", "appear", "sphere", "minute", "damage", "carbon", "direct", "affair", "turkey", "Sunday", "temple", "social", "refuse", "lawyer", "proper", "winter", "screen", "family", "rabbit", "dollar", "lesson", "thread", "memory", "animal", "linear", "exotic", "energy", "agency", "ethics", "museum", "effort", "ladder", "absent", "ritual", "heaven", "scheme", "instal", "bounce", "belong", "misery", "copper", "velvet", "revive", "sister", "retain", "depart", "tongue", "defeat", "inside", "medium", "deputy", "mobile", "worker", "trench", "cheese", "heroin", "burial", "bronze", "import", "muscle", "energy", "design", "cancel", "arrest", "ensure", "scream", "behead", "supply", "misery", "answer", "infect", "sphere", "center", "spread", "flower", "elapse", "object", "export", "agency", "vacuumb", "cinema", "safari", "wonder", "useful", "critic", "season", "smooth", "future", "apathy", "dollar", "freeze", "redeem", "finish", "offend", "cheese", "reward", "design", "treaty", "tycoon", "punish", "sector", "ground", "launch", "length", "infect", "aspect", "dragon", "differ", "invite", "happen", "cancel", "carrot", "rocket", "stroke", "sleeve", "Sunday", "ladder", "gallon", "junior", "action", "stroll", "cattle", "desert", "crisis", "harbor", "peanut", "garlic", "trench", "branch", "bloody", "scheme", "record", "glance", "viable", "harass", "frozen", "volume", "impact", "linger", "spread", "figure"};

  //picks a random word of the list to be the secret word
    String secretWord = wordList[(int) (Math.random() * wordList.length)];
    String secretHardWord = hardWordList[(int) (Math.random() * hardWordList.length)];
  //creates both an easywordle object and a hardwordle object
    Wordle wordle = new Wordle(secretWord);
    wordleHard wordlehard = new wordleHard(secretHardWord);
  //prompts user on which game they would like to play and depending on the answer, the program will either run the play method for easy or hard mode.
    System.out.println("Would you like to play wordle on easy mode or hard mode? type 1 for easy and 2 for hard.");
    Scanner scan = new Scanner(System.in);
    int mode = 0;
    while(mode != 1 && mode != 2){
    mode = scan.nextInt();
    if(mode == 1){
      wordle.play();
    } else if (mode == 2){
      wordlehard.play();
    } else{
      System.out.println("inccorect input, please enter 1 for easy or 2 for hard");
    }
  }
  }


}

//creates hard edition of wordle class
class wordleHard{
  //creates secret word and guesscount variables for game
  private String secretWord;
  private int guessCount = 0;
  //creates constructor for wordleHard class
  public wordleHard(String secretWord){
    this.secretWord = secretWord.toLowerCase();
  }
  //creates default constructor for wordleHard class
  public wordleHard(){
    this.secretWord = "wordleHard";
  }

  public String toString(){
    return secretWord;
  }

  //play method starts the game
  public void play(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Hard Wordle! Try to guess the secret word in 5 tries or less!");
    System.out.println("The secret word contains " + secretWord.length() + " letters");

    //starts game while loop with condition that limits user to 5 guesses
    while(guessCount<5){
      //takes user input for guess
      System.out.println("Enter your guess.");
      //stores guess as all lower case
      String guess = scan.nextLine().toLowerCase();




      //checks to see if guess is the correct length and if not, lets user enter another guess
      if(guess.length() != secretWord.length()){
        System.out.println("Invalid guess. The word contains " + secretWord.length() + " letters.");
      } else if(guess.equals(secretWord)){
        //adds to guess count to track number of guesses
        guessCount++;
        //win message
        System.out.println("Congratulations! You guessed the secret word in " + guessCount + " tries.");
        //makes guess count 6 so that it doesnt say that the user failed to get the correct word
        guessCount = 6;

      } else {
        //adds to guess count to track number of guesses
        guessCount++;

        System.out.print("Word: ");
        //prints a copy of the word with the correct letters in the right spot and fills all other letters with a dash
        for(int i = 0; i < secretWord.length(); i++){
          if(guess.substring(i,i+1).equals(secretWord.substring(i,i+1))){
            System.out.print(guess.substring(i,i+1) + " ");
          } else{
            System.out.print("- ");
          }
        }

        System.out.println();
        System.out.print("Correct but wrong place: ");

        //prints all letters that are in the word but not in the right spot
        for(int i = 0; i < secretWord.length(); i++){
          if(guess.contains(secretWord.substring(i, i+1)) &&         
            !guess.substring(i,i+1).equals(secretWord.substring(i,i+1))){

            System.out.print(secretWord.substring(i,i+1) + " ");

          }
        }

        System.out.println();
      }

      }
    //if loop ends and the user tried 5 times, prints lose message. If the user guessed the word, it will not run and the code will end.
    if(guessCount == 5){
      System.out.println("Sorry, you ran out of tries. The secret word was " + secretWord + ".");
    }

    }

}

//creates easy wordle class
class Wordle{
  //creates secret word and guesscount variables for game
  private String secretWord;
  private int guessCount = 0;
  //creates constructor for wordle class
  public Wordle(String secretWord){
    this.secretWord = secretWord.toLowerCase();
  }
  //creates default constructor for wordle class
  public Wordle(){
    this.secretWord = "wordle";
  }

  public String toString(){
    return secretWord;
  }
  
  //play method starts the game
  public void play(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Wordle! Try to guess the secret word in 10 tries or less!");
    System.out.println("The secret word contains " + secretWord.length() + " letters");

    //starts game while loop with condition that limits user to 10 guesses
    while(guessCount<10){
      //takes user input for guess
      System.out.println("Enter your guess.");
      //stores guess as all lower case
      String guess = scan.nextLine().toLowerCase();
      
      
      

      //checks to see if guess is the correct length and if not, lets user enter another guess
      if(guess.length() != secretWord.length()){
        System.out.println("Invalid guess. The word contains " + secretWord.length() + " letters.");
      } else if(guess.equals(secretWord)){
        //adds to guess count to track number of guesses
        guessCount++;
        //win message
        System.out.println("Congratulations! You guessed the secret word in " + guessCount + " tries.");
        //makes guess count 11 so that it doesnt say that the user failed to get the correct word
        guessCount = 11;
      
      } else {
        //adds to guess count to track number of guesses
        guessCount++;
        
        System.out.print("Word: ");
        //prints a copy of the word with the correct letters in the right spot and fills all other letters with a dash
        for(int i = 0; i < secretWord.length(); i++){
          if(guess.substring(i,i+1).equals(secretWord.substring(i,i+1))){
            System.out.print(guess.substring(i,i+1) + " ");
          } else{
            System.out.print("- ");
          }
        }
        
        System.out.println();
        System.out.print("Correct but wrong place: ");

        //prints all letters that are in the word but not in the right spot
        for(int i = 0; i < secretWord.length(); i++){
          if(guess.contains(secretWord.substring(i, i+1)) &&         
            !guess.substring(i,i+1).equals(secretWord.substring(i,i+1))){
            
            System.out.print(secretWord.substring(i,i+1) + " ");
            
          }
        }
        
        System.out.println();
      }
      
      }
    //if loop ends and the user tried 10 times, prints lose message. If the user guessed the word, it will not run and the code will end.
    if(guessCount == 10){
      System.out.println("Sorry, you ran out of tries. The secret word was " + secretWord + ".");
    }
        
    }
  }
  

