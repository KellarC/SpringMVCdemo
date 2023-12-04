package edu.rhodes.comp485.springmvcdemo.model.entities;

public class Student {
    private long id;
    private String rhodesId;
    private String preferredName;
    private String email;

    public Student() {

    }
    public Student(long id, String rhodesId, String preferredName, String email) {
        this.id = id;
        this.rhodesId = rhodesId;
        this.preferredName = preferredName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRhodesId() {
        return rhodesId;
    }

    public void setRhodesId(String rhodesId) {
        this.rhodesId = rhodesId;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rhodesId='" + rhodesId + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
