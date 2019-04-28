package com.hendro.fragmentchapter;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etNPM;
    Button btSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.et_nama);
        etNPM = (EditText) findViewById(R.id.et_npm);
        btSet = (Button) findViewById(R.id.bt_set);

        //set fragment satu agar muncul pertama kali
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new FragmentSatu()).commit();

        btSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("bNama", etNama.getText().toString());
                bundle.putString("bNPM", etNPM.getText().toString());

                FragmentSatu fragmentSatu = new FragmentSatu();
                fragmentSatu.setArguments(bundle);

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentSatu).commit();
            }
        });
    }

    public void putValues(Bundle bundle)
    {
        etNama.setText(bundle.getString("vNama"));
        etNPM.setText(bundle.getString("vNPM"));
    }
}
