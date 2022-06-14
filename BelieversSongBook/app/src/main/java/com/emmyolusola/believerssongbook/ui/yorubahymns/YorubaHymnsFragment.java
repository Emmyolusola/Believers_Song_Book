package com.emmyolusola.believerssongbook.ui.yorubahymns;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.emmyolusola.believerssongbook.databinding.FragmentYorubaHymnsBinding;

public class YorubaHymnsFragment extends Fragment {

    private FragmentYorubaHymnsBinding yorubaHymnsBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        YorubaHymnsViewModel yorubaHymnsViewModel = new ViewModelProvider(this).get(YorubaHymnsViewModel.class);

        yorubaHymnsBinding = FragmentYorubaHymnsBinding.inflate(inflater, container, false);

        View root = yorubaHymnsBinding.getRoot();

        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        yorubaHymnsBinding = null;
    }
}
