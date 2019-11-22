package dodatnizadaci_hodzic.amar;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        System.out.println("Zadatak: Upisati dva broja i kao rezultat ispisati sve brojeve između njih koji su djeljivi sa 5");
        System.out.println("Unesite dva broja: ");
        int a;
        int b;
        Scanner sK = new Scanner(System.in);
        a = sK.nextInt();
        b = sK.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = b; i <= a; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
