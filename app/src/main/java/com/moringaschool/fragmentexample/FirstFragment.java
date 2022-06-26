package com.moringaschool.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    View view;
    Button firstButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_first, container,false);
        // get the reference of Button

        firstButton = (Button) view.findViewById(R.id.firstButton);
        // perform setOnClickListener on first Button

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast

                Toast.makeText(getActivity(), "First Frgamnet", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
