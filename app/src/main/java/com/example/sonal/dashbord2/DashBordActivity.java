package com.example.sonal.dashbord2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import android.view.View;

public class DashBordActivity extends AppCompatActivity implements View.OnClickListener {





    private CardView teachercard,syllabuscard,attendencecard,notescard,noticecard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_bord);
        teachercard = findViewById(R.id.teacher_card);
        syllabuscard = findViewById(R.id.syllabus_card);
        attendencecard = findViewById(R.id.attendence_card);
        notescard = findViewById(R.id.notes_card);
        noticecard = findViewById(R.id.notice_card);













        //Add click listener to the cards
        teachercard.setOnClickListener(this);
        syllabuscard.setOnClickListener(this);
        attendencecard.setOnClickListener(this);
        notescard.setOnClickListener(this);
        noticecard.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        Intent i;
        //every time we check which card was clicked

        switch (view.getId()) {
            case R.id.teacher_card : i = new Intent(this,Teacher.class);
                startActivity(i);
                break;
            case R.id.syllabus_card : i = new Intent(this,Syllabus.class);
                startActivity(i);
                break;
            case R.id.attendence_card : i = new Intent(this,Attendence.class);
                startActivity(i);
                break;
            case R.id.notes_card : i = new Intent(this,Notes.class);
                startActivity(i);
                break;
            case R.id.notice_card : i = new Intent(this,Notice.class);
                startActivity(i);
                break;
            default:break;
        }

    }
}

