package com.example.quizmaniac;

public class Question
{
    private String question, A, B, C, D;
    private char answer;

    public Question(String question, String A, String B, String C, String D, char answer) {
        this.question = question;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }

    public char getAnswer() {
        return answer;
    }
}
