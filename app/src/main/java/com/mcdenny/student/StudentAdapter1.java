/*package com.mcdenny.student;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter1 extends BaseAdapter {
    Activity activity;
   ArrayList arrayStudentList = new ArrayList<Student>();
   LayoutInflater layoutInflater =null;

    public StudentAdapter1(Activity activity, ArrayList arrayList){
        this.activity = activity;
        this.arrayStudentList = arrayList;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayStudentList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayStudentList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private static class StudentHolder{

        ImageView sImg;
        TextView sName;
        TextView sDesc;
    }
    StudentHolder holder = null;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        final int pos = position;


        if(row == null){
            row = layoutInflater.inflate(R.layout.student_custom_activity, null);

            holder = new StudentHolder();
            holder.sImg = (ImageView) row.findViewById(R.id.studentImage);
            holder.sName = (TextView) row.findViewById(R.id.studentName);
            holder.sDesc = (TextView) row.findViewById(R.id.studentDescription);

            row.setTag(holder);
        }
        else{
            holder = (StudentHolder)row.getTag();
        }


        holder.sName.setText(arrayStudentList.get(pos).getName());


        return row;


    }


}*/
