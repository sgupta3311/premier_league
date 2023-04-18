package com.sg.model.league;

import java.util.ArrayList;
import java.util.List;

public class FootballLeagueDataBase {
    FootballLeague f1 = new FootballLeague("ENGLISH_PREMIER_LEAGUE");
    FootballLeague f2 = new FootballLeague("INDIA_PREMIER_LEAGUE");
    List<FootballLeague> footballLeagueList = new ArrayList<FootballLeague>();

    public List< FootballLeague> getFootballLeagues() {
        footballLeagueList.add(f1);
        footballLeagueList.add(f2);
        return footballLeagueList;
    }
}
