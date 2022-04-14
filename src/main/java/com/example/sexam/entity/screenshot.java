package com.example.sexam.entity;

import javax.persistence.*;

@Entity
@Table(name = "screenshot")
public class screenshot {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "studentUsername")
    private String studentUsername;

    @Column(name = "eid")
    private String eid;

    @Column(name = "imagePath")
    private String imagePath;

    public screenshot() {
    }

    public screenshot(String id, String studentUsername, String eid, String imagePath) {
        this.id = id;
        this.studentUsername = studentUsername;
        this.eid = eid;
        this.imagePath = imagePath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
