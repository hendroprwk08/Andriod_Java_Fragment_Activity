package com.hendro.fragmentchapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentDua extends Fragment {

    public FragmentDua() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_dua, container, false);
        final EditText etFr2Nama = (EditText) view.findViewById(R.id.et_fr2_nama);
        final EditText etFr2NPM = (EditText) view.findViewById(R.id.et_fr2_npm);
        final Button btFr2Set = (Button) view.findViewById(R.id.bt_fr2_set);

        btFr2Set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.etNama.setText(etFr2Nama.getText().toString());
                mainActivity.etNPM.setText(etFr2NPM.getText().toString());
            }
        });

        Bundle bundle = getArguments();
        if (bundle != null){
            etFr2Nama.setText(getArguments().getString("bNama"));
            etFr2NPM.setText(getArguments().getString("bNPM"));
        }

        return view;
    }
}
