package training.task.JPADemo.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Column(nullable = false)
    private String name;
    private  String Branch;
    private Double marks;
    @Column(nullable = false, unique = true,name = "contactnumber",updatable = false)
    private String contactNumber;

    public Student() {
    }

    public Student(String name, String branch, Double marks, String contactNumber) {
        this.name = name;
        Branch = branch;
        this.marks = marks;
        this.contactNumber = contactNumber;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
