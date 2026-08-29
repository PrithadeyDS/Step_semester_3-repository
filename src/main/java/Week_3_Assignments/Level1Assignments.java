package Week_3_Assignments;

public class Level1Assignments {

    // P1. Voting Eligibility Checker
    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    // P2. Positive, Negative, or Zero Classifier
    public static void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    // P3. Print Numbers 1 to N
    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // P4. Sum of Natural Numbers Using a While Loop
    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    // P5. Day Name From Number
    public static void printDayName(int dayNumber) {
        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number"); break;
        }
    }

    public static void main(String[] args) {
        checkVotingEligibility(20);
        checkVotingEligibility(16);
        classifyNumber(15);
        classifyNumber(-4);
        classifyNumber(0);
        printNumbersUpToN(5);
        sumOfNaturalNumbers(5);
        printDayName(3);
        printDayName(9);
    }
}