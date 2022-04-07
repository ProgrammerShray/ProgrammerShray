import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! Welcome to Rock , Paper and Scissors. \nChoose 0 for rock \nChoose 1 for paper \nChoose 2 for scissors");
        System.out.println("Your turn: ");
        int chooser= sc.nextInt();
        int comp= ra.nextInt(3);
        System.out.println("Computer's turn: " + comp);

        int rockwon = 0;
        int paperwon= 1;
        int scissorwon = 2;

        if (comp == rockwon && chooser == paperwon) {

            System.out.println("You Win!!!");

        }else if (comp == paperwon && chooser == scissorwon) {

            System.out.println("You win!!!");

        }else if (comp == scissorwon && chooser ==rockwon) {

            System.out.println("You win!!!");

//        }else if (comp == rockwon && chooser== scissorwon){
//            System.out.println("Computer Won!!!");
        } else if (comp == chooser){

            System.out.println("Tie !!!");

        }else {
            System.out.println("Computer Won!!!");
        }
    }
}
