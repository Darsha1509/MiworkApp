package com.example.android.miwok;

/**
 * Created by Dasha on 18.07.2017.
 */

public class Word {

    private String miworkTranslation;
    private String defaulttranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String miworkTranslation, String defaulttranslation){
        this.miworkTranslation = miworkTranslation;
        this.defaulttranslation = defaulttranslation;
    }




    public Word(String miworkTranslation, String defaulttranslation, int imageResourceId){
        this.miworkTranslation = miworkTranslation;
        this.defaulttranslation = defaulttranslation;
        this.imageResourceId = imageResourceId;

    }



    public String getMiworkTranslation() {

        return miworkTranslation;
    }

    public void setMiworkTranslation(String miworkTranslation) {
        this.miworkTranslation = miworkTranslation;
    }

    public String getDefaulttranslation() {

        return defaulttranslation;
    }

    public void setDefaulttranslation(String defaulttranslation) {
        this.defaulttranslation = defaulttranslation;
    }

    public int getImageResourceId() {

        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {

        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() {

        return imageResourceId != NO_IMAGE_PROVIDED;
    }




    @Override
    public String toString() {
        return "Word{" +
                "miworkTranslation='" + miworkTranslation + '\'' +
                ", defaulttranslation='" + defaulttranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
