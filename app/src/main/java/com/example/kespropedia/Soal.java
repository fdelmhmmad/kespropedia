package com.example.kespropedia;

public class Soal {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Perempuan yang lebih cepat mendapat haid pertama (menarche) = perempuan nakal ?",
            "Perawan akan berdarah pada hubungan seks pertama atau malam pertama ?",
            "Masturbasi atau onani hanya dilakukan pria dan menyebabkan dengkul kopong?",
            "Orang hiperseks, jalan mengangkang dan bentuk bokong rata ? ",
            "Payudara bisa diperbesar dengan meremasnya ? ",
            "Hubungan seks sekali tidak menyebabkan hamil ? ",
            "Makan nanas menyebabkan keguguran ? ",
            "Makanan manis bikin nyeri haid hilang ?",
            "Makan pedas saat haid dapat membuat mult rahim iritasi ? ",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
            {"Fakta","Mitos"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Mitos",
            "Mitos",
            "Mitos",
            "Mitos",
            "Mitos",
            "BMitos",
            "Mitos",
            "Fakta",
            "Mitos",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

