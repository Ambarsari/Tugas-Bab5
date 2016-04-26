
import java.util.Scanner;


public class Perhitunganjaket1Main {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PerhitunganJaket1 yes = new PerhitunganJaket1();
        int pilihan;
        int jumlah;
 System.out.println("JAKET LAB KOMDAS KUALITAS NOMER 1!");
        do {
System.out.println("=========PEMESANAN JAKET============");
            System.out.println("1. Jaket bahan A ");
            System.out.println("2. Jaket bahan B ");
            System.out.println("3. Jaket bahan C ");
            System.out.println("4. Selesai");
            System.out.print("Masukan pilihan anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
 System.out.print("Masukan jumlah jaket yang ingin di pesan : ");
                    jumlah = in.nextInt();
                    if (jumlah > 100) {
 System.out.println("Selamat anda mendapat potongan harga Rp. 5000 / jaket! ");
                    }
                    yes.hitungDiskonA(jumlah);
                    break;
                case 2:
                    System.out.print("Masukan jumlah jaket yang ingin di pesan : ");
                    jumlah = in.nextInt();
                    if (jumlah > 100) {
  System.out.println("Selamat anda mendapat potongan harga Rp. 5000 / jaket! ");
                    }
                    yes.hitungDiskonB(jumlah);
                    break;
                case 3:
System.out.print("Masukan jumlah jaket yang ingin di pesan : ");
                    jumlah = in.nextInt();
                    if (jumlah > 100) {
System.out.println("Selamat anda mendapat potongan harga Rp. 15000 / jaket! ");
                    }
                    yes.hitungDiskonC(jumlah);
                    break;
            }
        } while (pilihan <= 3);
        System.out.println("Terimakasih sudah memesan! ");
    }
}


