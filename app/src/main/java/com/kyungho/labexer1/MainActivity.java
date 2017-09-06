package com.kyungho.labexer1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText t_Quiz1, t_Quiz2, t_SW, t_LE, t_ME;
    Button btn_Send;

    float tQ1, tQ2, tSW1, tLE1, tME1, tRA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t_Quiz1 = (EditText) findViewById(R.id.tQuiz1);
        t_Quiz2 = (EditText) findViewById(R.id.tQuiz2);
        t_SW = (EditText) findViewById(R.id.tSW);
        t_LE = (EditText) findViewById(R.id.tLE);
        t_ME = (EditText) findViewById(R.id.tME);
        btn_Send = (Button) findViewById(R.id.btnSend);

    }

    public void callSecondActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        tQ1 = Float.parseFloat(t_Quiz1.getText().toString());
        tQ1 *= .10;

        tQ2 = Float.parseFloat(t_Quiz2.getText().toString());
        tQ2 *= .10;

        tSW1 = Float.parseFloat(t_SW.getText().toString());
        tSW1 *= .10;

        tLE1 = Float.parseFloat(t_LE.getText().toString());
        tLE1 *= .40;

        tME1 = Float.parseFloat(t_ME.getText().toString());
        tME1 *= .30;

        tRA = tQ1 + tQ2 + tSW1 + tLE1 + tME1;

        intent.putExtra("tRAF", Float.toString(tRA));

        if(tRA < 60){
            intent.putExtra("tFGF", "Failed");
        }
        else if(tRA  >= 60 && tRA <= 65){
            intent.putExtra("tFGF", "3.00");
        }
        else if(tRA  > 65 && tRA <= 70){
            intent.putExtra("tFGF", "2.75");
        }
        else if(tRA  > 70 && tRA <= 75){
            intent.putExtra("tFGF", "2.50");
        }
        else if(tRA  > 75 && tRA <= 80){
            intent.putExtra("tFGF", "2.25");
        }
        else if(tRA  > 80 && tRA <= 85){
            intent.putExtra("tFGF", "2.00");
        }
        else if(tRA  > 85 && tRA <= 90){
            intent.putExtra("tFGF", "1.75");
        }
        else if(tRA  > 90 && tRA <= 92){
            intent.putExtra("tFGF", "1.50");
        }
        else if(tRA  > 92 && tRA <= 94){
            intent.putExtra("tFGF", "1.25");
        }
        else if(tRA > 94 && tRA <= 100) {
            intent.putExtra("tFGF", "1.00");
        }
        startActivity(intent);

    }


}
