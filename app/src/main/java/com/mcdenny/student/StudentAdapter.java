package com.mcdenny.student;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {
    public ArrayList<Student> studentArraySet;
    Context context;
    int layoutResourceID;

    private static class StudentHolder {

        ImageView sImg;
        TextView sName;
        TextView sDesc;
    }


    public StudentAdapter(Context context, int layoutResourceID, ArrayList<Student> data ) {
        super(context, layoutResourceID, data);
        this.context = context;
        this.layoutResourceID = layoutResourceID;
        this.studentArraySet = data;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        final Student student = getItem(position);
        View row = convertView;
        StudentHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            // LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layoutResourceID, parent, Boolean.parseBoolean(null));
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

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), student.getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, StudentDetails.class);

                Bundle bundle = new Bundle();
                bundle.putString("name_key", student.getName());
                bundle.putString("description_key", student.getDesc());
                bundle.putInt("image_key", student.getIcon());
                intent.putExtras(bundle);

                context.startActivity(intent);

            }
        });

        return row;


    }


}
