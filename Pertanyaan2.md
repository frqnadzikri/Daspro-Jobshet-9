1. Ubah statement pada langkah nomor 5 menjadi seperti berikut:
for (int i = 0; i < nilaiAkhir.length; i++){
    System.out.print("Masukkan nilai akhir ke-"+i+" : ");
    nilaiAkhir[i] = sc.nextInt();
}
-Jawaban: Ya, terjadi perubahan pada output. Program sekarang menampilkan teks "Masukkan nilai akhir ke-" tanpa newline setelahnya (menggunakan print() bukan println()), sehingga input akan berada di baris yang sama dengan teks tersebut. Ini membuat tampilan lebih rapi.
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length?
-Jawaban: Kondisi i < nilaiAkhir.length adalah kondisi perulangan yang berarti loop akan terus berjalan selama nilai i kurang dari panjang array nilaiAkhir. Dalam kasus ini, nilaiAkhir.length adalah 10, jadi loop akan berjalan dari i=0 sampai i=9 (10 kali iterasi).
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
for (int i = 0; i < nilaiAkhir.length; i++){
    if (nilaiAkhir[i] > 70){
        System.out.println("Mahasiswa ke-"+i+" lulus!");
    }
}
Jalankan program dan jelaskan alur program!
-Jawaban:
Program meminta input 10 nilai mahasiswa
Setelah semua nilai diinput, program melakukan pengecekan satu per satu
Hanya mahasiswa dengan nilai > 70 yang akan ditampilkan dengan pesan "lulus!"
Mahasiswa dengan nilai ≤ 70 tidak ditampilkan
