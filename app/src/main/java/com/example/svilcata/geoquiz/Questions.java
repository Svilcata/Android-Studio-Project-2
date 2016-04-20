package com.example.svilcata.geoquiz;

/**
 * Created by Svilcata on 05-Apr-16.
 */
public class Questions {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Questions(int textResId, boolean answerTrue) {
        this.mTextResId = textResId;
        this.mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
