package com.techelevator.model;

public class Vote {
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String optionE;
    String optionF;
    String optionG;
    String optionH;

    public Vote(String optionA, String optionB, String optionC, String optionD, String optionE, String optionF, String optionG, String optionH, int userId, int issueId) {
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionE = optionE;
        this.optionF = optionF;
        this.optionG = optionG;
        this.optionH = optionH;
        this.userId = userId;
        this.issueId = issueId;
    }

    public Vote(String optionA, String optionB, String optionC, int userId, int issueId) {
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.userId = userId;
        this.issueId = issueId;
    }



    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionE() {
        return optionE;
    }

    public void setOptionE(String optionE) {
        this.optionE = optionE;
    }

    public String getOptionF() {
        return optionF;
    }

    public void setOptionF(String optionF) {
        this.optionF = optionF;
    }

    public String getOptionG() {
        return optionG;
    }

    public void setOptionG(String optionG) {
        this.optionG = optionG;
    }

    public String getOptionH() {
        return optionH;
    }

    public void setOptionH(String optionH) {
        this.optionH = optionH;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    int point;
    int userId;
    int issueId;

}
