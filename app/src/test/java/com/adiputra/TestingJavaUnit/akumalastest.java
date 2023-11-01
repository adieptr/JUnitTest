package com.adiputra.TestingJavaUnit;

import org.junit.Test; // Import statement untuk anotasi @Test
import org.junit.runner.RunWith; // Import statement untuk anotasi @RunWith
import org.junit.runners.JUnit4; // Import statement untuk runner JUnit4
import static org.junit.Assert.assertEquals; // Import statement untuk asertivitas assertEquals

@RunWith(JUnit4.class) // Anotasi @RunWith dengan spesifikasi runner JUnit4
public class akumalastest {

    @Test
    // Metode pengujian untuk menguji metode 'tambah'
    public void testTambah() {
        akumalas kalkulator = new akumalas(); // Membuat objek kelas

        // Angka-angka pengujian
        int angka1 = 5;
        int angka2 = 3;

        // Hasil yang diinginkan
        int hasilYangDiHarapkan = 8;

        // Melakukan penjumlahan dan membandingkannya dengan hasil yang diharapkan
        int hasil = kalkulator.tambah(angka1, angka2);

        // Menggunakan asertivitas assertEquals untuk membandingkan hasil aktual dengan hasil yang diharapkan
        assertEquals(hasilYangDiHarapkan, hasil);
    }
}
