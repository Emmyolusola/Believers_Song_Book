package com.emmyolusola.believerssongbook.ui.englishhymns;

import android.content.Context;
import android.widget.TextView;

import com.emmyolusola.believerssongbook.ContentActivity;
import com.emmyolusola.believerssongbook.R;
import com.emmyolusola.believerssongbook.databinding.ActivityContentBinding;
import com.emmyolusola.believerssongbook.databinding.SongContentsBinding;

import java.util.ArrayList;
import java.util.List;

public class EnglishHymnsContents {

    private ActivityContentBinding contentBinding;

    private TextView keySignatureTV;
    private TextView timeSignatureTV;
    private TextView composerTV;
    private TextView englishHymnsContentTV;

    private Context context;

    public List<EnglishHymnsContentsModel> englishHymnsContents(String mTitle){

        List<EnglishHymnsContentsModel> hymnsContents = new ArrayList<>();

        ContentActivity activity = new ContentActivity();

//        keySignatureTV = contentBinding.keySignature;
//        timeSignatureTV = contentBinding.timeSignature;
//        composerTV = contentBinding.composer;
//        englishHymnsContentTV = contentBinding.contentView;

        switch (mTitle){
            case "Only Believe":
                String[] onlyBelieve = context.getResources().getStringArray(R.array.only_believe);
                for (int i = 0; i < onlyBelieve.length; i++){
                    keySignatureTV.setText(onlyBelieve[0]);
                    timeSignatureTV.setText(onlyBelieve[1]);
                    composerTV.setText(onlyBelieve[2]);
                    englishHymnsContentTV.setText(onlyBelieve[3]);
                }
                break;
            case "Amazing Grace":
                String[] amazingGrace = context.getResources().getStringArray(R.array.amazing_grace);
                for (int i = 0; i < amazingGrace.length; i++){
                    keySignatureTV.setText(amazingGrace[0]);
                    timeSignatureTV.setText(amazingGrace[1]);
                    composerTV.setText(amazingGrace[2]);
                    englishHymnsContentTV.setText(amazingGrace[3]);
                }
                break;
        }

        return hymnsContents;
    }
}
