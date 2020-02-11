package org.liuyu.entity;

public class People {
    private Integer stuno;

    private String stuname;

    private String stuage;

    private String graname;

    private Integer stusex;

    private String homeaddress;

    private String schooladdress;

    private Integer cardid;

    private Integer classid;

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStuage() {
        return stuage;
    }

    public void setStuage(String stuage) {
        this.stuage = stuage == null ? null : stuage.trim();
    }

    public String getGraname() {
        return graname;
    }

    public void setGraname(String graname) {
        this.graname = graname == null ? null : graname.trim();
    }

    public Integer getStusex() {
        return stusex;
    }

    public void setStusex(Integer stusex) {
        this.stusex = stusex;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getSchooladdress() {
        return schooladdress;
    }

    public void setSchooladdress(String schooladdress) {
        this.schooladdress = schooladdress == null ? null : schooladdress.trim();
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "People{" +
                "stuno=" + stuno +
                ", stuname='" + stuname + '\'' +
                ", stuage='" + stuage + '\'' +
                ", graname='" + graname + '\'' +
                ", stusex=" + stusex +
                ", homeaddress='" + homeaddress + '\'' +
                ", schooladdress='" + schooladdress + '\'' +
                ", cardid=" + cardid +
                ", classid=" + classid +
                '}';
    }
}