import java.util.Scanner;

public class Division {
    private int NuM1;
    private int NuM2;

    public int getNuM1() {
        return NuM1;
    }

    public void setNuM1(int nuM1) {
        this.NuM1 = nuM1;
    }

    public int getNuM2() {
        return NuM2;
    }

    public void setNuM2(int nuM2) {
        this.NuM2 = nuM2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division div = new Division();

        for (int i = 9; i >= 0; i--) {
            div.setNuM1(10);
            div.setNuM2(i);

            if (div.getNuM2() != 0) {
                int result = div.getNuM1() / div.getNuM2();
                System.out.println("Result of " + div.getNuM1() + " / " + div.getNuM2() + " = " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        }

        scanner.close();
    }
}
