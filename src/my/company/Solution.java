package my.company;

import java.io.IOException;

public class Solution {

    public static String[] rimNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void main(String[] args) throws IOException, IncorrectInputException {
        while (true) {
            ConsoleHelper.outHelloMessage();
            String expresion = ConsoleHelper.inputExpression();
            if (expresion.equals("quit")) {
                System.exit(0);
            }

            String[] str = ConsoleHelper.getArrayValues(expresion);
            if (str.length != 3) {
                throw new IncorrectInputException("invalid data format");
            }
            if (!VerificationClass.checkValues(str[0], str[2])) {
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[2]);
                if (VerificationClass.checkValues(a, b)) {
                    System.out.println(getC(str[1], a, b));
                } else {
                    throw new IncorrectInputException("The entered number must be in the range from 1 to 10");
                }
            } else {
                int a = Converter.romanToArabic(str[0]);
                int b = Converter.romanToArabic(str[2]);
                int c = getC(str[1], a, b);

                System.out.println(Converter.arabicToRoman(c));
            }
        }
    }

    private static int getC(String str, int a, int b) throws IncorrectInputException {
        switch (str) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
        }
        throw new IncorrectInputException("Incorrect sign");
    }
}
