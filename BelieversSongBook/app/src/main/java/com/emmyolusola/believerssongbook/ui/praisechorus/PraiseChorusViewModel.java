package com.emmyolusola.believerssongbook.ui.praisechorus;

import androidx.lifecycle.ViewModel;

public class PraiseChorusViewModel {

    private String title;
    private String desc;
    private String number;

    public PraiseChorusViewModel(String title, String desc, String number) {
        this.title = title;
        this.desc = desc;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getNumber() {
        return number;
    }
}
