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
public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("minto wuksus", "Where are you going?"));
        words.add(new Word("tinnә oyaase'nә", "What is your name?"));
        words.add(new Word("oyaaset...", "My name is..."));
        words.add(new Word("michәksәs?", "How are you feeling?"));
        words.add(new Word("kuchi achit", "I’m feeling good."));
        words.add(new Word("әәnәs'aa?", "Are you coming?"));
        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming."));
        words.add(new Word("әәnәm", "I’m coming."));
        words.add(new Word("yoowutis", "Let’s go."));
        words.add(new Word("әnni'nem", "Come here."));


        WordAdapter adapter = new WordAdapter(getActivity(), R.color.category_phrases, words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
