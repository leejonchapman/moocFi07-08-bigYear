import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner userInput;
    ArrayList<Bird> birdDatabsae = new ArrayList<>();

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
                        "Quit - ends the programme \n");
        while (runMenu) {
            System.out.print("? ");
            String uI = userInput.nextLine();

            if (uI.equals("Quit")) {
                runMenu = false;
            }
            if (uI.equals("Add")) {
                System.out.print("Name: ");
                String engName = userInput.nextLine();
                System.out.print("Name in latin: ");
                String latName = userInput.nextLine();
                Bird bird = new Bird(engName, latName);
                birdDatabsae.add(bird);
            }
            if (uI.equals("All")) {
                for (Bird bird : birdDatabsae
                ) {
                    System.out.println(bird);
                }
            }
            if (uI.equals("One")) {
                System.out.print("Bird? ");
                String userBird = userInput.nextLine();
                for (Bird bird : birdDatabsae
                ) {
                    if (userBird.equals(bird.engName)) {
                        System.out.println(bird);
                    }
                }
            }
            if (uI.equals("Observation")) {
                System.out.print("Bird? ");
                String userBird = userInput.nextLine();
                for (Bird bird : birdDatabsae
                ) {
                    if (userBird.equals(bird.engName)) {
                        bird.observations++;
                    }
                }
            }
        }
    }
}
