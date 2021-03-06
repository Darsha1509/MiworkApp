package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("weṭeṭṭi", "red", R.drawable.color_red));
        words.add(new Word("chokokki", "green", R.drawable.color_green));
        words.add(new Word("ṭakaakki", "brown", R.drawable.color_brown));
        words.add(new Word("ṭopoppi", "gray", R.drawable.color_gray));
        words.add(new Word("kululli", "black", R.drawable.color_black));
        words.add(new Word("kelelli", "white", R.drawable.color_white));
        words.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow));
        words.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow));



        WordAdapter adapter = new WordAdapter(getActivity(), R.color.category_colors, words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
