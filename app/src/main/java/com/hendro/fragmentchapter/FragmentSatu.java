package com.hendro.fragmentchapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment {

    TextView frText;

    public FragmentSatu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_satu, container, false);

        View view = inflater.inflate(R.layout.fragment_satu, container, false);
        frText = (TextView) view.findViewById(R.id.frText);

        return view;
    }

    public void setText(String string){
        frText.setText(string);
    }

}
