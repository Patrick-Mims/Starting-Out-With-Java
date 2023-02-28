package edu.sfsu;
import java.net.IDN;
public class Employee {
    private int idNumber;
    private String department;
    private String name;
    private String position;

    private static int referenceCounter = 0;
    public Employee(int idNumber, String department, String name, String position) {
        this.idNumber = idNumber;
        this.department = department;
        this.name = name;
        this.position = position;
        referenceCounter++;
    }
    public Employee(int idNumber, String department, String position) {
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public Employee() {
        this.idNumber = 0;
        this.department = "";
        this.name = "";
        this.position = "";
    }

    int getReferenceCounter() {
       return referenceCounter;
    }
    void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    int getIdNumber() {
        return idNumber;
    }
    void setDepartment(String department) {
        this.department = department;
    }
    String getDepartment() {
        return department;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setPosition(String position) {
        this.position = position;
    }
    String getPosition() {
        return position;
    }
}