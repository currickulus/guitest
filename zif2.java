package the_if;


import javax.swing.JOptionPane;


public class zif2 {


    public static void main(String args[])


    {


        int i = 15;


        if (i < 15)


            System.out.println("The number is less than 15");


        else if (i> 15) {


            System.out.println("The number is greater than 15");


        }


        else {


            JOptionPane.showMessageDialog(null, "The number is 15");


        }


    }


}