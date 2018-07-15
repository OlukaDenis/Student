package com.mcdenny.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class Staff extends AppCompatActivity {

    public ListView studentList;
    ArrayList<Student> students;
    private  static StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);


        students = new ArrayList<>();
        students.add(new Student("Mubanzi Emmanuel", "CEO & Business Counsultant", R.drawable.student_icon));
        students.add(new Student("Musinguzi Rodgers", "Networking Manager", R.drawable.student_icon));
        students.add(new Student("Bunje Fosca", "Accounts and Finances", R.drawable.student_icon));
        students.add(new Student("Edward", "Web Designing Facilitator", R.drawable.student_icon));
        students.add(new Student("Kibirango Gerald", "Android Programming Facilitator", R.drawable.student_icon));



        studentAdapter = new StudentAdapter(getApplicationContext(),R.layout.student_custom_activity, students);

        studentList = (ListView) findViewById(R.id.list);
        studentList.setAdapter(studentAdapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
