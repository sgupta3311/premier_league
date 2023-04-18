package com.sg.model.league;

public enum LeagueNameEnum {
    ENGLISH_PREMIER_LEAGUE("englishPremierLeague"),
    INDIA_PREMIER_LEAGUE("IndiaPremierLeague");
    private String premierLeague;
    LeagueNameEnum(String premierLeague) {
        this.premierLeague=premierLeague;
    }
}
