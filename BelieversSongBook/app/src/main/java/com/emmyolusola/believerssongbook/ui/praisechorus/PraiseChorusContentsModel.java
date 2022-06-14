package com.emmyolusola.believerssongbook.ui.praisechorus;

public class PraiseChorusContentsModel {

    private String contentTitle;
    private String content;
    private String keySignature;
    private String timeSignature;

    public PraiseChorusContentsModel(String contentTitle, String content, String keySignature, String timeSignature) {
        this.contentTitle = contentTitle;
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
