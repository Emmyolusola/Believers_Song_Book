package com.emmyolusola.believerssongbook.ui.englishhymns;

import java.util.ArrayList;
import java.util.List;

public class EnglishHymnsViewModel {

    private final String title;
    private final String desc;
    private final String id;

    public EnglishHymnsViewModel(String title, String desc, String id) {
        this.title = title;
        this.desc = desc;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }

//    public static class EnglishHymns {
//
//        private static EnglishHymns englishHymns;
//
//        private List<EnglishHymnsViewModel> englishHymnsViewModels;
//
//        public static EnglishHymns getInstance() {
//            if (englishHymns == null) {
//                englishHymns = new EnglishHymns();
//            }
//            return englishHymns;
//        }
//
//        private EnglishHymns() {
//            englishHymnsViewModels = new ArrayList<>();
//
//        }
//
//        public List<EnglishHymnsViewModel> getEnglishHymnsViewModels() {
//            return englishHymnsViewModels;
//        }
//
//    }
}
