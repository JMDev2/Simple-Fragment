package com.moringaschool.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    View view;
    Button secondButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_second, container,false);
        // get the reference of Button
        secondButton = (Button) view.findViewById(R.id.secondButton);
        // perform setOnClickListener on second Button
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_SHORT).show();

            }
        });
        return view;

    }

}
