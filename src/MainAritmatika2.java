import java.util.Scanner;
public class MainAritmatika2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aritmatika2 yes = new Aritmatika2();
        int nilai1,nilai2,pilihan;
System.out.println("=========MENU ARITMATIKA==========");
        do{
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian ");
        System.out.println("5. Menyederhanakan pecahan ");
        System.out.println("6. Keluar");
        System.out.print("Masukan pilihan anda : ");
        pilihan = in.nextInt();
        switch (pilihan){
            case 1: 
                System.out.println("Masukan bilangan 1 : ");
                nilai1 = in.nextInt();
                System.out.println("Masukan bilangan 2 : ");
                nilai2 = in.nextInt();
                Aritmatika2.hitungPenjumlahan(nilai1, nilai2);
                break;
            case 2:
               System.out.print("Masukan bilangan 1 : ");
                nilai1 = in.nextInt();
                System.out.print("Masukan bilangan 2 : ");
                nilai2 = in.nextInt();
                Aritmatika2.hitungPebgurangan(nilai1, nilai2);
                break;
            case 3:
                System.out.print("Masukan bilangan 1 : ");
                nilai1 = in.nextInt();
                System.out.print("Masukan bilangan 2 : ");
                nilai2 = in.nextInt();
      yes.hitungPerkalian(nilai1, nilai2);
                break;
            case 4:
                System.out.print("Masukan bilangan 1 : ");
                nilai1 = in.nextInt();
                System.out.print("Masukan bilangan 2 : ");
                nilai2 = in.nextInt();
                yes.hitungPembagian(nilai1, nilai2);
                break;
            case 5:
                System.out.print("Masukan pembilang : ");
                nilai1 = in.nextInt();
                System.out.print("Masukan penyebut  : ");
                nilai2 = in.nextInt();
                yes.sederhana(nilai1, nilai2);
                break;
        }
    }while(pilihan <= 5); System.out.println("Terimakasih sudah berkunjung! ");
}
}

