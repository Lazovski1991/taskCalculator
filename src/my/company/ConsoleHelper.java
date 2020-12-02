package my.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static String inputExpression() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    public static void outHelloMessage() {
        System.out.println("Enter an expression. Enter \"quit\" to quit.");
    }

    public static String[] getArrayValues(String inputString) {
        String[] str;
        String delimeter = " ";
        str = inputString.split(delimeter);
        return str;
    }
}
