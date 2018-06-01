package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageSourceId;
    private  int mAudioSourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioSourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioSourceId = audioSourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imagerSourceId, int audioSourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageSourceId = imagerSourceId;
        this.mAudioSourceId = audioSourceId;
    }

    public String getDefaultTRanslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageSourceId(){
        return mImageSourceId;
    }

    public int getAudioSourceId(){return mAudioSourceId;}

}
