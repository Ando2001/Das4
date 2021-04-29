import java.util.Scanner;

public class Shrjanagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Menu----");
        int shrjanagic = scanner.nextInt();
        System.out.println("Sexmel 1 paragic");
        System.out.println("Sexmel 2 makeres");
        int radius = 4;
        if (shrjanagic == 1) {
            System.out.println(2 * radius * Math.PI);
        }
        if (shrjanagic == 2) {
            System.out.println(Math.PI * Math.PI * radius * radius);
        }
    }
}
