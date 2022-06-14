package com.emmyolusola.believerssongbook.ui.praisechorus;

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

import java.util.List;

public class PraiseSongsRecyclerViewAdapter extends RecyclerView.Adapter<PraiseSongsRecyclerViewAdapter.PraiseChorusViewHolder> {

    private List<PraiseChorusViewModel> praiseChorusList;
    private Activity context;

    public PraiseSongsRecyclerViewAdapter(Activity context, List<PraiseChorusViewModel> praiseChorusViewModelList) {
        this.context = context;
        this.praiseChorusList = praiseChorusViewModelList;
    }

    @NonNull
    @Override
    public PraiseChorusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PraiseChorusViewHolder(SongListsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PraiseChorusViewHolder holder, int position) {
        holder.praiseChorusViewModel = praiseChorusList.get(position);
        holder.titleTV.setText(praiseChorusList.get(position).getTitle());
        holder.descTV.setText(praiseChorusList.get(position).getDesc());
        holder.numberButton.setText(praiseChorusList.get(position).getNumber());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ContentActivity.class);
                intent.putExtra("praiseChorusPosition", holder.praiseChorusViewModel.getNumber());
//                intent.putExtra("praiseChorusPosition", holder.praiseChorusViewModel.getTitle());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return praiseChorusList.size();
    }

    public class PraiseChorusViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTV;
        public TextView descTV;
        public Button numberButton;
        public CardView cardView;
        public Activity context;
        public PraiseChorusViewModel praiseChorusViewModel;

        public PraiseChorusViewHolder(SongListsBinding binding) {
            super(binding.getRoot());
            titleTV = binding.songTitle;
            descTV = binding.songDesc;
            numberButton = binding.songNumber;
            cardView = binding.cardView;
        }
    }
}
