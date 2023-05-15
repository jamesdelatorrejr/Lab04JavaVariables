public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 7;
        int intSum = 0;
        int intProduct = 17;
        int intDifference = 12;
        int intQuotient = 69;
        int intModulo = 5;

        double doubleOperandA = 3.50;
        double doubleOperandB = 5.30;
        double doubleSum = 17.43;
        double doubleProduct = 12.21;
        double doubleDifference = 99.11;
        double doubleQuotient = 75.22;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("Your Sum of ints " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("Your Product of ints " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("Your Difference of ints " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("Your Quotient of ints " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("Your Remainder of ints " + intOperandA + " and " + intOperandB + " is " + intModulo);

        System.out.println("Your Sum of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("Your Product of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("Your Difference of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("Your Quotient of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        int myFavoriteNumber = 22;
        String myFavSnack = "Goldfish";

        System.out.println("myFavoriteNumber is " + myFavoriteNumber + " and myFavSnack is " + myFavSnack + ".");

    }
}