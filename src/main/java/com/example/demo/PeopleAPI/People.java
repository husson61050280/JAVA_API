package com.example.demo.PeopleAPI;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class People implements Serializable {

    @JsonProperty("No#")
    private float No;
    @JsonProperty("DepartmentTH")
    private String DepartmentTH;
    @JsonProperty("FacultyTH")
    private String FacultyTH;
    @JsonProperty("MinistryTH")
    private String MinistryTH;
    @JsonProperty("OrganizationTH")
    private String OrganizationTH;
    @JsonProperty("Sex")
    private String Sex;
    @JsonProperty("Age")
    private float Age;
    @JsonProperty("AgeRange")
    private String AgeRange;
    @JsonProperty("Publication")
    private String Publication;
    @JsonProperty("patent")
    private String patent;
    @JsonProperty("Poject5Y")
    private String Poject5Y;
    @JsonProperty("YoungResearcher")
    private String YoungResearcher;
    @JsonProperty("ProvinceTH")
    private String ProvinceTH;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("Expert")
    private String Expert;

    public float getNo() {
        return No;
    }

    public void setNo(float no) {
        No = no;
    }

    public String getDepartmentTH() {
        return DepartmentTH;
    }

    public void setDepartmentTH(String departmentTH) {
        DepartmentTH = departmentTH;
    }

    public String getFacultyTH() {
        return FacultyTH;
    }

    public void setFacultyTH(String facultyTH) {
        FacultyTH = facultyTH;
    }

    public String getMinistryTH() {
        return MinistryTH;
    }

    public void setMinistryTH(String ministryTH) {
        MinistryTH = ministryTH;
    }

    public String getOrganizationTH() {
        return OrganizationTH;
    }

    public void setOrganizationTH(String organizationTH) {
        OrganizationTH = organizationTH;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public float getAge() {
        return Age;
    }

    public void setAge(float age) {
        Age = age;
    }

    public String getAgeRange() {
        return AgeRange;
    }

    public void setAgeRange(String ageRange) {
        AgeRange = ageRange;
    }

    public String getPublication() {
        return Publication;
    }

    public void setPublication(String publication) {
        Publication = publication;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getPoject5Y() {
        return Poject5Y;
    }

    public void setPoject5Y(String poject5Y) {
        Poject5Y = poject5Y;
    }

    public String getYoungResearcher() {
        return YoungResearcher;
    }

    public void setYoungResearcher(String youngResearcher) {
        YoungResearcher = youngResearcher;
    }

    public String getProvinceTH() {
        return ProvinceTH;
    }

    public void setProvinceTH(String provinceTH) {
        ProvinceTH = provinceTH;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getExpert() {
        return Expert;
    }

    public void setExpert(String expert) {
        Expert = expert;
    }
}

