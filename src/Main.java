
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N,k,n,IP,i;

        System.out.print("Masukkan Nilai Bobot Hasil Evaluasi Masing-Masing Mata kuliah = ");
        N=Integer.parseInt(br.readLine());


        System.out.print("Masukkan Besar SKS Masing-Masing Mata kuliah = ");
        k=Integer.parseInt(br.readLine());


        System.out.print("Masukkan Jumlah Kumulatif Mata kuliah Yang Telah Ditempuh = ");
        n=Integer.parseInt(br.readLine());


        IP={for(i = 1; i <=n+1; i++) System.out.println((k*i)*(N*i))/
        for (i = 1; i <=n+1; i++) System.out.println(k*i);}

        if (IP<=3.5){
            System.out.println("SKS Maksimal Yang Bisa Diambil Adalah 24");

        }
        else if (IP >= 3 && IP <=3.49 ){
            System.out.println("SKS Maksimal Yang Bisa Diambil Adalah 22");
        }
        else if (IP >=2.99 && IP >=2.00) {
            System.out.println("SKS Maksimal Yang Bisa Diambil Adalah 20");
        }
        else if (IP <2.00) {
            System.out.println("SKS Maksimal Yang Bisa Diambil Adalah 18");
        }
        else {
            System.out.println("Nilai Tidak Ditemukan");
        }
    }
}