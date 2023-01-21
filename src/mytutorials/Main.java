package mytutorials;

import java.util.Date;

public class Main {

    public static void main (String[] args){
        int age = 36;
        //variable initialized
        age = 37;
        //now the variable is updated
        System.out.println(age);

        int numberOfCandles = age;
        //a variable which shares a value with another variable

        //here are the types of -----primitives------
        byte byteMin = -128;
        byte byteMax = 127;
        //byte = 1 byte of storage, wow you don't say
        short shortMin = -32000;
        short shortMax = 32000;
        //short = 2 bytes of storage
        int intMin = -2_000_000_000;
        int intMax = 2000000000;
        //int = 4 bytes of storage, that number is 2 billion, we can use _ instead of comas
        long longNumber = 2000000001L;
        //long = 8 bytes, and is more than 2 billion, slap an L on the end for good measure
        float rootbeer = 1.123456F;
        //float is 4 bytes, 6 decimal digits, always end with F, decimals default to double, if you don't specify with F
        double bubble = 1.123456789012345D;
        //double is 8 bytes, 15 decimal digits, the D is optional
        char mysteryLetter = 'A';
        //we must use single quotes for char, char represents a unicode character
        char omega = '\u03A9';
        char[] charArray = {'a','z','\u03A9'};
        //the unicode is the same as just typing a letter, for this primitive
        boolean sleepy = true;
        boolean insomnia = false;
        //boolean is a true or false value

        //orange words here are "reserved keywords"

        //now we're making reference types -----references------

        Date today = new Date();
        //imported from utils, this is an instance of the Date class from utils
//        today.getTime(); this is calling a method from the Date class
        System.out.println(today);
        //sout is the "code snippet"


//-----------------------------------
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        // this returns a value of 1, even though we have updated the value of x, we must feed new values into both

    }
}
