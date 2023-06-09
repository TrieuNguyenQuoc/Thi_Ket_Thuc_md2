package model;

public class Student {
    private static int cout = 1;
    private int id;
    private String name;
    private int age;
    private String sex ;
    private String address;
    private int point;

    public static int getCout ( ) {
        return cout;
    }

    public static void setCout (int cout) {
        Student.cout = cout;
    }

    public int getId ( ) {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getSex ( ) {
        return sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public int getPoint ( ) {
        return point;
    }

    public void setPoint (int point) {
        this.point = point;
    }

    public Student (int id, String name, int age, String sex, String address, int point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.point = point;
    }
    @Override
    public String toString() {
        return "Student " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '\n';
    }
}
