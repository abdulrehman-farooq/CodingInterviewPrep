package CodeTemplate;

public class Casting {

    public static void main(String[] args) {
        char integerCharacter = '1';
        int integerCasting = (int) integerCharacter - '0';
        System.out.println("Integer Casting " + integerCasting);

        char loweCasting = 'a';
        int lowerIntegerValue = (int) loweCasting - 'a';
        System.out.println("Integer Casting " + lowerIntegerValue);

        char upperCasting = 'A';
        int upperIntegerValue = (int) upperCasting - 'A';
        System.out.println("Integer Casting " + upperIntegerValue);

        int mixedCastingUpper = (int) upperCasting - 'A';
        int mixedCastingLower = (int) loweCasting - 'A';
        System.out.println("Integer Casting " + mixedCastingUpper);
        System.out.println("Integer Casting " + mixedCastingLower);

        int convert = Integer.parseInt("12");
        String convertString = String.valueOf(convert);
        String convertString1 = convert + "";
        System.out.println("String Casting to integer " + convert);
        System.out.println("Integer Casting " + convertString);
        System.out.println("Integer Casting " + convertString1);


    }

}
