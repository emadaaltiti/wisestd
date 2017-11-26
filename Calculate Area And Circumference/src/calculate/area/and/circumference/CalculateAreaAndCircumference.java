/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.area.and.circumference;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad Altiti 26/11/2016 7:38 AM
 */
public class CalculateAreaAndCircumference {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //  withoutUserInteraction();
        withUserInteraction();
    }

    public static void withUserInteraction() {
//        usingJOptionPane();
        //Or 

//        usingScanner();
    }

    //Without user interaction
    public static void withoutUserInteraction() {
        double radius = 10.5;
        double area = Math.PI * (radius * radius);
        double circumference = Math.PI * 2 * radius;
        System.out.println("The area of circle is: " + area);
        System.out.println("The circumference of the circle is:" + circumference);

    }

    public static void usingJOptionPane() {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
        double area = Math.PI * (radius * radius);
        double circumference = Math.PI * 2 * radius;

        JOptionPane.showMessageDialog(null, "The area of circle is: " + area
                + '\n' + "The circumference of the circle is: " + circumference);

    }

    public static void usingScanner() {
        System.out.print("Enter the radius: ");
        /*We are storing the entered radius in double
       * because a user can enter radius in decimals
         */
        double radius = sc.nextDouble();
        //Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //Circumference = 2*PI*radius
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is:" + circumference);

    }
}
