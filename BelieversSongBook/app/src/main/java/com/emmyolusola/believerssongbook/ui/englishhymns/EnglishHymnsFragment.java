package com.emmyolusola.believerssongbook.ui.englishhymns;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.emmyolusola.believerssongbook.ContentActivity;
import com.emmyolusola.believerssongbook.R;
import com.emmyolusola.believerssongbook.databinding.FragmentEnglishHymnsBinding;

import java.util.ArrayList;
import java.util.List;

public class EnglishHymnsFragment extends Fragment {

    private FragmentEnglishHymnsBinding englishHymnsBinding;
    private final List<EnglishHymnsViewModel> englishHymnsList = new ArrayList<>();
    private EnglishHymnsViewModel hymnsViewModel;
    private SongListsBinding songListsBinding;
    private EnglishHymnsContentFragment englishHymnsContentFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_english_hymns_list, container, false);

        if (view instanceof RecyclerView){
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new EnglishSongsRecyclerViewAdapter(getActivity(), englishHymnsList));
        }

        String[] title = getResources().getStringArray(R.array.english_hymns_title_array);
        String[] desc = getResources().getStringArray(R.array.english_hymns_title_array);

        for (int i = 0; i < title.length; i++) {
            englishHymnsList.add(new EnglishHymnsViewModel(title[i], desc[i], Integer.toString(i + 1)));
        }

//        EnglishSongsRecyclerViewAdapter adapter = new EnglishSongsRecyclerViewAdapter(getActivity());

        EnglishSongsRecyclerViewAdapter.EnglishHymnsHolder holder =
                new EnglishSongsRecyclerViewAdapter.EnglishHymnsHolder(view, getActivity());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), holder.hymnsViewModel.getTitle(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getActivity(), ContentActivity.class);
                startActivity(intent);

            }
        });



//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), holder.hymnsViewModel.getTitle(), Toast.LENGTH_LONG).show();
//
//                FragmentManager manager = getParentFragmentManager();
//                manager.beginTransaction().add(R.id.nav_host_fragment_content_main, englishHymnsContentFragment).commit();
//            }
//        });



//        FragmentCommunication communication = new FragmentCommunication() {
//            @Override
//            public void respond(int position) {
//                Fragment englishHymnsContentFragment = new EnglishHymnsContentFragment();
//                Bundle bundle = new Bundle();
//                bundle.putInt("position", position);
//                englishHymnsContentFragment.setArguments(bundle);
//
//                FragmentManager manager = getFragmentManager();
//                manager.beginTransaction().replace(R.id.english_hymns_contents, englishHymnsContentFragment).commit();
//            }
//        };

//        EnglishSongsRecyclerViewAdapter.EnglishHymnsHolder holder = new EnglishSongsRecyclerViewAdapter.EnglishHymnsHolder(songListsBinding);

//        holder.getAbsoluteAdapterPosition();





//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), hymnsViewModel.getTitle(), Toast.LENGTH_SHORT).show();
//
//                EnglishHymnsContentFragment englishHymnsContentFragment = new EnglishHymnsContentFragment();
//                Bundle bundle = new Bundle();
//                bundle.putInt("position", holder.getAbsoluteAdapterPosition());
//                englishHymnsContentFragment.setArguments(bundle);
//
//                FragmentManager manager = getParentFragmentManager();
//                manager.beginTransaction().replace(R.id.english_hymns_contents, englishHymnsContentFragment).commit();
//
//            }
//        });

//        communication.respond();

        return view;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        englishHymnsBinding = null;
    }
}
