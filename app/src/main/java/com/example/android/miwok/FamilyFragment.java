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
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("әpә", "father", R.drawable.family_father));
        words.add(new Word("әṭa", "mother", R.drawable.family_mother));
        words.add(new Word("angsi", "son", R.drawable.family_son));
        words.add(new Word("tune", "daughter", R.drawable.family_daughter));
        words.add(new Word("taachi", "older brother", R.drawable.family_older_brother));
        words.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother));
        words.add(new Word("teṭe", "older sister", R.drawable.family_older_sister));
        words.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister));
        words.add(new Word("ama", "grandmother", R.drawable.family_grandmother));
        words.add(new Word("paapa", "grandfather", R.drawable.family_grandfather));


        WordAdapter adapter = new WordAdapter(getActivity(), R.color.category_family, words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
