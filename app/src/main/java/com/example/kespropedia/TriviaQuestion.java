package com.example.kespropedia;

import android.app.Activity;

public class TriviaQuestion extends Activity {
    private int id;
    private String question;
    private String opta;
    private String optb;
    private String fact;
//    private String optd;
    private String answer;

    public TriviaQuestion(String q, String oa, String ob, String fc, String ans) {

        question = q;
        opta = oa;
        optb = ob;
        fact = fc;
//        optd = od;
        answer = ans;
    }

    public TriviaQuestion() {
        id = 0;
        question = "";
        opta = "";
        optb = "";
        fact = "";
//        optd = "";
        answer = "";
    }

    public String getQuestion() {
        return question;
    }

    public String getOptA() {
        return opta;
    }

    public String getOptB() {
        return optb;
    }

    public String getFact() {
        return fact;
    }
//
//    public String getOptD() {
//        return optd;
//    }

    public String getAnswer() {
        return answer;
    }

    public void setId(int i) {
        id = i;
    }

    public void setQuestion(String q1) {
        question = q1;
    }

    public void setOptA(String o1) {
        opta = o1;
    }

    public void setOptB(String o2) {
        optb = o2;
    }

    public void setFact(String f1) {
        fact = f1;
    }
//
//    public void setOptD(String o4) {
//        optd = o4;
//    }

    public void setAnswer(String ans) {
        answer = ans;
    }


}
