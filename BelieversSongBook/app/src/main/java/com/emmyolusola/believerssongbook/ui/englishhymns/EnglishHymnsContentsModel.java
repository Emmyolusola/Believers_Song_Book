package com.emmyolusola.believerssongbook.ui.englishhymns;

public class EnglishHymnsContentsModel {

    private String contentTitle;
    private String content;
    private String keySignature;
    private String timeSignature;

    public EnglishHymnsContentsModel(String title, String content, String keySignature, String timeSignature) {
        this.contentTitle = title;
        this.content = content;
        this.keySignature = keySignature;
        this.timeSignature = timeSignature;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getContent() {
        return content;
    }

    public String getKeySignature() {
        return keySignature;
    }

    public String getTimeSignature() {
        return timeSignature;
    }
}
