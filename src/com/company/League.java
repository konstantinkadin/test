package com.company;

import java.util.ArrayList;

public class League<T extends Team>  {

    private String name;

    private ArrayList<T> teamsList = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if (teamsList.contains(team)) {
            System.out.println(team.getName() + " team is already in the league!");
            return false;
        } else {
            teamsList.add(team);
            System.out.println(team.getName() + " team has been added to the League - " + this.name);
            return true;
        }
    }

    public boolean printLeagueTeams() {
        if (this.teamsList != null) {
            System.out.println("\nAll teams of - " + this.name);
            int count = 0;
            //for (int i=0; i<this.teamsList.size(); i++) {
            for (Team i:teamsList) {
                count++;
                System.out.println( count + ". " + i.getName());
            }
            return true;
        }
        return false;
    }
}
