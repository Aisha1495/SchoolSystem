package aisha; //TODO: Please add meaningful name of a package


import java.util.ArrayList;

public class Courses {


    private String courName;
    private Integer courId; //TODO: Use Integer instead of int


    ArrayList<Marks> markList = new ArrayList<Marks>(); //TODO: Format your code
    //ArrayList<Marks> markList;
    /*
    Why do you have MarksList and Mark object. You are supposed to use only one of them
    */
    public ArrayList<Marks> getMarkList() {
        return markList;
    }

    public void setMarkList(ArrayList<Marks> markList) { //TODO: Format your code
        this.markList = markList;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }


    public int getCourId() {
        return courId;
    }


    public void setCourId(int courId) {
        this.courId = courId;
    }
}