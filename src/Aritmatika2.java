public class Aritmatika2 {
    public static void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Maka nilai penjumlahan adalah : " + nilai);
    }
    public static void hitungPebgurangan(int a, int b) {
        int nilai = a - b;
System.out.println("Maka nilai hasil pengurangan adalah : " + nilai);
    }
    public void hitungPerkalian(int a, int b) {
        int nilai = a * b;
System.out.println("Maka nilai hasil perkalian adalah : " + nilai);
    } 
public void hitungPembagian(int a, int b) {
        int nilai = a / b;
System.out.println("Maka nilai hasil pembagian adalah : " + nilai);
    }
    public void sederhana(int pembilang, int penyebut) {
        int temp=1;
        int i=2;
        while (i <= pembilang ) {
             if (penyebut%i==0 && pembilang % i==0) {
                 temp = i;
             }
             i++;
        }
        System.out.println("Maka hasil setelah di sederhanakan menjadi : "+(pembilang / temp)+ "/" +(penyebut / temp));
    }
}

