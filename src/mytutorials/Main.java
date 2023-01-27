// tutorial video coding with Mosh https://www.youtube.com/watch?v=eIrMbAQSU34&t=433s


package mytutorials;

import java.security.Principal;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Date;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
//        int age = 36;
//        //variable initialized
//        age = 37;
//        //now the variable is updated
//        System.out.println(age);
//
//        int numberOfCandles = age;
//        //a variable which shares a value with another variable
//
//        //here are the types of -----primitives------
//        byte byteMin = -128;
//        byte byteMax = 127;
//        //byte = 1 byte of storage, wow you don't say
//        short shortMin = -32000;
//        short shortMax = 32000;
//        //short = 2 bytes of storage
//        int intMin = -2_000_000_000;
//        int intMax = 2000000000;
//        //int = 4 bytes of storage, that number is 2 billion, we can use _ instead of comas
//        long longNumber = 2000000001L;
//        //long = 8 bytes, and is more than 2 billion, slap an L on the end for good measure
//        float rootbeer = 1.123456F;
//        //float is 4 bytes, 6 decimal digits, always end with F, decimals default to double, if you don't specify with F
//        double bubble = 1.123456789012345D;
//        //double is 8 bytes, 15 decimal digits, the D is optional
//        char mysteryLetter = 'A';
//        //we must use single quotes for char, char represents a unicode character
//        char omega = '\u03A9';
//        char[] charArray = {'a', 'z', '\u03A9'};
//        //the unicode is the same as just typing a letter, for this primitive
//        boolean sleepy = true;
//        boolean insomnia = false;
//        //boolean is a true or false value
//
//        //orange words here are "reserved keywords"
//
//        //now we're making reference types -----references------
//
//        Date today = new Date();
//        //imported from utils, this is an instance of the Date class from utils
////        today.getTime(); this is calling a method from the Date class
//        System.out.println(today);
//        //sout is the "code snippet"
//
//
////-----------------------------------
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//        // this returns a value of 1, even though we have updated the value of x, we must feed new values into both
//
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//
//        System.out.println(point2);
//        //reference objects change unlike when you do this with primitives
//
//        String noodle = "spaghetti";
//        //strings need double quotes
//        //string is a "reference type"
//
//        String sauce = "marinara";
//        System.out.println(noodle + " with " + sauce + " sauce!");
//        //the + "concatenates" the strings
//
//        System.out.println(sauce.endsWith("a"));
//        //this checks the ending of a string and returns a boolean value
//        System.out.println(sauce.startsWith("p"));
//        //same, but the beginning
//        System.out.println(sauce.length());
//        //this method returns the number of characters a string
//        System.out.println(sauce.indexOf("n"));
//        // returns the position of a character in the sting, counts from 0
//        System.out.println(sauce.replace("m", "c"));
//        //we can use this to auto filter cusswords I guess?
//        System.out.println(sauce.replace("marinara", "!@#$%"));
//        //.replace does not modify the original string
//        //strings are IMMUTABLE
//        System.out.println(sauce.toUpperCase());
//        //.trim cuts off extra spaces at the beginning and end
//
//        //parameters are the undefined holes in the methods
//        //arguments are the values passed into the methods
//        //arguments go into the parameters
//
//        //escape character
//
//        System.out.println("gentlemen! I have \"escaped\" ");
//        //this lets us add reserved character types into the print string
//        System.out.println(("C:\\Windows\\Desktop\\cat_pictures"));
//        //to display a backslash, you have to do 2 of them cause escape character
//        System.out.println("gentlemen! \n this is a new line \n \t and this is a tab");
//
//        //let's make some arrays
//
//        int[] numberArray = new int[5];
//        numberArray[0] = 1;
//        numberArray[1] = 2;
//        numberArray[2] = 3;
//        numberArray[3] = 4;
//        numberArray[4] = 5;
//
//        System.out.println(numberArray);
//        // this returns [I@41629346, which is the memory address of numberArray
//        System.out.println(Arrays.toString(numberArray));
//        //this prints the array's contents
//
//        //number arrays are initialized at all 0
//        //boolean arrays are initialized at all false
//        //string arrays are initialized at 'empty string'
//
//        //here is a more handsome way to initialize your array
//        int[] numberArray2 = {1, 2, 4, 8, 16};
//        System.out.println("numberArray2 has an index of " + numberArray2.length);
//        System.out.println("here is numberArray2 " + Arrays.toString(numberArray2));
//        //we cannot add or remove index length to/from an array once initialized
//
//        //Arrays.sort orders the index numerically
//
//        //2D array, a table basically
//        int[][] twoDArray = new int[2][3];
//        //this is 2 rows, then three columns
//        twoDArray[0][0] = 1;
//        //this puts a value of 1 in the top left square of the array
//        System.out.println(Arrays.deepToString(twoDArray));
//        //deepToString must be used when calling forth the 2d array
//        int[][] secondTwoDArr = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(secondTwoDArr));
//
//        final float pi = 3.14F;
//        //final makes this a constant, value is immutable
//
//        //an expression is a piece of code that produces a value
//
//        //% modulus is the remainder of a division, 9/2 has a modulus of 1
//
//        double result = (double) 10 / (double) 3;
//        System.out.println(result);
//
//        //the ++ is called the increment operator
//        int q = 1;
//        q++;
//        System.out.println(q);
//        //the increment operator adds +1 to a variable
//        //-- is the decrement operator
//
//        int w = 1;
//        int e = w++;
//        //this results in w = 2, and e = 1
//        //e takes the value of w, 1, then increments the value of w, but does not update the value of e
//        // however, if we change it to int e = ++w;
//        //the increment operator in front, with be executed before a value is assigned to e
//        //they will both equal 2 in this case
//
//        //the augmented/compound assignment operators
//        //to increment by more than one
//        int r = 1;
//        r += 2;
//        //this updaters the value of r to 3
//        r -= 2;
//        //back to 1
//        r *= 2;
//        //back to two
//        r /= 2;
//        //and back to 1
//
//        int t = 10 + 3 * 2;
//        //this equals 16 cause PEMDAS, java follows PEMDAS
//
//        //implicit casting / conversion
//        short shorty = 1;
//        int eresting = shorty + 1;
//        System.out.println(eresting);
//        //here the short is cast to an int, because ints are larger than shorts
//        // byte > short > int > long > float > double
//        //BSILFD
//        //explicit casting
//        //(int)x + 2;
//
//        //Integer is the wrapper class for int
//        //to cast strings into ints we use Integer.parseInt("string");
//        System.out.println("I like the number 5"); //cannot parse from a sentence
//        System.out.println(Integer.parseInt("5"));
//        //values from dropdowns are typically in string format
//
//        //rounding a number, Math.round() has two modalities
//        //convert float > int
//        //convert double > long
//
//        //Math.ceil(1.1F) = 2 the ceiling, next integer equal to or greater than()
//        //Math.floor(1.1F) = 1 the floor, next integer equal to or lower than()
//
//        //Math.max(int a, int b) returns the number (int, long, float, double) with highest value
//        //Math.min(int a, int b) same deal, but the lower number
//        //Math.random(), returns a random double between 0 and 1
//        //Math.random() * 100; returns a random number between 0 and 100
//        double mysteryNumber = Math.round(Math.random() * 100);
//        System.out.println(mysteryNumber);
//        int mysteryNumber2 = (int) Math.round(Math.random() * 100);
//        System.out.println(mysteryNumber2);
//        int mysterynumber3 = (int) (Math.random() * 100);
//        System.out.println(mysterynumber3);
//
//        //NumberFormat, an abstract class, it cannot be instantiated with "new"
//        //NumberFormat.getCurrencyInstance() is a factory method, because it creates an object
//        NumberFormat dollars = NumberFormat.getCurrencyInstance();
//        String myCash = dollars.format(12353.948);
//        System.out.println(myCash);
//        NumberFormat gpa = NumberFormat.getPercentInstance();
//        String myGpa = gpa.format(0.975);
//        System.out.println(myGpa);
//
//        //scanner//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your age?");
//        byte years = scanner.nextByte();
//        System.out.println("You are " + years + " old");
//
//        System.out.print("Name:");
//        String name = scanner.next();
//        //scanner.next reads one token, a chunk of characters
//        System.out.println("You are " + name);
//
//        //scanner.nextLine() reads the entire line
//
//        // this consumes the dangling newline character or the next nextLine is skipped
//        scanner.nextLine();
//        //Although this solution works, you'll have to add additional
//        // scanner.nextLine() calls whenever you call any of the other
//        // methods. It's fine for smaller programs but in larger ones,
//        // this can get very ugly very quick. (freecodecamp.org)
//
//        System.out.println("type something with extra spaces at the beginning:");
//        String something = scanner.nextLine().trim();
//        System.out.println("you wrote: " + something + " wow, the extra spaces are gone!");
//        //here .trim() takes off extra spaces on the ends of the string
//
//        // Mortage calculator
//        System.out.println("Principal: ");
//        double principal = scanner.nextDouble();
//        System.out.println("Annual Interest Rate: ");
//        double apr = scanner.nextDouble();
//        System.out.println("Loan period (years):");
//        double length = scanner.nextDouble();
//        System.out.println("Annual property taxes:");
//        double taxes = scanner.nextDouble();
//
//        double mInterest = (apr / 100) / 12;
//        //12 months
//        double payments = length * 12;
//
//
//        double m1 = mInterest * Math.pow(1 + mInterest, payments);
//        double m2 = Math.pow(1 + mInterest, payments) - 1;
//        double mPayments = principal * (m1 / m2) + (taxes / 12);
//        DecimalFormat df = new DecimalFormat("$#####.##");
//
//        System.out.println("Monthly payment = " + df.format(mPayments));
////        System.out.println("*this does not include property taxes");
//
//        //conditional statement time
//        // x == y this is the equality operator, compares value
//        // x = y this is the assignment operator, assigns value
//        // x != y this is the inequality operator, compares value, but negatively
//        // we can also use these guys <, <=, >, >=
//        // && the "and" operator, || the "or" operator,
//        // ! the "not" operator, goes at the beginning of a variable
//
//        //imaginary loan application
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        //if one of these is true, AND false on hasCriminalRecord then isEligible will be true
//
//        //if statement
//        int temp = 32;
//        if (temp > 32) {
//            System.out.println("it's a hot day");
//            System.out.println("drink water");
//        }
//        else if (temp > 20)
//            System.out.println("what a nice day");
//        else
//            System.out.println("cold day");
//
//
//        int radiation = 10_000;
//        boolean highRadiation = (radiation > 1_000);
//        //booleans default to false, this is a conditional statement that sets the boolean to true
//
//        //the ternary operator
//        //it's ternary cause there are three parts
//         int salary = 120_000;
//         String className = salary > 100_000 ? "First" : "Economy";
////         if (salary > 100_000)
////             className = "First";
//
//        // ternary format ___ ? ___ : ___
//        // (is this true) ? (if so, this) : (else, this)
//        // (condition) ? (value) : (value)
//
//        //switch statements
//
//        String role = "admin";
//
//        switch  (role) {
//            case "admin":
//                System.out.println("You're an admin Harry");
//                break;
//            case "moderator" :
//                System.out.println("You're a moderator");
//                break;
//            default :
//                System.out.println("You're a guest user");
//        }
//
////        if (role == "admin")
////            System.out.println("You're an admin Harry");
////        else if (role == "moderator")
////            System.out.println("You're a moderator");
////        else
////            System.out.println("You're a guest user");
//
//        //fizz buzz
//
//
//
////        if (number % 5 == 0)
////            System.out.println("Fizz");
////        else if (number % 3 == 0)
////            System.out.println("Buzz");
////        else if (number % 5 == 0 && number % 3 == 0)
////            System.out.println("FizzBuzz");
////        else
////            System.out.println(number);
//// this is wrong, because the most specific instructions should come first
////        if (number % 5 == 0 && number % 3 == 0)
////            System.out.println("FizzBuzz");
////        else if (number % 5 == 0)
////            System.out.println("Fizz");
////        else if (number % 3 == 0)
////            System.out.println("Buzz");
////        else
////            System.out.println(number);
////DRY Don't Repeat Yourself
//
//        Scanner scanRRR = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = scanRRR.nextInt();
//
//        if (number % 5 == 0) {
//            if (number % 3 == 0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println("Fizz");
//        }
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);
//
////loopz
//    //for loop
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello world!" + i);
//        }
//        for (int i = 5; i > 0; i--){
//            System.out.println("hi earth" + i);
//        }
//
//        int i = 0;
//
//    //while loop
////we cannot use == to compare strings, it is comparing the memory address
//// we use .equals(" ") to compare strings
//----------------------------------------------___
//        Scanner scanARGH = new Scanner(System.in);
////----------------------------------------------^^^
//        String input = "";
//        while (true) {
//            System.out.println("Input: ");
//            input = scanARGH.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
        //using condition "true" for the while loop, the loop action will persist in perpetuity, until a break; is called
        //IF you are using this, you MUST include a break; statement to escape the loop

        //continue; causes the loop to reset to the beginning of the code block, any commands after a continue will not be executed
        //break; this terminates the loop
//---------------------------------------------^^^
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanARGH.next().toLowerCase();
//            if (!input.equals("quit"))
//                System.out.println(input);
//        }
//        System.out.println("quitting");
////----------------------------------------------^^^
//        String input = "";
//        do {
//            System.out.print("Input: ");
//            input = scanARGH.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
////----------------------------------------------___

        //for each

        //String[] an array of Strings

//        String[] fruits = { "Fig", "Loquat", "Pomegranate", "Peach", "Pear", "Apricot"};

//        for (int i = 0; i < fruits.length; i++)
//            System.out.println(fruits[i]);

//        for (String fruit : fruits)
//            System.out.println(fruit);
//the variable fruit is named arbitrary, BUT
//it is customary to make it a singular form of the array name which is customarily pluralized


        //for each format breakdown
//for ((each item of the array) : (the array))
//        (do the following action, for each of them)

        //we can't go backwards in a for each loop, because there's no option to decrement i--

//            for (int i = fruits.length - 1; i >= 0; i--)
//                System.out.println(fruits[i]);
//            //we need a minus 1 after fruits.length here, because indices start at 0

        //mortgage calculator with error handling
//
//        Scanner scanner = new Scanner(System.in);
//
////        System.out.println("Enter the principal amount ($1k - $1M): ");
//        double principal = 1;
//        while (principal < 1_000 || principal > 1_000_000_000) {
//            System.out.println("Enter the principal amount ($1k - $1M): ");
//            principal = scanner.nextDouble();
//        }
////        System.out.println(principal);
//
//        double apr = -1;
//        while (apr < 0 || apr > 100){
//            System.out.println("Annual Interest Rate: ");
//            apr = scanner.nextDouble();
//        }
////        System.out.println(apr);
//
//        double length = -1;
//        while (length < 0 || length > 31){
//            System.out.println("Loan period (years):");
//            length = scanner.nextDouble();
//        }
////        System.out.println(length);
//
//        double taxes = -1;
//        while (taxes < 0){
//            System.out.println("Annual property taxes:");
//            taxes = scanner.nextDouble();
//        }
//
//
//        double mInterest = (apr / 100) / 12;
//        //12 months
//        double payments = length * 12;
//
//
//        double m1 = mInterest * Math.pow(1 + mInterest, payments);
//        double m2 = Math.pow(1 + mInterest, payments) - 1;
//        double mPayments = principal * (m1 / m2) + (taxes / 12);
//        DecimalFormat df = new DecimalFormat("$#####.##");
//
//        System.out.println("Monthly payment = " + df.format(mPayments));

        //interview questions https://www.youtube.com/watch?v=-rw8iIsAF5I

        //#1 What is JIT?
        //Just-In-Time Compiler. It increases efficiancy of the interpreter by compiling the bytecode in the runtime.
        //JIT compiles Code to machine level directly for higher speeds of code execution.

        //#2 What is a ClassLoader?
        //The first file to load when you execute a java program
        //a classloader in Java is a subsystem of Java Virtual Machine, dedicated to load class files when a program is executed
        //Java has Bootstrap, Extension, and Application classloaders

        //#3 What are the memory allocations available in Java?
        //Java has 5 MAJOR types of memory allocations
        //1- Class Memory
        //2- Heap Memory
        //3- Stack Memory
        //4- Program Counter Memory
        //5- Native Method Stack Memory

        //#4 Will the program run if I write static public void main?
        //yes, but it's usually public static void main
        //Java has no specific rule for the order of specifiers

        //#5 What is the default value stored in local variables?
        //the value will be a garbage value, usually 0
        //Neither the local variables nor any primitives or object references have any default value stored in them.

        //#6 What is the output of the following code segment?
        //concatenation vs addition operator
//        System.out.println(100 + 100 + "hello");
        //this prints out 200hello
        //first java recognizes the + as an addition operator, so the numbers are added
        //you cannot add numbers and strings, so the + is now recognized as a concatenation
//        System.out.println("hello" + 100 + 100);
        //once the + is recognized as a concatenation, all following + in the line will also be
        // here the numbers are not added, and the result is "hello100100"

        //#7 What is an association?
        //an association is a relationship where there is no ownership/hierarchy

        //#8 What is a copy constructor in Java?
        //A copy constructor in Java is a constructor that initializes an object through another object of the same class

        //#9 What is a marker interface?
        //an empty interface in Java referred as a Marker interface.
        // "Serializable" and "Cloneable" are some popular examples
        //there is no data manipulation

        //#10 What is object cloning?
        //recreating an object completely

        //#11 Why is Java not completely object oriented?
        //Java is not 100% OOP because it makes use of primitive datatypes like int, flot, double, etc

        //#12 define wrapper classes in java
        //when you declare primitive datatypes, the wrapper classes are responsible for converting them into objects (reference types)

        //#13 Define singleton classes in java
        //In Java, when you make the constructor of a class as private, then that particular class can generate only one single object.
        //This type of class (private) is called a Singleton Class.

        //#14 Define package in Java
        //A package is a collective bundle of classes and interfaces along with the necessary libraries and JAR files.
        //The use of packages helps in code reusability.

        //#15 Can you implement pointers in a Java program?
        //pointer is a thing in C to directly access the memory
        // - NO -
        //Java Virtual Machine takes care of memory management implicitly.
        //Java's major motto was to keep programing simple.
        //So, accessing memory directly through pointers is not a feature of Java.

        //#16 Differentiate between instance variables and local variables
        //Instance variables are declared inside a class and the scope is limited to only a specific object.
        //Local variables can be anywhere inside a method, or a specific block of code

        //#17 Explain the Java String Pool
        // The String Pool is a collection of strings in Java's Heap memory.
        //If you create a String object, JVM first checks for the presence of the object in the pool.
        //If that String already exists, the same reference object is shared with the variable, else a new object is created.

        //#18 What is an exception?
        //An Exception in Java is considered as an unexpected event that can disrupt the normal flow of the program.
        //These events can be fixed through the process of Exception Handling.

        //#19

    }
}
