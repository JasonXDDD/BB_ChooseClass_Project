package Public_Data;

import java.util.ArrayList;

/**
 * Created by JASON_ on 2015/6/25.
 */


public class User_Data {
    private int stuID;
    private int password;
    private int serial;
    private String name;
    private ArrayList<Integer> classlist = new ArrayList<Integer>();
    private Integer classnode;

    public User_Data(){
        stuID = 0;
        password = 0;
        serial = 0;
        name = new String("");
        classnode = new Integer(0);
    }

    public ArrayList<Integer> getClasslist() {
        return classlist;
    }

    public void setClasslist(ArrayList<Integer> classlist) {
        this.classlist = classlist;
    }

    public Integer getClassnode() {
        return classnode;
    }

    public void setClassnode(Integer classnode) {
        this.classnode = classnode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
}
