package com.emmyolusola.believerssongbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.emmyolusola.believerssongbook.databinding.ActivityContentBinding;
import com.emmyolusola.believerssongbook.ui.englishhymns.EnglishHymnsContents;

public class ContentActivity extends AppCompatActivity {

    private String titleEnglishHymns;
    private String titlePraiseChorus;
    private String titleWorshipSongs;
    private String titleYorubaHymns;
    private int englishHymnsPosition;
    private ActivityContentBinding contentBinding;

    private TextView keySignatureTV;
    private TextView timeSignatureTV;
    private TextView composerTV;
    private TextView englishHymnsContentTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contentBinding = ActivityContentBinding.inflate(getLayoutInflater());
        setContentView(contentBinding.getRoot());

//        getSupportActionBar(contentBinding.toolBarContent);

        keySignatureTV = contentBinding.keySignature;
        timeSignatureTV = contentBinding.timeSignature;
        composerTV = contentBinding.composer;
        englishHymnsContentTV = contentBinding.contentView;

        loadEnglishHymnsContents();

    }

    private void loadEnglishHymnsContents(){

        titleEnglishHymns = getIntent().getStringExtra("englishHymnsPosition");
//        englishHymnsPosition = Integer.parseInt(titleEnglishHymns);
//        englishHymnsPosition = getIntent().getIntExtra("EnglishHymnsPosition", 0);

        Log.d("tag", titleEnglishHymns);
        Toast.makeText(ContentActivity.this, titleEnglishHymns, Toast.LENGTH_SHORT).show();

        EnglishHymnsContents hymnsContents = new EnglishHymnsContents();
        hymnsContents.englishHymnsContents(titleEnglishHymns);
    }

    private void loadPraiseChorusContents(){

        titlePraiseChorus = getIntent().getStringExtra("praiseChorusPosition");

        Toast.makeText(ContentActivity.this, titlePraiseChorus, Toast.LENGTH_SHORT).show();

        EnglishHymnsContents hymnsContents = new EnglishHymnsContents();
        hymnsContents.englishHymnsContents(titleEnglishHymns);
    }

    private void loadWorshipSongsContents(){

    }

    private void loadYorubaHymnsContents(){

    }
}