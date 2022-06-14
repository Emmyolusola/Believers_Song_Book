package com.emmyolusola.believerssongbook.ui.englishhymns;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.emmyolusola.believerssongbook.ContentActivity;
import com.emmyolusola.believerssongbook.R;
import com.emmyolusola.believerssongbook.databinding.SongListsBinding;

import java.util.List;

public class EnglishSongsRecyclerViewAdapter extends RecyclerView.Adapter<EnglishSongsRecyclerViewAdapter.EnglishHymnsHolder> {

    private List<EnglishHymnsViewModel> englishHymnsList;
//    private Context context;
    private Activity context;


    EnglishHymnsFragment englishHymnsFragment = new EnglishHymnsFragment();

    public EnglishSongsRecyclerViewAdapter(Activity mContext, List<EnglishHymnsViewModel> englishList) {
        context = mContext;
        englishHymnsList = englishList;
    }

    @NonNull
    @Override
    public EnglishHymnsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EnglishHymnsHolder(SongListsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EnglishHymnsHolder holder, int position) {
        holder.hymnsViewModel = englishHymnsList.get(position);
        holder.titleTV.setText(englishHymnsList.get(position).getTitle());
        holder.descTV.setText(englishHymnsList.get(position).getDesc());
        holder.hymnNumber.setText(englishHymnsList.get(position).getId());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), holder.hymnsViewModel.getTitle(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, ContentActivity.class);
//                intent.putExtra("englishHymnsPosition", holder.hymnsViewModel.getTitle());
                intent.putExtra("englishHymnsPosition", holder.hymnsViewModel.getId());
                context.startActivity(intent);
            }
        });

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), holder.hymnsViewModel.getTitle(), Toast.LENGTH_SHORT).show();
//
//
////                EnglishHymnsContentFragment englishHymnsContentFragment = new EnglishHymnsContentFragment();
////                Bundle bundle = new Bundle();
////                bundle.putString("position", holder.hymnsViewModel.getTitle());
////                englishHymnsContentFragment.setArguments(bundle);
//
////                FragmentManager manager =
////                manager.getFragment(bundle, "position");
////                manager.beginTransaction().replace(R.id.english_hymns_contents, englishHymnsContentFragment).commit();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return englishHymnsList.size();
    }


    public static class EnglishHymnsHolder extends RecyclerView.ViewHolder {

        public TextView titleTV;
        public TextView descTV;
        public Button hymnNumber;
        public EnglishHymnsViewModel hymnsViewModel;
        public CardView cardView;
        public Activity context;

        public EnglishHymnsHolder(@NonNull View itemView, Activity context) {
            super(itemView);
        }

        // bind the layout to the view widgets in the constructor
        public EnglishHymnsHolder(SongListsBinding songListsBinding) {
            super(songListsBinding.getRoot());
            titleTV = songListsBinding.songTitle;
            descTV = songListsBinding.songDesc;
            hymnNumber = songListsBinding.songNumber;
            cardView = songListsBinding.cardView;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Toast.makeText(view.getContext(), hymnsViewModel.getTitle(), Toast.LENGTH_SHORT).show();

//                    EnglishSongsRecyclerViewAdapter adapter = new EnglishSongsRecyclerViewAdapter(context);
//                    android.app.FragmentManager manager = context.getFragmentManager();
//                    manager.beginTransaction().replace(R.id.english_hymns_contents, ).commit();

//                    EnglishHymnsContentFragment englishHymnsContentFragment = new EnglishHymnsContentFragment();
//                    Bundle bundle = new Bundle();
//                    bundle.putString("position", hymnsViewModel.getTitle());
//                    englishHymnsContentFragment.setArguments(bundle);


                }
            });
        }

    }
}
