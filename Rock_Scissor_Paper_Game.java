import java.util.Scanner;
import java.util.Random;
public class rock_Scissor_paper{
    public static void main(String[] args) {
        //0 for Rock
        //1 for paper
        //2 for Scissor
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor : ");
        int userInput = sc.nextInt();

        Random random=new Random();
        int computerInput = random.nextInt(3);
        if(userInput<=2){
            if(userInput==computerInput){
                System.out.println("Draw");
            }
            else if(userInput==0 && computerInput==2 ||userInput==1 && computerInput==0 || userInput==2 && computerInput==1 ){
                System.out.println("YOU WIN!");
            }
            else{
                System.out.println("Computer WIN!");
            }
       
            if(computerInput==0){
                System.out.println("Computer choice : Rock");
            }
            else if(computerInput==1){
                System.out.println("Computer choice : Paper");
            }
            else if(computerInput==2){
                System.out.println("Computer choice : Scissor");
            }
        }
        else{
            System.out.println("Enter valid number!!!!");
        }
    }
}
