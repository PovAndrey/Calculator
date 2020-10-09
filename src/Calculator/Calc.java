package Calculator;

import java.util.List;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

     for(;;) {

            int result;

         Scanner scan = new Scanner(System.in);

         String str = scan.nextLine();
         String[] subStr;
         String delimeter = " ";
         subStr = str.split(delimeter);

         if (subStr.length > 3)
         throw new ArrayIndexOutOfBoundsException("Неверная строка");

         Numbers first = new Numbers(subStr[0]);
         String sign = subStr[1];
         Numbers second = new Numbers(subStr[2]);

            if ((first.itIsRoman && second.itIsRoman) || (!first.itIsRoman && !second.itIsRoman)) {
                switch (sign) {
                    case ("+"):
                        result = first.ValueOfNumber() + second.ValueOfNumber();
                        break;
                    case ("-"):
                        result = first.ValueOfNumber() - second.ValueOfNumber();
                        break;
                    case ("*"):
                        result = first.ValueOfNumber() * second.ValueOfNumber();
                        break;
                    case ("/"):
                        result = first.ValueOfNumber() / second.ValueOfNumber();

                        break;
                    default:
                        throw new UnsupportedOperationException("Неверный знак");
                }

                if (first.itIsRoman && second.itIsRoman)
                    System.out.println(arabicToRoman(result));
                else if (!first.itIsRoman && !second.itIsRoman)
                    System.out.println(result);
                else
                    throw new ArithmeticException("Используйте вместе либо арабские, либо римские числа");

            }

        }

    }

    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();

    }
}

