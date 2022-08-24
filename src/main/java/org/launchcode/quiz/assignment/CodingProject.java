package org.launchcode.quiz.assignment;

import java.util.Date;

public class CodingProject implements Gradeable {

    private int pointTotal = 1;
    private int userScore;
    private String ghClassroomUrl;
    private String repositoryUrl;
    private Date dueDate;
    private String description;

    public CodingProject(String ghClassroomUrl, Date dueDate, String description) {
        this.ghClassroomUrl = ghClassroomUrl;
        this.dueDate = dueDate;
        this.description = description;
    }

    public CodingProject(String ghClassroomUrl, Date dueDate, String description, int pointTotal) {
        this(ghClassroomUrl, dueDate, description);
        this.pointTotal = pointTotal;
    }

    @Override
    public int getPointTotal() {
        return this.pointTotal;
    }

    @Override
    public int getUserScore() {
        return this.userScore;
    }

    @Override
    public double getScorePercentage() {
        return (double) this.userScore / (double) this.pointTotal;
    }

    @Override
    public String getDisplayScorePercentage() {
        double pct = this.getScorePercentage();
        long pctScore = Math.round(pct * 100);
        return pctScore + "%";
    }

    public void setPointTotal(int pointTotal) {
        this.pointTotal = pointTotal;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public String getGhClassroomUrl() {
        return ghClassroomUrl;
    }

    public void setGhClassroomUrl(String ghClassroomUrl) {
        this.ghClassroomUrl = ghClassroomUrl;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
