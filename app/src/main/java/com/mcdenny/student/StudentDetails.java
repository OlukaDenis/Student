package com.mcdenny.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentDetails extends AppCompatActivity {
    ImageView image1;
    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        image1 = (ImageView) findViewById(R.id.image_details);
        textView1 = (TextView) findViewById(R.id.name_details);
        textView2 = (TextView) findViewById(R.id.description_details);

        Bundle bundle = getIntent().getExtras();
        String name_detail = bundle.getString("name_key");
        String desc_detail = bundle.getString("description_key");
        int img_detail = bundle.getInt("image_key");

        image1.setImageResource(img_detail);
        textView1.setText("Name: "+name_detail);
        textView2.setText("Description: "+desc_detail);
        setTitle(name_detail);
    }
}
