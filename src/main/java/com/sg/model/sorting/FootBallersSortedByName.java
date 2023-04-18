package com.sg.model.sorting;

import com.sg.model.league.FootballLeague;
import com.sg.model.league.FootballLeagueDataBase;
import com.sg.model.league.LeagueNameEnum;
import com.sg.model.players.Player;
import com.sg.model.players.PlayerDataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FootBallersSortedByName {
    static FootballLeagueDataBase footballLeagueDataBase = new FootballLeagueDataBase();
    static PlayerDataBase playerDataBase = new PlayerDataBase();

    public static void main(String[] args) {
        List<FootballLeague> footballLeagues = footballLeagueDataBase.getFootballLeagues();
        List<Player> players = PlayerDataBase.getPlayerDataBse();
        List<Player> youngPlayers = new ArrayList<Player>();
        String premierLeagueName = null;
        for (FootballLeague footballLeague : footballLeagues) {
            if (footballLeague.leagueName().equalsIgnoreCase(LeagueNameEnum.ENGLISH_PREMIER_LEAGUE.toString())) {

                System.out.println("test : " + LeagueNameEnum.ENGLISH_PREMIER_LEAGUE.toString());
                premierLeagueName = LeagueNameEnum.ENGLISH_PREMIER_LEAGUE.toString();
            }
        }
        if (premierLeagueName != null) {
            for(Player player:players){
                if(player.getAge()>20){
                    youngPlayers.add(player);
                }
            }
            System.out.println("Before sorting : "+youngPlayers);

            Collections.sort(youngPlayers, new Comparator<Player>() {
                public int compare(Player o1, Player o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            System.out.println("After sorting : "+youngPlayers);

        }
    }





}
