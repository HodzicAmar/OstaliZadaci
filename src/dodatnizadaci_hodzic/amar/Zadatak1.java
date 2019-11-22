package dodatnizadaci_hodzic.amar;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        System.out.println("Zadatak, koji za uneseni broj ispituje da li je prost!");
        System.out.println("Unesite jedan broj: ");
        Scanner sK = new Scanner(System.in);
        int broj = sK.nextInt();
        boolean prost = true;
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {
                prost = false;
            }
        }
        if (prost == true) {
            System.out.println("Uneseni broj je prost!");
        } else {
            System.out.println("Unesni broj je slozen!");
        }

    }

}
