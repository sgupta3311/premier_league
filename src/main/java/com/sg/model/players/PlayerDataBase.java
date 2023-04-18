package com.sg.model.players;

import java.util.ArrayList;
import java.util.List;

public class PlayerDataBase {
    static Player p1=new Player("Leon",25);
    static Player p2=new Player("Messi",35);
    static Player p3=new Player("Terry",18);
    static Player p4=new Player("Aran",32);
    static Player p5=new Player("Brian",22);

    static List<Player>  players=new ArrayList<Player>();
    public static List<Player> getPlayerDataBse(){
        PlayerDataBase playerDataBase=new PlayerDataBase();
        players.add(playerDataBase.p1);
        players.add(playerDataBase.p2);
        players.add(playerDataBase.p3);
        players.add(playerDataBase.p4);
        players.add(playerDataBase.p5);
        return players;
    }
}
