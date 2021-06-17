package com.kainos.ea;

public class Project {
    private short projectID;
    private String projectName;

    public Project(short newProjectID, String newProjectName) {
        this.projectID = projectID;
        this.projectName = projectName;
    }

    public short getProjectID() {
        return projectID;
    }

    public void setProjectID(short projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
