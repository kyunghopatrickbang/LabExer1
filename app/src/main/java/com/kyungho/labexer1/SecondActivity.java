package com.kyungho.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t_RA, t_FG;
    Button btn_Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t_RA = (TextView) findViewById(R.id.tRA);
        t_FG = (TextView) findViewById(R.id.tFG);
        btn_Return = (Button) findViewById(R.id.btnSend);

        String s = getIntent().getStringExtra("tRAF");
        String t = getIntent().getStringExtra("tFGF");

        t_RA.setText(s);
        t_FG.setText(t);

    }

    public void goBackToMain(View view){

    }
}