package pl.javastart.task;

import java.util.Scanner;

class NumberGuesser {
    private final Scanner scanner = new Scanner(System.in);

    void run() {
        while (!isValidNumber(getUsersNumber())) {}

        System.out.println("Twoja liczba jest ok");
    }

    private int getUsersNumber() {
        System.out.println("Podaj liczbę");
        int usersNumber = scanner.nextInt();
        scanner.nextLine();
        return usersNumber;
    }

    private boolean isValidNumber(int usersNumber) {
        if (isInCorrectRange(usersNumber)) {
            return isDivisibleBy3(usersNumber);
        }

        return false;
    }

    private boolean isInCorrectRange(int usersNumber) {
        if (usersNumber < 100) {
            System.out.println("Podana liczba jest za mała");
        } else if (usersNumber > 200) {
            System.out.println("Podana liczba jest za duża");
        } else {
            return true;
        }

        return false;
    }

    private boolean isDivisibleBy3(int usersNumber) {
        boolean isDivisible = usersNumber % 3 == 0;
        if (!isDivisible) {
            System.out.println("Liczba nie jest podzielna przez 3");
            return false;
        }

        return true;
    }
}
