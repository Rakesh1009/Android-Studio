package com.example.studyplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateEvent extends AppCompatActivity {
    Button submit;
    EditText title, date, time, description, eventname;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        eventname = findViewById(R.id.eventname);

        submit =  findViewById(R.id.button);

        DB = new DBHelper(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titleTXT = title.getText().toString();
                String descriptionTXT = description.getText().toString();
                String dateTXT = date.getText().toString();
                String timeTXT = time.getText().toString();
                String eventnameTXT = eventname.getText().toString();

                Boolean checkinsertevent = DB.insertevent(titleTXT,descriptionTXT,dateTXT,timeTXT,eventnameTXT);
                if(checkinsertevent==true){
                    Toast.makeText(CreateEvent.this, "Event saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}