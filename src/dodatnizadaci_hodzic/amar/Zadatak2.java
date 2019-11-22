package dodatnizadaci_hodzic.amar;

public class Zadatak2 {

    public static void main(String[] args) {
        System.out.println("Zadatak, koji racuna sumu svih trocifrenih neparnih brojeva");
        int suma = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("Suma svih trocifrenih neparnih brojeva je: " + suma);
    }

}
