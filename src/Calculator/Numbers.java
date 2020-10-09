package Calculator;

public class Numbers {

    String  valueStr;
    public boolean itIsRoman;

    Numbers(String str)  {
        valueStr = str;
    }

    int ValueOfNumber () {
        int value;

        switch (valueStr) {

            case ("1"):
            case ("2"):
            case ("3"):
            case ("4"):
            case ("5"):
            case ("6"):
            case ("7"):
            case ("8"):
            case ("9"):
            case ("10"):
                itIsRoman = false;
                value = Integer.parseInt (valueStr);
                break;
            case ("I"):
                value = 1;
                itIsRoman = true;
                break;
            case ("II"):
                value = 2;
                itIsRoman = true;
                break;
            case ("III"):
                value = 3;
                itIsRoman = true;
                break;
            case ("IV"):
                value = 4;
                itIsRoman = true;
                break;
            case ("V"):
                value = 5;
                itIsRoman = true;
                break;
            case ("VI"):
                value = 6;
                itIsRoman = true;
                break;
            case ("VII"):
                value = 7;
                itIsRoman = true;
                break;
            case ("VIII"):
                value = 8;
                itIsRoman = true;
                break;
            case ("IX"):
                value = 9;
                itIsRoman = true;
                break;
            case ("X"):
                value = 10;
                itIsRoman = true;
                break;
            default:
                throw new NumberFormatException("Неверное число");
        }
    return value;
    }
}
