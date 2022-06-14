package com.emmyolusola.believerssongbook.ui.yorubahymns;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.emmyolusola.believerssongbook.ContentActivity;
import com.emmyolusola.believerssongbook.databinding.SongListsBinding;

import java.util.ArrayList;
import java.util.List;

public class YorubaHymnsRecyclerViewAdapter extends RecyclerView.Adapter<YorubaHymnsRecyclerViewAdapter.YorubaHymnsViewHolder> {

    private List<YorubaHymnsViewModel> yorubaHymnsList = new ArrayList<>();
    private Activity context;

    @NonNull
    @Override
    public YorubaHymnsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new YorubaHymnsViewHolder(SongListsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull YorubaHymnsViewHolder holder, int position) {
        holder.yorubaHymnsViewModel = yorubaHymnsList.get(position);
        holder.titleTV.setText(yorubaHymnsList.get(position).getTitle());
        holder.descTV.setText(yorubaHymnsList.get(position).getDesc());
        holder.numberButton.setText(yorubaHymnsList.get(position).getSongNumber());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, ContentActivity.class);
                intent.putExtra("yorubaHymnsPosition", holder.yorubaHymnsViewModel.getTitle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return yorubaHymnsList.size();
    }

    public class YorubaHymnsViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTV;
        public TextView descTV;
        public Button numberButton;
        public CardView cardView;
        public YorubaHymnsViewModel yorubaHymnsViewModel;

        public YorubaHymnsViewHolder(SongListsBinding binding) {
            super(binding.getRoot());
            titleTV = binding.songTitle;
            descTV = binding.songDesc;
            numberButton = binding.songNumber;
            cardView = binding.cardView;
        }
    }
}
