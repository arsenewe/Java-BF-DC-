
import bruteforcedivideconquer.Maxmin;
import bruteforcedivideconquer.minMax;
import static bruteforcedivideconquer.minMax.max_min;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author septianenggarsukmana
 */
public class BruteForceDivideConquer {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke-"+i);
            System.out.print("Masukkan nilai: ");
            ppArray[i].nilaiArray = sc.nextInt();
        }
        
        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;
        for(int i=0; i<5;i++){
            if(ppArray[i].nilaiArray<min){
                min = ppArray[i].nilaiArray;
            } else if (ppArray[i].nilaiArray > max){
                max = ppArray[i].nilaiArray;
            }
        }
        System.out.println("Brute Force");
        System.out.println("Nilai minimal: " + min);
        System.out.println("Nilai maksimal" + max);
        
        
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = ppArray[i].nilaiArray;
        }
            Maxmin hasil = new Maxmin();
            
            max_min(arr, 0,4, hasil);
            
            System.out.println("Divide and Conquer");
            System.out.print("Nilai maksimal: " + hasil.minimum + "\nNilai maksimal: " + hasil.maximum);
            System.out.print("\n");
                
    }
    
}
