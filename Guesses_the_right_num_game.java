import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int number_of_guesses=0;

    public int getNumber_of_guesses(){
        return number_of_guesses;
    }
    public void setNumber_of_guesses(int number_of_guesses){
        this.number_of_guesses=number_of_guesses;
    }
    Game(){
        Random random=new Random();
        this.number=random.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber = sc.nextInt();


    }
    boolean isCorrectNumber(){
        number_of_guesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed is right, it was %d\n You guessed it in %d attempts",number,number_of_guesses);
            return true;
        }
        else if(inputNumber>number){
            System.out.println("Too High...!!!");
        }
        else if(inputNumber<number){
            System.out.println("Too Low...!!!");
        }
            return false;
        
    }
}
public class game_exercies3 {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods;
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true 
            4. getter and setter for number of guesses 
            Use properties such as number_of_guesses(int), etc to get this task done!! 
         */

        Game g=new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
        b=g.isCorrectNumber();
        System.out.println(b);
        }
        
    }
}
