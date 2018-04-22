package com.example.android.mycv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button personal;
    public Button academic;
    public Button skills;
    public Button future;
    public Button part;
    public void init(){
        personal=(Button)findViewById(R.id.personal_details);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,personal_details.class);
                startActivity(open);
            }
        });
    }
    public void init2(){
        academic=(Button)findViewById(R.id.education_details);
        academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,academic_details.class);
                startActivity(open);
            }
        });
    }
    public void init3(){
        skills=(Button)findViewById(R.id.skill_set);
        skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,skill.class);
                startActivity(open);
            }
        });
    }
    public void init4(){
        future=(Button)findViewById(R.id.future_goals);
        future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,future.class);
                startActivity(open);
            }
        });
    }
    public void init5(){
        part=(Button)findViewById(R.id.achievements);
        part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,participation.class);
                startActivity(open);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init2();
        init3();
        init4();
        init5();
    }
}
