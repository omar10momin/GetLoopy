public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
    }
}


class CountingLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }
    }
}

class CountDownBy2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}

class InitialPattern {
    public static void main(String[] args) {
        InitialPattern initialPattern = new InitialPattern();
        initialPattern.generateInitialO();
    }

    private void generateInitialO() {
        // Loop for the top three lines
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 18; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop for the middle six lines
        for (int i = 1; i <= 6; i++) {
            System.out.print("*");
            for (int j = 1; j <= 16; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Loop for the bottom three lines
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 18; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
