package com.sg.model.league;

public class FootballLeague implements league{
    private String name;
    public String leagueName() {
        return name;
    }
    public FootballLeague(String name) {
        this.name = name;
    }
}
