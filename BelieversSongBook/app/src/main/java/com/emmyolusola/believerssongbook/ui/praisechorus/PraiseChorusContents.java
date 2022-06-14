package com.emmyolusola.believerssongbook.ui.praisechorus;

import android.widget.TextView;

import com.emmyolusola.believerssongbook.databinding.ActivityContentBinding;

import java.util.ArrayList;
import java.util.List;

public class PraiseChorusContents {

    private ActivityContentBinding contentBinding;

    private TextView keySignatureTV;
    private TextView timeSignatureTV;
    private TextView composerTV;
    private TextView praiseChorusContentsTV;

    public List<PraiseChorusContentsModel> populatePraiseChorusContents(String mTitle){

        List<PraiseChorusContentsModel> praiseChorusContents = new ArrayList<>();

        keySignatureTV = contentBinding.keySignature;
        timeSignatureTV = contentBinding.timeSignature;
        composerTV = contentBinding.composer;
        praiseChorusContentsTV = contentBinding.contentView;

        switch (mTitle){
//            case
        }

        return praiseChorusContents;
    }
}
