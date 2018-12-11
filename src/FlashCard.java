import java.util.Scanner;

public class FlashCard {
    public static void main(String [] text){
        //1)Change the number on the array value to match how many cards you will have
        //2)Take the values per unit and change that into a question
        String [] questions = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] answers = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String currentQuestion;
        String currentAnswers;
        Scanner userInput;
        String theUser;
        boolean value = true;


        userInput = new Scanner(System.in);


        while (value) {
            int generatedNumber = (int) (Math.random() * questions.length);

            currentQuestion = questions[generatedNumber];

            currentAnswers = answers[generatedNumber];

            System.out.println(currentQuestion);
            theUser = userInput.nextLine();
            System.out.println(currentAnswers + "\n");


        }
    }//main
}//Class
