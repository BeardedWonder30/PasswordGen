// This utility class can be used to generate random passwords.
import java.util.Random;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Collections;

public class PasswordGenerator
{
    //class variables
    //private char[] password;

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
    public PasswordGenerator(char[] password, char[] lowerAlpha, char[] upperAlpha,
                             char[] passSymbol, char[] passDigit, int passSize, String symbol)
    {

        //this.password = password;
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
    public void genPasswordWithSymbol()
    {
        char[] password = new char[passSize];
        ArrayList<Character> passwordGen = new ArrayList<Character>();
        for(char p: lowerAlpha)
            passwordGen.add(p);
        for(char p: upperAlpha)
            passwordGen.add(p);
        for(char p: passSymbol)
            passwordGen.add(p);
        for(char p: passDigit)
            passwordGen.add(p);
        Collections.shuffle(passwordGen);
        for (int i = 0; i < passSize ; i++ )
        {
            System.out.print(passwordGen.get(i));

        }


    }

    public void genPasswordWithOutSymbol()
    {
        char[] password = new char[passSize];
        ArrayList<Character> passwordGen = new ArrayList<Character>();
        for(char p: lowerAlpha)
            passwordGen.add(p);
        for(char p: upperAlpha)
            passwordGen.add(p);
        for(char p: passDigit)
            passwordGen.add(p);
        Collections.shuffle(passwordGen);
        for (int i = 0; i < passSize ; i++ )
        {
            System.out.print(passwordGen.get(i));

        }


    }







}
