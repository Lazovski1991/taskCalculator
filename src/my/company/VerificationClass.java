package my.company;

public class VerificationClass {
   public static boolean checkValues(String number1, String number2) {
        boolean result1 = false;
        boolean result2 = false;
        boolean result = false;
        for (String value : Solution.rimNumbers) {
            if (number1.equals(value)) {
                result1 = true;
                break;
            }
        }
        for (String value : Solution.rimNumbers) {
            if (number2.equals(value)) {
                result2 = true;
                break;
            }
        }
        if (result1 && result2) {
            result = true;
        }
        return result;
    }

    public static boolean checkValues(int number1, int number2) {
        boolean result = true;
        if (number1 < 1 || number1 > 10) {
            result = false;
        }
        if (number2 < 1 || number2 > 10) {
            result = false;
        }
        return result;
    }
}
