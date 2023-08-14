package com.CodeBoard;

public class A1b5 {
    public static void main(String[] args) {
        String input = "a1b5";
        String output = generateOutput(input);
        System.out.println("Output: " + output);
    }

    public static String generateOutput(String input) {
        StringBuilder outputBuilder = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);
            i++;

            // Extract the number of repeats for the character
            int repeat = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                repeat = repeat * 10 + (input.charAt(i) - '0');
                i++;
            }

            // Append the character 'repeat' times to the output
            for (int j = 0; j < repeat; j++) {
                outputBuilder.append(ch);
            }
        }

        return outputBuilder.toString();
    }
}//int n=5;
//for(int i=0;i<n;i++) {
//	System.out.println(s);
//}
