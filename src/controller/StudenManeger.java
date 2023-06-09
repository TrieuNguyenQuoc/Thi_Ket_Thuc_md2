package controller;

import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudenManeger {
    Scanner scanner = new Scanner(System.in);
    List<Student> students;

    public StudenManeger() {
//        students = ReadWriteFile.readDataFileClient();
    }

    public StudenManeger(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addNewStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student+" ");
        }
    }

    public String deleteByStudent(String id) {
        for (Student st : students) {
            if (id.equals(st.getId())) {
                students.remove(st);
                return "successful delete by " + st.getName();
            }
        }
        return "id bạn nhập không có trong danh sách";
    }

    public void editStudent(Student student, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                students.set(i, student);
                break;
            }
        }
    }
}
