package com.emmyolusola.believerssongbook.ui.englishhymns;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.emmyolusola.believerssongbook.R;
import com.emmyolusola.believerssongbook.databinding.FragmentEnglishHymnsContentBinding;

class EnglishHymnsContentFragment extends Fragment {

    private FragmentEnglishHymnsContentBinding englishHymnsContentBinding;

    private String boy;
    private TextView contentTitle;
    private TextView content;
    private TextView keySignature;
    private TextView timeSignature;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        boy = getArguments().getString("position");

        Toast.makeText(getContext(), boy, Toast.LENGTH_SHORT).show();

//        contentTitle = englishHymnsContentBinding.contentTitle;
//        content = englishHymnsContentBinding.content;
//        keySignature = englishHymnsContentBinding.keySignature;
//        timeSignature = englishHymnsContentBinding.timeSignature;

        return inflater.inflate(R.layout.fragment_english_hymns_content, container, false);

    }




}