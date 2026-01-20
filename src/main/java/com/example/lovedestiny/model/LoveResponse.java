package com.example.lovedestiny.model;

public class LoveResponse {
    private String couple;
    private int loveScore;
    private String destinyLine;

    public LoveResponse(String couple, int loveScore, String destinyLine) {
        this.couple = couple;
        this.loveScore = loveScore;
        this.destinyLine = destinyLine;
    }

    public String getCouple() {
        return couple;
    }

    public int getLoveScore() {
        return loveScore;
    }

    public String getDestinyLine() {
        return destinyLine;
    }
}
