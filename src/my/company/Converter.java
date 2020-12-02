package my.company;

import java.util.List;

public class Converter {

    public static String arabicToRoman(int number) {
        if ((number == 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RimNumber> romanNumerals = RimNumber.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RimNumber currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    public static int romanToArabic(String input) {
        int arab = 0;
        for (int i = 0; i < Solution.rimNumbers.length; i++) {
            if (input.equals(Solution.rimNumbers[i])) {
                arab = i + 1;
            }
        }
        return arab;
    }
}
