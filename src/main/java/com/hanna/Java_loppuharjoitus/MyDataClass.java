package com.hanna.Java_loppuharjoitus;

public class MyDataClass {
    private String student;
    private String course;
    private int snumber;

    private static int count = 1;

    //parametrillinen alustin
    public MyDataClass(String student, String course){
        this.student = student;
        this.course = course;
        this.snumber = count++;
    }
    //oletusalustin
    public MyDataClass(){
        this("", "");
    }

    //getterit ja setterit
    public String getStudent() {
        return student;
    }

    public String getCourse() {
        return course;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSnumber() {
        return snumber;
    }
}
