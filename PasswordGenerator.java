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
    private int[] passDigit;

    private int passSize;

    // 0-arg constructor
    public PasswordGenerator(){}

    // 1-arg constructor
    public PasswordGenerator(int passSize)
    {
        setPassSize(passSize);
    }

    //constructor (not sure how many args yet)
    public PasswordGenerator(String password, char[] lowerAlpha, char[] upperAlpha,
                             char[] passSymbol, int[] passDigit, int passSize)
    {

        this.password = password;
        this.lowerAlpha = lowerAlpha;
        this.upperAlpha = upperAlpha;
        this.passSymbol = passSymbol;
        this.passDigit = passDigit;
        this.passSize = passSize;

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
    public int getPassSize()
    {
        return this.passSize = passSize;
    }



    public void genPassword()
    {
        int size = passSize;
        
        char[] lowerCase = new char[passSize];

        Random r = new Random();
        for (int i = 0; i < passSize ; i++ )
        {
            lowerCase[i] = lowerAlpha[r.nextInt(26)];
               
        }
        System.out.println(lowerCase);
    }

   
    


}
