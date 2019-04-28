package com.hendro.fragmentchapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*
    Fragment : seperti div di html
    fragment harus berkomunikasi melaui activity
     */

    Button btTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = (EditText) findViewById(R.id.editText1);

        btTambah = (Button) findViewById(R.id.btTambah);
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(MainActivity.this, et.getText().toString(), Toast.LENGTH_SHORT);
//                toast.show();

                FragmentSatu frSatu = (FragmentSatu) getSupportFragmentManager().findFragmentById(R.id.fragmentSatu); //mtentuka fragment
                frSatu.setText(et.getText().toString());
            }
        });
    }


}
