package Week_3_Assignments;

public class Level3Assignments {

    // P1. Number Pyramid Pattern Printer
    public static void printNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // P2. ATM PIN Retry System
    public static void atmPinRetry(String correctPin, String[] attempts) {
        int index = 0;
        boolean success = false;
        while (index < attempts.length && index < 3 && !success) {
            if (attempts[index].equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }
            index++;
        }
        if (!success) {
            System.out.println("Card blocked too many incorrect attempts");
        }
    }

    // P3. Traffic Signal Simulator
    public static void simulateTrafficSignal(int cycles) {
        int state = 0;
        for (int i = 0; i < cycles; i++) {
            switch (state) {
                case 0:
                    System.out.print("Red - Stop ");
                    break;
                case 1:
                    System.out.print("Green - Go ");
                    break;
                case 2:
                    System.out.print("Yellow - Prepare to stop ");
                    break;
            }
            state = (state + 1) % 3;
        }
        System.out.println();
    }

    // P4. Multiplication Table Generator With Input Validation
    public static void generateFirstValidTable(int[] candidates) {
        for (int candidate : candidates) {
            if (candidate < 1) {
                System.out.println("Skipping invalid number: " + candidate);
                continue;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(candidate + " x " + i + " = " + (candidate * i));
            }
            break;
        }
    }

    // P5. Guess the Number Game
    public static void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {
        int tries = 0;
        boolean guessed = false;
        while (tries < maxTries && tries < guesses.length) {
            int currentGuess = guesses[tries];
            if (currentGuess == secretNumber) {
                System.out.println("Correct! You guessed it");
                guessed = true;
                break;
            } else if (currentGuess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
            tries++;
        }
        if (!guessed) {
            System.out.println("Out of tries the number was " + secretNumber);
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(4);

        atmPinRetry("4821", new String[]{"1111", "4821"});
        atmPinRetry("4821", new String[]{"1111", "2222", "3333"});

        simulateTrafficSignal(3);

        generateFirstValidTable(new int[]{-3, 0, 7, 9});

        guessTheNumber(42, 4, new int[]{20, 60, 42});
        guessTheNumber(42, 2, new int[]{10, 15});
    }
}