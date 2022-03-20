package com.hanna.Java_loppuharjoitus;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<MyDataClass> students = new ArrayList<>();

    public void addMyDataClass(MyDataClass student) {
        students.add(student);
    }

    public List<MyDataClass> getStudents() {
        return new ArrayList<>(students);
    }

    public List<MyDataClass> getStudentsByParam(String param) {
        List<MyDataClass> foundStudents = new ArrayList<>();

        for (MyDataClass m : students) {
            if (m.getCourse().equals(param)) {
                foundStudents.add(m);
            }
            if (m.getStudent().equals(param)) {
                foundStudents.add(m);
            }
        }
        return foundStudents;
    }
        public List<MyDataClass> getStudentsByPar(String par){
            List<MyDataClass> removeStudents = new ArrayList<MyDataClass>();

            for (MyDataClass m : students) {
                if (m.getCourse().equals(par)) {
                    removeStudents.remove(m);
                }
                if (m.getStudent().equals(par)) {
                    removeStudents.remove(m);
                }
            }
            return  removeStudents;
    }

    }

