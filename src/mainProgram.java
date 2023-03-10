import java.util.Scanner;
// camel case as MOOC.FI errors without it
public class mainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scanner);
        userInterface.start();
    }
}
