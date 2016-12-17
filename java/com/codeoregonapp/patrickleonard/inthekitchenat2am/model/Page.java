package com.codeoregonapp.patrickleonard.inthekitchenat2am.model;

/**
 * Created by Patrick leonard on 10/18/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page (int imageId, String text, Choice choice1, Choice choice2) {
        this.mChoice1 = choice1;
        this.mChoice2 = choice2;
        this.mText = text;
        this.mImageId = imageId;
    }

    public Page (int imageId, String text) {
        this.mChoice2 = null;
        this.mChoice1 = null;
        this.mText = text;
        this.mImageId = imageId;
        this.mIsFinal = true;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }
}
