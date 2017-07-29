// This utility class can be used to generate random passwords.
import java.util.Random;
import java.util.Arrays;

public class PasswordGenerator
{
    //class variables
    private String password;

    private char[] lowerAlpha = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v',
            'w', 'x' , 'y', 'z'};
    private char[] upperAlpha = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U','V',
            'W', 'X' , 'Y', 'Z'};
    private char[] passSymbol = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-',
            '+', '=', '{', '[', '}', ']', ';', ':', '<', ',', '>', '.', '?', '/',
            '~'};
    private char[] lowerLetter;
    private char[] passDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '8'};

    private int passSize;
    private String symbol;
    // 0-arg constructor
    public PasswordGenerator(){}

    // 1-arg constructor
    public PasswordGenerator(int passSize)
    {
        setPassSize(passSize);
    }

    //constructor (not sure how many args yet)
    public PasswordGenerator(String password, char[] lowerAlpha, char[] upperAlpha,
                             char[] passSymbol, char[] passDigit, int passSize, String symbol)
    {

        this.password = password;
        this.lowerAlpha = lowerAlpha;
        this.upperAlpha = upperAlpha;
        this.passSymbol = passSymbol;
        this.passDigit = passDigit;
        this.passSize = passSize;
        this.symbol = symbol;

    }

    public void setPassSize(int passSize)
    {
        // This checks to see if the password size being passed is not less than or equal to zero
        if (passSize <= 0)
            // If it is, do not set the passSize to less than or equal to zero, so return.
            return;

        else
            this.passSize = passSize;

    }
    public int getPassSize(){return this.passSize = passSize;}

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }
    public String getSymbol(){return this.symbol = symbol;}

    //genrates the password
    public void genPassword()
    {
        //variables needed 
        int size = passSize;
        char[] lowerCase = new char[passSize];
        char[] upperCase = new char[passSize];
        char[] symbolWanted = new char[passSize];
        char[] passNum = new char[passSize]; 
        boolean answer = false;

        Random r = new Random();
        for (int i = 0; i < passSize; i++ )
        {
            lowerCase[i] = lowerAlpha[r.nextInt(26)];
            upperCase[i] = upperAlpha[r.nextInt(26)];  
            symbolWanted[i] = passSymbol[r.nextInt(27)];
            passNum[i] = passDigit[r.nextInt(10)];
        }
        for (int i = 0; i < passSize; i++ )
        {

            
        }

        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(symbolWanted);
        System.out.println(passNum);
    }

   
    


}
