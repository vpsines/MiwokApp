package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mimageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mMiwokAudio;

    public Word(String defaultTranslation, String miwokTranslation,int miwokAudio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokAudio=miwokAudio;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int miwokAudio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mimageResourceId = imageResourceId;
        mMiwokAudio=miwokAudio;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mimageResourceId;
    }
    public boolean hasImage(){
        return mimageResourceId!=NO_IMAGE_PROVIDED;
    }
    public int getMiwokAudio(){
        return mMiwokAudio;
    }

}
