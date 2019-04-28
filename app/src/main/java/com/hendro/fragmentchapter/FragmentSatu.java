package com.hendro.fragmentchapter;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    public FragmentSatu() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_satu, container, false);
        final EditText etFr1Nama = (EditText) view.findViewById(R.id.et_fr1_nama);
        final EditText etFr1NPM = (EditText) view.findViewById(R.id.et_fr1_npm);
        final Button btSet = (Button) view.findViewById(R.id.bt_fr1_set);

        btSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("bNama", etFr1Nama.getText().toString());
                bundle.putString("bNPM", etFr1NPM.getText().toString());

                FragmentDua fragmentDua = new FragmentDua();
                fragmentDua.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentDua).commit();
            }
        });

        Bundle bundle = getArguments();
        if (bundle != null){
            etFr1Nama.setText(getArguments().getString("bNama"));
            etFr1NPM.setText(getArguments().getString("bNPM"));
        }

        return view;
    }
}
