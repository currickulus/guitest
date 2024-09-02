//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        # ITS320_CTA2_Option2.py
//        # Author: Thomas Dewing
//        # Date 9/2/2024
//        #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        #GetInput==From_user Name and weekly income
//        #
//        #Sort the amount to the particular tax rate
//        #Multiply the weekly income to the appropriate tax rate.
//        #
//        #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        # Program inputs: Name, Weekly Income
//        # Program outputs: The appropriate tax rate, the appropriate amount of tax witheld
// Import the GUI dialog class
import javax.swing.JOptionPane;

public class CSC320CriticalThinkingOption1 {

    public static void main(String[] args) {

        // Declare two variables, a String and integer
        String name;

        // GUI Input Box returns user input as a String
        name = JOptionPane.showInputDialog("Enter your name");

        // Since GUI Input Boxes return Strings only, we must save the
        // result to a String and then convert it to an integer
        String answer = JOptionPane.showInputDialog("Enter your weekly income amount");

        // The Integer class has a method to convert a String into an int
        double income;
        income = Double.parseDouble(answer);

        // The following if statements select and once triggered calculate the appropriate amount of tax
        if (income <= 500) {

            JOptionPane.showMessageDialog(null,
                    "Your tax rate is 10%, " + name + "! You will pay "
                            + (income * .1) + "in income tax");

        }

        if ((income > 500) && (income <= 1500)) {
            ;
            JOptionPane.showMessageDialog(null, "Your tax rate is 15% " + name + "! You will pay "
                    + (income * .15) + "in income tax");
        }
        if ((income > 1500) && (income <= 2500)) {
            ;
            JOptionPane.showMessageDialog(null, "Your tax rate is 20%" + name + "! You will pay "
                    + (income * .20) + "in income tax");
        }
        if ((income > 2500) && (income <= 3500)) {
            ;
            JOptionPane.showMessageDialog(null, "Your tax rate is 30% " + name + "! You will pay "
                    + (income * .30) + " in income tax");
        }


    }
}



