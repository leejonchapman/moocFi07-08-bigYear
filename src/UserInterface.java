import java.util.Scanner;

public class UserInterface {
    Scanner userInput;

    public UserInterface(Scanner userInput) {
        this.userInput = userInput;
    }

    public void start() {
        boolean runMenu = true;
        System.out.print(
                "Add - adds a bird \n" +
                        "Observation - adds an observation \n" +
                        "All - prints all birds \n" +
                        "One - prints one bird \n" +
                        "Quit - ends the program \n");
    while (runMenu){
        System.out.print("? ");
        String uI = userInput.nextLine();
    }
    }
}
