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

public class CourseAdapter extends ArrayAdapter<Student> {
    public ArrayList<Student> studentArraySet;
    Context context;
    int layoutResourceID;

    private static class StudentHolder {

        TextView cname;
        TextView cperiod;
        TextView camount;

    }


    public CourseAdapter(Context context, int layoutResourceID, ArrayList<Student> data ) {
        super(context, layoutResourceID, data);
        this.context = context;
        this.layoutResourceID = layoutResourceID;
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
            row = inflater.inflate(layoutResourceID, parent, Boolean.parseBoolean(null));
            holder = new StudentHolder();

            holder.camount = (TextView) row.findViewById(R.id.amount);
            holder.cname = (TextView) row.findViewById(R.id.course_name);
            holder.cperiod = (TextView) row.findViewById(R.id.course_duration);

            row.setTag(holder);
        } else {
            holder = (StudentHolder) row.getTag();
        }


        holder.camount.setText(student.getAmount());
        holder.cname.setText(student.getCourse());
        holder.cperiod.setText(student.getPeriod());

        return row;


    }


}
