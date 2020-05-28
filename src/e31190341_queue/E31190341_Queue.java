/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190341_queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Amirotul Kotimah
 */
public class E31190341_Queue {
    //mendeklarasikan variabel yang bersifat private yang hanya dapat dipanggil dari kelas ini
    private static int ukuran;
    private static Queue<Integer>queue;

    public static void main(String[] args) {
        //menampilkan kalimat "Berapa ukuran queue yang diinginkan : "
        System.out.print("Berapa ukuran queue yang diinginkan : ");
        ukuran = inputData();
        buatQueue();
        bacaData();
        tulisData();
        
}
    //membuat method buatQueue yang bersifat private yang hanya dapat dipangggil dari kelas ini
    private static void buatQueue (){
        queue = new LinkedList<Integer>();
    }
    //membuat method inputData yang bersifat private yang hanya dapat dipangggil dari kelas ini
    private static int inputData (){
        //membaca variabel yang diinputkan
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        //mendeklarasikan variabel String angkaInput
        String angkaInput = null;
        //menggunakan fungsi readLine untuk mendapatkan inputan dari keyboard
        //dan menuliskan dalam block try-catch
        try {
            angkaInput = bfr.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkaInput).intValue();
        return Data;
    }
    //membuat method tulisData yang bersifat private yang hanya dapat dipangggil dari kelas ini
    private static void tulisData () {
        //mendeklarasikan variabel dengan menggunakan tipe data integer 
        Integer data;
        //menampilkan kalimat "Urutan keluar elemen dari Queue : "
        System.out.println("\nUrutan keluar elemen dari Queue : ");
        //menggunakan perulangan for, jika i = 0; i<ukuran; i++
        for (int i = 0; i<ukuran; i++) {
            //untuk menghapus data queue
            data = queue.remove();
            //menampilkan kalimat "Data ke-" 
            System.out.println("Data ke-" + (i+1) + " : "+data);
        }
        //untk mengambil ukuran data queue
        data = queue.size();
        //menampilkan kalimat "Ukuran Queue sekarang adalah "
        System.out.println("Ukuran Queue sekarang adalah "+data);
    }
    //membuat method bacaData yang bersifat private yang hanya dapat dipangggil dari kelas ini
    private static void bacaData () {
        //mendeklarasikan variabel dengan menggunakan tipe data integer
        Integer data;
        //menggunakan perulangan for, jika i = 0; i<ukuran; i++
        for (int i = 0; i < ukuran; i++) {
            //menampilkan kalimat "Data ke-"
            System.out.print("Data ke-" + (i+1) +" : ");
            //memanggil pada method inputData
            data = inputData();
            //untuk menambahkan data queue
            queue.add(data);
        }
        //untuk mengambil ukuran data queue
        data = queue.size();
        //menampilkan kalimat "Ukuran Queue sekarang adalah "
        System.out.println("Ukuran Queue sekarang adalah "+data);
    }
}