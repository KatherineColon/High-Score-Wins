package com.pluralsight;
import java.util.Scanner;
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // string input = home:visitor|21:9

    System.out.print("Please enter the game score in the following format 'Home:Visitor|Home score:Visitor score': ");
    String input = scanner.nextLine();

    String[] parts = input.split("\\|");
    String[] teams = parts[0].split(":");
    String[] score = parts[1].split(":");

    String homeTeam = teams[0];
    String visitorTeam = teams[1];
    int homeScore = Integer.parseInt(score[0]);
    int visitorScore = Integer.parseInt (score[1]);

    String winner;
        if(homeScore > visitorScore) {
             winner = homeTeam;
    }  else {
            winner = visitorTeam;
        }


    System.out.println("The winner is: " + winner + "!");



    }
}
