package com.bignerdranch.android.geoquiz;

/**
 * Created by andro1d on 06.01.2017.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {

        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public Question(int TextResId, boolean AnswerTrue) {
        this.mTextResId = TextResId;
        this.mAnswerTrue = AnswerTrue;
    }

}
