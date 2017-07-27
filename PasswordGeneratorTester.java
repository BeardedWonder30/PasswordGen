// This is the PasswordGenerator classes tester, this file is designed to fully excercise
// The PasswordGenerator class so that we can test every feature.

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class PasswordGeneratorTester {

    public static void main(String[] args)
    {
        //variables
        int size = 0;
        String needSymbol = " ";
        
        //boolean Symbol = false;

        //scanner
        Scanner input = new Scanner(System.in);

        size = passwordSize(size); // gets password size

        PasswordGenerator pass = new PasswordGenerator(); // creates password object

        pass.setPassSize(size);
        System.out.println(pass.getPassSize());

        needSymbol = symbolNeeded(needSymbol);
        System.out.println(needSymbol);

        pass.genPassword();
        


    }
    // input for size of password needed
    public static int passwordSize(int size)
    {
        Scanner input = new Scanner(System.in);
        //password length
        System.out.print("Enter the length of password needed: ");
        size = input.nextInt();
        while(size <= 0)
        {
            System.out.print("Enter the length of password needed: ");
            size = input.nextInt();
        }
        return size;
    }

    //input for pass needs symbol
    public static String symbolNeeded(String needSymbol)
    {
        boolean answer = false;
        Scanner input = new Scanner(System.in);
        //prompt for needing symbol
        System.out.print("Does your password need a symbol? yes or no: ");
        needSymbol = input.next();

        while(answer != true)
        {
            if(needSymbol.equals("yes"))
            {
                answer = true;
                return needSymbol; //break;
            }
            else if(needSymbol.equals("no"))
            {
                answer = true;
                            }
            else
            {
                System.out.print("Does your password need a symbol? yes or no: ");
                needSymbol = input.next();
            }

        }
        return needSymbol; //not sure if this return is staying or not
    }
}
