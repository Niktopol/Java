package task10;

public class Student implements Comparable<Student> {
    private int iDNumber = 0;
    private int points = 0;
    private String name = "";
    private String surname = "";
    private String speciality = "";
    private int course = 0;
    private String group = "";
    public Student(int iDNumber, int points, String name, String surname, String speciality, int course, String group){
        this.iDNumber = iDNumber;
        this.points = points;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
    }
    public Student(){};

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public int compareTo(Student stud) {
        return iDNumber-stud.iDNumber;
    }
    @Override
    public String toString(){
        return "ID: "+iDNumber+" Points: "+points + " " +name + " "+surname + " "+ speciality + " "+ course + " "+ group;
    }
}
