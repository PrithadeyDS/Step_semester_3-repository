package Week_3_Assignments;

public class Level2Assignments {

    // P1. Grade Classifier With Logical Operators
    public static void classifyWithAttendance(int marks, int attendance) {
        if (attendance < 75 || marks < 40) {
            System.out.println("Detained");
        } else {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }

    // P2. Login Attempt Simulator With Break
    public static void simulateLogin(String correctCode, String[] attempts) {
        boolean granted = false;
        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                granted = true;
                break;
            }
        }
        if (!granted) {
            System.out.println("Access denied all attempts used");
        }
    }

    // P3. Skip Multiples Printer Using Continue
    public static void printSkippingMultiplesOfThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // P4. Menu-Driven Calculator Using Switch
    public static void calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    // P5. Prime Number Checker
    public static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        classifyWithAttendance(82, 80);
        classifyWithAttendance(91, 60);

        simulateLogin("1234", new String[]{"0000", "1234", "9999"});
        simulateLogin("1234", new String[]{"1111", "2222", "3333"});

        printSkippingMultiplesOfThree();

        calculate(10, 4, '+');
        calculate(10, 0, '/');
        calculate(10, 4, '%');

        checkPrime(17);
        checkPrime(18);
    }
}