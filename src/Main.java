public class Main {

    public static void main(String[] args) {
        int coast = 200; // сумма начального счета
        int refill = 1400; // сумма пополнения


        int bon = 0;
        if (refill >= 1000) {
            bon = refill / 100;
        }

        int end = coast + refill + bon;

        System.out.println(bon);
        System.out.println(end);
    }
}
