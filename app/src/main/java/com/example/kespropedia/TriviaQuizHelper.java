package com.example.kespropedia;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


class TriviaQuizHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DB_NAME = "TQuiz.db";

    //If you want to add more questions or wanna update table values
    //or any kind of modification in db just increment version no.
    private static final int DB_VERSION = 3;
    //Table name
    private static final String TABLE_NAME = "TQ";
    //Id of question
    private static final String UID = "_UID";
    //Question
    private static final String QUESTION = "QUESTION";
    //Option A
    private static final String OPTA = "OPTA";
    //Option B
    private static final String OPTB = "OPTB";
//    //Option C
//    private static final String OPTC = "OPTC";
//    //Option D
//
    private static final String FACT = "FACT";
    //Answer
    private static final String ANSWER = "ANSWER";

    //So basically we are now creating table with first column-id , sec column-question , third column -option A, fourth column -option B , Fifth column -option C , sixth column -option D , seventh column - answer(i.e ans of  question)
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + FACT + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    //Drop table query
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    TriviaQuizHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //OnCreate is called only once
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //OnUpgrade is called when ever we upgrade or increment our database version no
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    void allQuestion() {
        ArrayList<TriviaQuestion> arraylist = new ArrayList<>();

        arraylist.add(new TriviaQuestion("Perempuan yang lebih cepat mendapat haid pertama (menarche) = perempuan nakal", "Mitos", "Fakta", "Tidak ada hubungannya antara menarche dengan perilaku nakal. Menarche pada usia 10-15 tahun dipengaruhi faktor gizi dan keturunan",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Menstruasi dapat mengubah mood seseorang menjadi sedih, mudah marah, bahkan gampang tersinggung.", "Mitos", "Fakta", "Pada saat menstruasi terjadi perubahan hormonal yang dapat mempengaruhi pengaturan emosi seseorang di otak (sistem limbik). Sehingga pada perempuan  yang mengalami menstruasi dapat mudah terjadi perasaan sedih, marah, dan tersinggung.",
                "Fakta"));

        arraylist.add(new TriviaQuestion("Wanita yang masih perawan akan berdarah pada hubungan seks pertama kali atau hubungan seks yang dilakukan pada malam pertama pernikahan.", "Mitos", "Fakta", "Keperawanan dalam sudut pandang masyarakat adalah pada saat melakukan hubungan seksual pertama kali diharapkan terdapat bercak darah. Namun ini tidak selalu dapat terjadi karena banyak hal yang mengakibatkan bercak darah tidak terjadi pada hubungan seksual pertama kali misalnya selaput darah yang memiliki  berbagai macam bentuk dan tidak semua selaput darah ada pada perempuan yang melakukan hubungan seks pertama kali sehingga saat terjadinya penetrasi pada vagina tidak akan selalu terjadi kerusakan pada selaput darah yang menghasilkan perdarahan. Selain itu saat melakukan hubungan seksual, perempuan akan mengeluarkan cairan lubrikasi/cairan vagina. Sehingga saat hubungan seksual tidak merusak atau terjadi gesekan pada dinding vagina. Oleh karena itu keluarnya darah saat hubungan seksual pertama kali tidak dapat dijadikan sebagai patokan perawan atau tidaknya seorang perempuan.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Masturbasi atau onani hanya dilakukan pria dan menyebabkan pengeroposan tulang.", "Mitos", "Fakta", "Hingga saat ini belum ada penelitian resmi yang mengatakan bahwa melakukan masturbasi atau onani pada pria menyebabkan  pengeroposan tulang. Selain itu tidak ada hubungan antara mengeluarkan sperma terlalu sering dengan pengeroposan tulang khususnya di bagian kaki dan lutut. Namun perilaku ini berisiko jika dilakukan berlebihan karena dapat menyebabkan luka pada alat kelamin, keletihan, kelelahan dan dapat menimbulkan perasaan berdosa serta sulit dalam  berkonsentrasi.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Orang hiperseks dapat ditandai dengan jalan mengangkang dan bentuk bokong rata.", "Mitos", "Fakta", "Perilaku hiperseks seseorang tidak berhubungan dengan gaya jalan ataupun bentuk bokong. Perilaku hiperseks lebih mengarah psikis atau pandangannya tentang hubungan seks. Sedangkan gaya jalan dan bentuk bokong tergantung pada pengaruh genetik dan tingkah laku/cara jalan seseorang.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Payudara dapat diperbesar dengan meremas. ", "Mitos", "Fakta", "Besar kecilnya payudara disebabkan faktor keturunan dan saat pubertas tubuh akan memproduksi dan melepaskan hormon estrogen, akibatnya lemak dalam jaringan ikat dipayudara juga ikut membesar. Pembesaran payudara akibat diremas hanya bersifat sementara akibat adanya rangsangan.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Hubungan seks yang dilakukan hanya sekali tidak menyebabkan kehamilan.", "Mitos", "Fakta", "Kehamilan dapat terjadi apabila adanya sperma yang masuk ke organ kelamin wanita. Hubungan seks yang terjadi sekali atau berapapun, akan mengeluarkan sel sperma sehingga kemungkinan terjadi kehamilan tetap ada.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Makan nanas menyebabkan keguguran.", "Mitos", "Fakta", "Nanas merupakan buah yang mengandung vitamin C dan serat yang penting untuk menjaga kesehatan tubuh. Dan sampai saat ini belum ada hasil penelitian yang mengatakan makan nanas dapat menyebabkan keguguran janin. Namun jika buah nanas dimakan secara berlebihan akan menyebabkan gangguan pada sistem pencernaan (lambung dan usus), bukan pada alat reproduksi",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Makan coklat dapat mengurangi nyeri haid.", "Mitos", "Fakta", "Saat mengkonsumsi coklat akan memicu produksi hormon serotonin yang menimbulkan rasa nyaman sehingga nyeri yang dirasakan dianggap telah berkurang serta dapat memperbaiki mood saat sedang menstruasi",
                "Fakta"));

        arraylist.add(new TriviaQuestion("Menggaruk paha saat menstruasi dapat menimbulkan munculnya garis-garis putih (Stretch Mark).", "Mitos", "Fakta", "Stretch Mark adalah guratan berbentuk garis-garis halus yang berwarna putih sebagai tanda bahwa kulit sedang mengalami peregangan lebih dari batas normalnya dan hal ini sering terjadi pada ibu hamil karena pertumbuhan usia kehamilan yang secara terus meningkat dan dapat terjadi pada seseorang yang  mengalami kelebihan berat badan. Dengan demikian tidak ada kaitannya menggaruk paha saat menstruasi dengan stretch mark",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Makan pedas saat haid dapat membuat mulut rahim iritasi.", "Mitos", "Fakta", "Tidak ada hubungan antara makanan pedas dan iritasi mulut rahim. Mengkonsumsi makanan pedas dapat memperlancar sirkulasi darah dan meredakan perut kembung.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Minum kopi saat haid membuat rahim kering.", "Mitos", "Fakta", "Tidak ada kaitannya sama sekali minum kopi dengan rahim kering. Hanya saja apabila mengkonsumsi kafein yang berlebihan dapat mengakibatkan rasa cemas dan rasa nyeri di bagian payudara dan dapat mengakibatkan dehidrasi.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Minum soda dapat melancarkan haid.", "Mitos", "Fakta", "Konsumsi minuman bersoda tidak berpengaruh pada kelancaran haid. Penyebab menstruasi tidak lancar adalah karena hormon yang bertugas mengatur siklus menstruasi tidak seimbang, perubahan berat badan, atau karena stress",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Keramas saat menstruasi dapat menyebabkan sakit kepala.", "Mitos", "Fakta", "Faktanya wanita yang sedang menstruasi memang bisa mengalami sakit kepala tapi hal itu bukanlah disebabkan karena keramas melainkan karena sindrom premenstruasi. Justru dibolehkan keramas untuk menjaga kebersihan rambut dan kulit kepala",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Minum minuman dingin saat haid dapat menyebabkan darah haid membeku dan membuat dinding rahim mengeras.", "Mitos", "Fakta", "Menstruasi berhubungan dengan sistem reproduksi, sedangkan makanan dan minuman berhubungan dengan sistem pencernaan. Jadi mengonsumsi minuman dingin tidak berpengaruh terhadap menstruasi.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Menstruasi yang jarang sama dengan tidak subur.", "Mitos", "Fakta", "Secara medis sel telur akan tetap dilepaskan oleh indung telur (ovarium) sekalipun siklus menstruasi seorang perempuan tidak beraturan Jadi sebenarnya tetap subur. Dengan demikian pendapat ini sama sekali tidak benar",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Stress bikin haid tidak teratur.", "Mitos", "Fakta", "Saat sedang stress, bagian otak yang berfungsi mengatur siklus menstruasi (hipotalamus) akan menjadi terganggu akibatnya hormon yang dihasilkan menjadi tidak seimbang sehingga haid menjadi tidak teratur.",
                "Fakta"));

        arraylist.add(new TriviaQuestion("Menstruasi merupakan akitivitas pembuang darah kotor ditubuh.", "Mitos", "Fakta", "Darah menstruasi secara umum diasumsikan oleh masyarakat sebagai darah kotor. karena darah tersebut kemungkinan dianggap mengandung racun atau toksik bagi tubuh. Padahal darah mentruasi itu merupakan darah dari lapisan dinding rahim yang hancur/meluruh karena tidak terjadinya kehamilan serta adanya pembuluh darah yang robek saat dinding rahim meluruh sehingga keluar darah yang membeku dan warnanya terlihat sangat gelap. Jadi kemungkinan hal inilah yang selalu dianggap masyarakat sebagai darah kotor.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Melompat setelah hubungan intim mencegah kehamilan.", "Mitos", "Fakta", "Sel sperma mempunyai ekor yang menyebabkan ia dapat bergerak. Ketika sperma dilepaskan dalam organ kelamin wanita, maka sperma akan bergerak ke arah ovarium yang menghasilkan sel telur pada wanita yang dapat menyebabkan kehamilan. Melompat tidak selalu menjamin dapat membuat sperma keluar. Karena cairan sperma memiliki sifat sangat kental dan lengket sehingga bisa menempel lebih lama didalam organ kelamin wanita dan mempunyai pergerakan ekor yang sangat cepat untuk mendekati sel telur. Sehingga kehamilan tetap akan dapat terjadi.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Berenang saat menstruasi dapat menyebabkan kematian.", "Mitos", "Fakta", "Pada menstruasi hanya terjadi pengeluaran darah akibat pelepasan dinding rahim dan juga sel-sel pembuluh darah yang ikut meluruh. Namun pada saat menstruasi, dinding rahim menjadi gampang terinfeksi. Sehingga apabila seseorang berenang, kemungkinan benda asing atau kuman dari air tersebut bisa masuk kedalam rahim dan dapat terjadi infeksi. Tetapi berenang itu sendiri tidak dapat menyebabkan kematian kecuali orang tersebut tenggelam saat berenang",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Saat sedang menstruasi jangan mencukur bulu kemaluan, rambut, atau kuku yang dipotong kecuali saat mandi besar.", "Mitos", "Fakta", "Mencukur bulu kemaluan akan menyebabkan vagina menjadi lebih bersih dan terjaga apalagi saat menstruasi dimana vagina perlu dijaga agar tidak lembab,  demikian halnya rambut dan kuku merupakan bagian dari kebersihan diri yang perlu diperhatikan.",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Perempuan yang berpayudara besar dorongan seksualnya juga besar.", "Mitos", "Fakta", "Secara medis, payudara terdiri dari jaringan lemak yang mengandung kelenjar-kelenjar yang berperan dalam produksi air susu saat hamil dan setelah bersalin serta dalam kondisi tertentu payudara membesar akibat dari perubahan siklus hormon menjelang/saat menstruasi. Oleh karena itu tidak ada hubungan langsung antara ukuran payudara yang besar dengan dorongan seksual seseorang. Dorongan seksual ditentukan oleh kepribadian, hasrat/nafsu, pola sosialisasi, dan pengalaman seksual (melihat, mendengar, atau merasakan suatu rangsangan seksual)",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Membersihkan organ kelamin kewanitaan lebih efektif dengan sabun agar dapat menghilangkan keputihan.", "Mitos", "Fakta", "Membersihkan organ kelamin dengan sabun baik sabun mandi atau sabun khusus kewanitaan dapat menganggu keseimbangan kadar keasaman (pH) vagina. Vagina memiliki pH yang cenderung asam untuk menjaga pertumbuhan bakteri baik dan mencegah pertumbuhan kuman. Sedangkan pada sabun khusus kewanitaan cenderung memiliki ph yang basa sehingga dapat menganggu kesehatan organ kelamin dan justru menyebabkan keputihan",
                "Mitos"));

        arraylist.add(new TriviaQuestion("Mengkonsumsi sayuran hijau pada saat menstruasi akan mengurangi rasa nyeri/kram perut.", "Mitos", "Fakta", "Sayuran berdaun hijau mengandung kalsium, magnesium dan kalium yang tinggi. Zat gizi ini dapat membantu mengurangi rasa nyeri/kram perut saat menstruasi",
                "Fakta"));

        arraylist.add(new TriviaQuestion("Anak perempuan rentan mengalami anemia ketika pubertas.", "Mitos", "Fakta", "Saat pubertas anak perempuan mengalami kehilangan darah pada proses menstruasi. Jika tidak mengonsumsi makanan tinggi Fe (Kandungan zat besi yang dibutuhkan oleh sel darah merah) seperti sayuran hijau maka bisa menyebabkan anemia",
                "Fakta"));

        this.addAllQuestions(arraylist);

    }


    private void addAllQuestions(ArrayList<TriviaQuestion> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for (TriviaQuestion question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOptA());
                values.put(OPTB, question.getOptB());
                values.put(FACT, question.getFact());
//                values.put(OPTD, question.getOptD());
                values.put(ANSWER, question.getAnswer());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }


    List<TriviaQuestion> getAllOfTheQuestions() {

        List<TriviaQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, FACT,  ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setFact(cursor.getString(4));
//            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(4));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }
}
