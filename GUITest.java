// Import the GUI dialog class
import javax.swing.JOptionPane;

public class GUITest {

    public static void main(String[] args) {

        // Declare two variables, a String and integer
        String name;
        int age;

        // GUI Input Box returns user input as a String
        name = JOptionPane.showInputDialog("Enter your name");

        // Since GUI Input Boxes return Strings only, we must save the
        // result to a String and then convert it to an integer
        String answer = JOptionPane.showInputDialog("Enter your age");

        // The Integer class has a method to convert a String into an int
        age = Integer.parseInt(answer);

        // GUI Output Box
        String message = "Hello there, " + name
                + "! In ten years you will be " + (age + 10);
        JOptionPane.showMessageDialog(null, message);

        // Console output
        System.out.println("Hello there, " + name + "! In ten years you will be " +
                (age + 10));
    }
}