import java.util.Scanner;

public class CetakKRS13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variabel UktLunas

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean UktLunas = sc.nextBoolean();

        if (UktLunas) {
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }

    }
}
