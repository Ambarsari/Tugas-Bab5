public class PerhitunganJaket1 {
    final int A = 100000;
    final int B = 125000;
    final int C = 175000;
    int jaketA , jaketB, jaketC;
  int totalA , totalB , totalC;
    public void hitungDiskonA(int jumlah ){
        if(jumlah > 100){
            jaketA = A - 5000;
            totalA = jaketA * jumlah;
            System.out.println("Harga jaket A = " + jaketA);
            System.out.println("Harga total keseluruhan pembelian jaket A = " + totalA);
        }else{
            totalA = A * jumlah;
            System.out.println("Harga jaket A = " + A);
            System.out.println("Harga total keseluruhan pembelian jaket A = " + totalA);
        }
    }
    public void hitungDiskonB(int jumlah){
        if (jumlah > 100){
            jaketB = B - 5000;
            totalB = jaketB * jumlah;
            System.out.println("Harga jaket B = " + jaketB);
            System.out.println("Harga total keseluruhan pembelian jaket B = " + totalB);
        }else{
            totalB = B * jumlah;
            System.out.println("Harga jaket B = " + B);
            System.out.println("Harga total keseluruhan pembelian jaket B = " + totalB);
        }
    }
    public void hitungDiskonC(int jumlah){
        if (jumlah > 100){
            jaketC = C - 15000;
            totalC = jaketC * jumlah;
            System.out.println("Harga jaket C = " + jaketC);
            System.out.println("Harga total keseluruhan pembelian jaket C = " + totalC);
        }else{
            totalC = C * jumlah;
            System.out.println("Harga jaket C = " + C);
            System.out.println("Harga total keseluruhan pembelian jaket C = " + totalC);
        }
    }
    }

