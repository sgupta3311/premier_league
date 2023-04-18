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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FootBallersSortedByNameDeclarative {
    static FootballLeagueDataBase footballLeagueDataBase = new FootballLeagueDataBase();
    static PlayerDataBase playerDataBase = new PlayerDataBase();

    public static void main(String[] args) {
        List<FootballLeague> footballLeagues = footballLeagueDataBase.getFootballLeagues();
        List<Player> players = PlayerDataBase.getPlayerDataBse();

       Stream<String> leagueName= footballLeagues.stream()
                .filter(footballLeague->footballLeague.leagueName().equals(LeagueNameEnum.ENGLISH_PREMIER_LEAGUE.toString())).map(footballLeague -> footballLeague.leagueName());
        String league=leagueName.findFirst().get();
        if(league.equals(LeagueNameEnum.ENGLISH_PREMIER_LEAGUE.toString())){
            System.out.println("Before Sorting and filtering :"+players);
            players=players.stream().filter(player -> player.getAge()>20).sorted(Comparator.comparing(Player::getName)).collect(Collectors.toList());
            System.out.println(players);
            String name= players.stream().filter(player -> player.getAge()>20).map(player -> player.getName()).sorted().collect(Collectors.joining(",")).toString();
            System.out.println(name);
        }

    }





}
