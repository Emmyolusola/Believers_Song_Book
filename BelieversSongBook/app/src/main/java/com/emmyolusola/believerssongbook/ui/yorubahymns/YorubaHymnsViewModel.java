package com.emmyolusola.believerssongbook.ui.yorubahymns;

import androidx.lifecycle.ViewModel;

public class YorubaHymnsViewModel extends ViewModel {

    private String title;
    private String desc;
    private String songNumber;

    public YorubaHymnsViewModel(String title, String desc, String songNumber) {
        this.title = title;
        this.desc = desc;
        this.songNumber = songNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getSongNumber() {
        return songNumber;
    }
}
