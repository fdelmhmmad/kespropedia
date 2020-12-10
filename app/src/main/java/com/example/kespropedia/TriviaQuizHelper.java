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
//    private static final String OPTD = "OPTD";
    //Answer
    private static final String ANSWER = "ANSWER";
    //So basically we are now creating table with first column-id , sec column-question , third column -option A, fourth column -option B , Fifth column -option C , sixth column -option D , seventh column - answer(i.e ans of  question)
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
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

        arraylist.add(new TriviaQuestion("Perempuan yang lebih cepat mendapat haid pertama (menarche) = perempuan nakal ?", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Perawan akan berdarah pada hubungan seks pertama atau malam pertama ? ", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Masturbasi atau onani hanya dilakukan pria dan menyebabkan dengkul kopong? ", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Orang hiperseks, jalan mengangkang dan bentuk bokong rata ? ", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Payudara bisa diperbesar dengan meremasnya ? ", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Hubungan seks sekali tidak menyebabkan hamil ?", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Makan nanas menyebabkan keguguran ?", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Makanan manis bikin nyeri haid hilang ? ", "Mitos", "Fakta",  "Fakta"));

        arraylist.add(new TriviaQuestion("Makan pedas saat haid dapat membuat mulut rahim iritasi ? ", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Minum kopi saat haid membuat rahim kering ?", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Minum soda dapat melancarkan haid? ", "Mitos", "Fakta", "Mitos"));

        arraylist.add(new TriviaQuestion("Konsumsi timun saat haid memicu terjadinya kista ? ", "Mitos", "Fakta", "Mitos"));

        arraylist.add(new TriviaQuestion("Keramas saat menstruasi dapat menyebabkan sakit kepala?", "Mitos", "Fakta", "Mitos"));

        arraylist.add(new TriviaQuestion("Minum minuman dingin saat haid dapat menyebabkan darah haid membeku dan membuat dinding rahim mengeras ?", "Mitos", "Fakta", "Mitos"));

        arraylist.add(new TriviaQuestion("Stress bikin haid tidak teratur ?", "Mitos", "Fakta",  "Fakta"));

        arraylist.add(new TriviaQuestion("Menstruasi bisa “menular”? ", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Menstruasi merupakan membuang darah kotor ?", "Mitos", "Fakta", "Mitos"));

        arraylist.add(new TriviaQuestion("Melompat setelah hubungan intim mencegah kehamilan ?", "Mitos", "Fakta",  "Mitos"));

        arraylist.add(new TriviaQuestion("Tidak boleh berenang saat menstruasi karena akan menyebabkan kematian ?", "Mitos", "Fakta", "Mitos"));

        arraylist.add(new TriviaQuestion("Sudah cukup umur jadi tidak mungkin hamil ? ", "Mitos", "Fakta",  "Mitos"));

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
//                values.put(OPTC, question.getOptC());
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
        String coloumn[] = {UID, QUESTION, OPTA, OPTB,  ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
//            question.setOptC(cursor.getString(4));
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
