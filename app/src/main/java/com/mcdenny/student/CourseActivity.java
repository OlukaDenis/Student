package com.mcdenny.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class CourseActivity extends AppCompatActivity {

    public ListView studentList;
    ArrayList<Student> students;
    private  static CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);


        students = new ArrayList<>();
        students.add(new Student("Internship", "2 months", "Shs 180,000"));
        students.add(new Student("Computer applications", "1 month", "Shs 100,000"));
        students.add(new Student("Repair and Maintenace", "3 weeks", "Shs 180,000"));
        students.add(new Student("Linux Administration", "1 year", "Shs 750,000"));
        students.add(new Student("Graphics Designing", "4 months", "Shs 650,000"));
        students.add(new Student("Diploma in information Technology", "2 years", "Shs 900,000"));
        students.add(new Student("Diploma in Cisco", "2 years", "Shs 1,000,000"));
        students.add(new Student("Diploma in Business Administration", "2 years", "Shs 500,000"));
        students.add(new Student("Diploma in Accounting", "2 years", "Shs 400,000"));



        courseAdapter = new CourseAdapter(getApplicationContext(),R.layout.course_activity, students);

        studentList = (ListView) findViewById(R.id.list);
        studentList.setAdapter(courseAdapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}

