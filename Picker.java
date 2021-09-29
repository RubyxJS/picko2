import java.util.Scanner;
import java.util.Random;

class Picker {
    static final String[] GAMES = { "1placeholder", "2placeholder" };

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;

        while (running) {
            System.out.println("Hi,");
            System.out.println("This is a random picker for games");
            System.out.println("Enter 1 to pick a game and 5 to quit the program");
            int option = consoleInput.nextInt();

            switch (option) {
                case 1:
                    int picko = rand.nextInt(GAMES.length);
                    System.out.println(GAMES[picko]);
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
    }
}