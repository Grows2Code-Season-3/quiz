package org.launchcode.quiz.assignment;

import java.util.Date;

/**
 * Created by Chris Bay
 */
public class CodingProject implements Gradeable {

    private Date dueDate;
    private String description;
    private int pointTotal = 1;
    private String repositoryUrl;
    private int userScore;
    private String gradingComments;


    public CodingProject(Date dueDate, String description) {
        this.dueDate = dueDate;
        this.description = description;
    }

    public CodingProject(Date dueDate, String description, int pointTotal) {
        this.dueDate = dueDate;
        this.description = description;
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
        return (double) this.getUserScore() / (double) this.getPointTotal();
    }

    @Override
    public String getDisplayScorePercentage() {
        double pct = this.getScorePercentage();
        long pctScore = Math.round(pct * 100);
        return pctScore + "%";
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

    public void setPointTotal(int pointTotal) {
        this.pointTotal = pointTotal;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public String getGradingComments() {
        return gradingComments;
    }

    public void setGradingComments(String gradingComments) {
        this.gradingComments = gradingComments;
    }
}
