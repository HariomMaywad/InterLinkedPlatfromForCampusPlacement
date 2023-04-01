/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class StudentDetails {
    private String id;
    private String institute_id;
    private String gender;
    private String fname;
    private String lname;
    private String mname;
    private String father_name;
    private String mother_name;
    private String address;
    private String email;
    private long phone;
    private double xthPercent;
    private double xiiPercent;
    private Date admissionDate;
    private String branch;
    private double deg_percent;
    private String course;
    private String pwd;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitute_id() {
        return institute_id;
    }

    public void setInstitute_id(String institute_id) {
        this.institute_id = institute_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getXthPercent() {
        return xthPercent;
    }

    public void setXthPercent(double xthPercent) {
        this.xthPercent = xthPercent;
    }

    public double getXiiPercent() {
        return xiiPercent;
    }

    public void setXiiPercent(double xiiPercent) {
        this.xiiPercent = xiiPercent;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getDeg_percent() {
        return deg_percent;
    }

    public void setDeg_percent(double deg_percent) {
        this.deg_percent = deg_percent;
    }
    

            
}
