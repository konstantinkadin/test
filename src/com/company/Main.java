package com.company;

public class Main {

    public static void main(String[] args) {

        LeagueATeam barcelona = new LeagueATeam("Barcelona");
        LeagueBTeam arsenal = new LeagueBTeam("Arsenal");
        LeagueCTeam cska = new LeagueCTeam("CSKA");
        LeagueCTeam zenit = new LeagueCTeam("Zenit");
        LeagueCTeam spartak = new LeagueCTeam("Moscow Spartak");
        LeagueCTeam krasnodar = new LeagueCTeam("Krasnodar");
        LeagueCTeam dinamo = new LeagueCTeam("FC Dinamo Moscow");

        League<LeagueATeam> laLiga = new League<>("laLiga");
        laLiga.addTeam(barcelona);

        League<LeagueBTeam> premierLeague = new League<>("Premier League");
        premierLeague.addTeam(arsenal);

        League<LeagueCTeam> russianPremierLeague = new League<>("Russian Premier League");
        russianPremierLeague.addTeam(cska);
        russianPremierLeague.addTeam(zenit);
        russianPremierLeague.addTeam(spartak);
        russianPremierLeague.addTeam(krasnodar);
        russianPremierLeague.addTeam(dinamo);

        russianPremierLeague.printLeagueTeams();

        premierLeague.printLeagueTeams();




    }
}
