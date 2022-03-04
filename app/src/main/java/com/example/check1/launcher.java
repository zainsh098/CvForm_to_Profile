package com.example.check1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class launcher extends AppCompatActivity {
    EditText namez,conatctno,emailinfo,desc,fdeg,skill;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        namez=(EditText) findViewById(R.id.namesh);
        bt1=(Button) findViewById(R.id.button2);
        conatctno=(EditText) findViewById(R.id.editTextNumber) ;
        emailinfo=(EditText) findViewById(R.id.editTextTextEmailAddress);
        desc=(EditText) findViewById(R.id.editTextTextPersonName2);
        fdeg=(EditText) findViewById(R.id.editTextTextPersonName4);
        skill=(EditText) findViewById(R.id.editTextTextPersonName5);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sendData1=namez.getText().toString();
                String sendData2=conatctno.getText().toString();
                String sendData3=emailinfo.getText().toString();
                String sendData4=desc.getText().toString();

                String sendData5=fdeg.getText().toString();
                String sendData6=skill.getText().toString();

                Intent intent =new Intent(launcher.this,MainActivity.class);
                intent.putExtra("Aadi",sendData1);
                intent.putExtra("Aadi1",sendData2);
                intent.putExtra("Aadi2",sendData3);
                intent.putExtra("Aadi3",sendData4);
                intent.putExtra("Aadi4",sendData5);
                intent.putExtra("Aadi5",sendData6);


                startActivity(intent);



            }
        });





    }
}