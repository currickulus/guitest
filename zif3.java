package the_if;


import javax.swing.JOptionPane;


public class zif3 {


    public static void main(String args[])


    {


        int i = 10, j= 25, k=15, greatest;


        if (i > j) {


            if(i>k) {


                greatest=i;


            }


            else {


                greatest=k;


            }


        }else {


            if(j>k) {


                greatest=j;


            }


            else {


                greatest = k;


            }


        }


        JOptionPane.showMessageDialog(null, "The biggest number is " + greatest);





    }


}

