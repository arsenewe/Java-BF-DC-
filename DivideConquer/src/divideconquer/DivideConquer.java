package divideconquer;

import static divideconquer.minMax.max_min;
import java.util.Scanner;

class minMax{
    public int[] nilaiArray = new int[]{23,45,12,67,78};
    
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, Maxmin hasil){
        int indeks_tengah;
        Maxmin hasil1 = new Maxmin();
        Maxmin hasil2 = new Maxmin();
        
        if(indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        } else if (indeks_akhir - indeks_awal == 1){
            if(arr[indeks_awal] > arr[indeks_akhir]){
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            }
            else{
                hasil.minimum = arr[indeks_awal];
                hasil.maximum = arr[indeks_akhir];
            }
        } else{
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum; 
        }
    }
}

class Maxmin{
    public int maximum;
    public int minimum;
}


public class DivideConquer {

   public static void main(String[] args) {
        int[] ppArray = new int[5];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            ppArray[i] = new minMax().nilaiArray[i];
            System.out.println("Nilai indeks ke- "+ i);
            System.out.println("Masukkan nilai: " + ppArray[i]);
            //ppArray[i].nilaiarray = sc.nextInt();
        }
        
        int arr[] = new int[5];
        for (int i =0; i < 5; i++){
            arr[i] = ppArray[i];
        }
        
        Maxmin hasil = new Maxmin();
        max_min(arr, 0, 4, hasil);
        
        System.out.println("Divide Conquer");
        System.out.print("Nilai minimal: " + hasil.minimum + "\nNilai maksimal: " + hasil.maximum);
        System.out.print("\n");
    }
    
}

