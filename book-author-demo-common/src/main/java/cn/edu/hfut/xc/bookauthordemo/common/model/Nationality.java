package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.util.List;

public class Nationality {
    private String id;

    private String nationalityName;

    private String nationalityLife;

    private String nationalityCreatedTime;

    private String nationalityLocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName == null ? null : nationalityName.trim();
    }

    public String getNationalityLife() {
        return nationalityLife;
    }

    public void setNationalityLife(String nationalityLife) {
        this.nationalityLife = nationalityLife == null ? null : nationalityLife.trim();
    }

    public String getNationalityCreatedTime() {
        return nationalityCreatedTime;
    }

    public void setNationalityCreatedTime(String nationalityCreatedTime) {
        this.nationalityCreatedTime = nationalityCreatedTime == null ? null : nationalityCreatedTime.trim();
    }

    public String getNationalityLocation() {
        return nationalityLocation;
    }

    public void setNationalityLocation(String nationalityLocation) {
        this.nationalityLocation = nationalityLocation == null ? null : nationalityLocation.trim();
    }

    @Override
    public String toString() {
        return "Nationality{" +
                "id='" + id + '\'' +
                ", nationalityName='" + nationalityName + '\'' +
                ", nationalityLife='" + nationalityLife + '\'' +
                ", nationalityCreatedTime='" + nationalityCreatedTime + '\'' +
                ", nationalityLocation='" + nationalityLocation + '\'' +
                '}';
    }
}