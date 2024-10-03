package edu.qc.seclass;


public class MyCustomString implements MyCustomStringInterface {
    private String currentString;

    @Override
    public String getString() {
        return currentString;
    }

    @Override
    public void setString(String str) {
        this.currentString = str;
    }

    @Override
    public int countNumbers() {
        if (currentString == null) {
            throw new NullPointerException("Current string cannot be null.");
        }

        int count = 0;
        for (int index = 0; index < currentString.length(); index++) {
            if (Character.isDigit(currentString.charAt(index))) {
                count++;
                while (index < currentString.length() && Character.isDigit(currentString.charAt(index))) {
                    index++;
                }
            }
        }
        return count;
    }


    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean reverse) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive.");
        }
        if (currentString == null || currentString.isEmpty()) {
            return "";
        }

        StringBuilder resultBuilder = new StringBuilder();
        int length = currentString.length();

        if (!reverse) {
            for (int index = 0; index < length; index++) {
                if ((index + 1) % n == 0) {
                    resultBuilder.append(currentString.charAt(index));
                }
            }
        } else {
            for (int index = length - 1; index >= 0; index--) {
                if ((length - index) % n == 0) {
                    resultBuilder.insert(0, currentString.charAt(index));
                }
            }
        }

        return resultBuilder.toString();
    }

    @Override
    public void convertDigitsToNamesInSubstring(int start, int end) {
        if (start < 0 || end > currentString.length() || start > end) {
            throw new IllegalArgumentException("Invalid substring range.");
        }

        StringBuilder modifiedBuilder = new StringBuilder(currentString);
        String[] namesForDigits = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        for (int index = start; index < end; index++) {
            char currentChar = modifiedBuilder.charAt(index);
            if (Character.isDigit(currentChar)) {
                int digit = Character.getNumericValue(currentChar);
                String name = namesForDigits[digit];
                modifiedBuilder.replace(index, index + 1, name);
                end += (name.length() - 1);
                index += (name.length() - 1);
            }
        }

        currentString = modifiedBuilder.toString();
    }
}

