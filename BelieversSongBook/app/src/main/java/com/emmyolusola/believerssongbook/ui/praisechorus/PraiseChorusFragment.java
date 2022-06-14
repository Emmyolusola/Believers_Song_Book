package com.emmyolusola.believerssongbook.ui.praisechorus;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.emmyolusola.believerssongbook.R;
import com.emmyolusola.believerssongbook.databinding.FragmentPraiseChorusBinding;

import java.util.ArrayList;
import java.util.List;

public class PraiseChorusFragment extends Fragment {

    private FragmentPraiseChorusBinding praiseChorusBinding;
    private List<PraiseChorusViewModel> praiseChorusViewModelList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        PraiseChorusViewModel praiseChorusViewModel = new ViewModelProvider(this).get(PraiseChorusViewModel.class);

        View view = inflater.inflate(R.layout.fragment_praise_chorus_list, container, false);

        if (view instanceof RecyclerView){
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new PraiseSongsRecyclerViewAdapter(getActivity(), praiseChorusViewModelList));
        }

        String[] title = getResources().getStringArray(R.array.praise_songs_title_array);
        String[] desc = getResources().getStringArray(R.array.praise_songs_title_array);

        for (int i = 0; i < title.length; i++){
            praiseChorusViewModelList.add(new PraiseChorusViewModel(title[i], desc[i], Integer.toString(i + 1)));
        }

//        PraiseSongsRecyclerViewAdapter.PraiseChorusViewHolder holder =
//                new PraiseSongsRecyclerViewAdapter.PraiseChorusViewHolder()

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        praiseChorusBinding = null;
    }
}
