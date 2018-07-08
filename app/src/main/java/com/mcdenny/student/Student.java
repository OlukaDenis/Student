package com.mcdenny.student;

public class Student {
    public int icon;
    public String name;
    public String desc;


    public Student(String name, String desc, int icon) {
        this.name = name;
        this.desc = desc;
        this.icon = icon;

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

}
