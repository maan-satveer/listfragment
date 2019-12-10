package com.example.fragmentdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {

     private long position_id;

    public void setPosition_id(long position_id) {
        this.position_id = position_id;
    }

    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            TextView titleview = view.findViewById(R.id.tittle_position);
            TextView description = view.findViewById(R.id.decription_position);
            Position position = Position.positions[(int) position_id];
            titleview.setText(position.getTitle());
            description.setText(position.getDescription());
        }
    }
}
