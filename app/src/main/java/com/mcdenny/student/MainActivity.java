package com.mcdenny.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView studentList;
    ArrayList<Student> students;
    private  static StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);


        students = new ArrayList<>();
                students.add(new Student("Oluka Denis", "Computer Science, Ndejje University", R.drawable.student_icon));
                students.add(new Student("Anne", "Computer Science, MUST", R.drawable.student_icon));
                students.add(new Student("Olinga Daniel", "Information Technology, Ndejje University", R.drawable.student_icon));
                students.add(new Student("Namwanje Josephine", "Computer Science, MUST", R.drawable.student_icon));
                 students.add(new Student("Nazziwa Martha", "Computer Science, Ndejje University", R.drawable.student_icon));
                 students.add(new Student("Rossera", "Computer Science, Kampala University", R.drawable.student_icon));
                 students.add(new Student("Natweta Edmond", "Computer Science, Ndejje University", R.drawable.student_icon));
                  students.add(new Student("Opolot Emmanuel", "Information Technology, Metropolitan University", R.drawable.student_icon));
                   students.add(new Student("Kabatesi Priscila", "Computer Science, Ndejje University", R.drawable.student_icon));
                   students.add(new Student("Nelson Okuta", "Computer Science, Muni University", R.drawable.student_icon));
                    students.add(new Student("Namukasa Shamim", "Computer Science, IUIU", R.drawable.student_icon));
                   students.add(new Student("Odeke Samuel", "Computer Engineering, Makerere University", R.drawable.student_icon));
                  students.add(new Student("Nakimbugwe Margaret", "Computer Science, Muni University", R.drawable.student_icon));


        studentAdapter = new StudentAdapter(students, getApplicationContext());

        studentList = (ListView) findViewById(R.id.list);
        studentList.setAdapter(studentAdapter);

    }
}
