package com.example.check1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        String name,contact,descr,finald,skill,email;
        TextView tv1,desc,like,share;
        String num;
        Button follow ,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.tvza);
        desc=(TextView) findViewById(R.id.textView);
        like=(TextView) findViewById(R.id.textView3);
        share=(TextView) findViewById(R.id.textView5);
        follow=(Button) findViewById(R.id.button);
        message=(Button) findViewById(R.id.button3);
        Intent intent=getIntent();

       name=intent.getStringExtra("Aadi1");
        contact=intent.getStringExtra("Aadi");
        email=intent.getStringExtra("Aadi2");
        descr=intent.getStringExtra("Aadi3");
        finald=intent.getStringExtra("Aadi4");
        skill=intent.getStringExtra("Aadi5");



        tv1.setText(name);
        desc.setText(descr);
        like.setText(finald);
        share.setText(skill);



        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_SENDTO,Uri.parse("mailto:"+Uri.encode(email)));


                startActivity(callIntent);



            }
        });
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ Uri.encode(contact)));
                startActivity(callIntent);


            }
        });






    }
}