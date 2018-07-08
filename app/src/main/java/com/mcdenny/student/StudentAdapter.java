package com.mcdenny.student;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {
    public ArrayList<Student> studentArraySet;
    Context context;

    private static class StudentHolder {

        ImageView sImg;
        TextView sName;
        TextView sDesc;

    }

    public StudentAdapter(ArrayList<Student> data, Context context) {
        super(context, R.layout.student_custom_activity, data);
        this.context = context;
        this.studentArraySet = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Student student = getItem(position);
        View row = convertView;
        StudentHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            // LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.student_custom_activity, parent, Boolean.parseBoolean(null));
            holder = new StudentHolder();
            holder.sImg = (ImageView) row.findViewById(R.id.studentImage);
            holder.sName = (TextView) row.findViewById(R.id.studentName);
            holder.sDesc = (TextView) row.findViewById(R.id.studentDescription);

            row.setTag(holder);
        } else {
            holder = (StudentHolder) row.getTag();
        }

        //assert student != null;
        holder.sName.setText(student.getName());
        holder.sDesc.setText(student.getDesc());
        holder.sImg.setImageResource(student.getIcon());

        return row;


    }


}
