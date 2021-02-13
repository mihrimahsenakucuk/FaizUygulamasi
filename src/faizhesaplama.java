import java.util.Scanner;

public class faizhesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Anaparayı giriniz");
        int anapara = scan.nextInt();

        double faiz = 0.05;
        int ay = 24;

        for (int i= 0 ; i <= 24 ; i++){
            double birikimliTutar= anapara *  (1 + faiz * i);

            System.out.println(i + ". ay  tutar: "+ (int)birikimliTutar);

        }
    }
}