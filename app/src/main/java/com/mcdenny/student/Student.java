package com.mcdenny.student;

public class Student {
    public int icon;
    public String name;
    public String desc;
    public String course;
    public String period;
    public String amount;


    public Student(String name, String desc, int icon) {
        this.name = name;
        this.desc = desc;
        this.icon = icon;

    }

    public Student(String course, String period, String amount){
        this.course = course;
        this.period  = period;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getIcon() {
        return icon;
    }

    public String getAmount() {
        return amount;
    }

    public String getCourse() {
        return course;
    }

    public String getPeriod() {
        return period;
    }
}
