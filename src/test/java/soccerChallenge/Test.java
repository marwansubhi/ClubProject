package soccerChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            Random rnd = new Random();
            List<String> players = new LinkedList<>(Arrays.asList("Ayse","Galyna", "Inci", "Esma", "Jeren","Vadym","Marwan"));
            System.out.println( players.get(rnd.nextInt(7)));
            Thread.sleep(1000);
        }

    }
}
/*
*
* * This is a hacker rank challenge give in the interview
 * Given this endpoint for getting football match data
 * http://jsonmock.hackerrank.com/api/football_matches
 * below query params are available
 * year  :  year the match occurred
 * team1 :  home team name
 * team2 :  visiting team name
 * page  :  page number , max result in per response is 10
 *           any result more than 10 will be on next pages
 *           so in order to get all data you need to
 *           make separate requests until there are no more pages
 *
 * Response Format :
 *  {
 *     "page": "1",
 *     "per_page": 10,
 *     "total": 23,
 *     "total_pages": 3,
 *     "data": [
 *         {
 *             "competition": "UEFA Champions League",
 *             "year": 2012,
 *             "round": "GroupB",
 *             "team1": "Arsenal",
 *             "team2": "Olympiacos",
 *             "team1goals": "3",
 *             "team2goals": "1"
 *         },
 *         {...},
 *         {...}
 *         ]
 *  }
 *
 * Examples Requests :
 *
 * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team1=Arsenal&team2=Chelsea&page=1
 *  return data for match between Arsenal(home team) and Chelsea(visiting team) , show page 1
 * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team1=Arsenal&page=1
 *  return data for 2012 match between Arsenal(home team) and any visiting team and show page 2
 * GET http://jsonmock.hackerrank.com/api/football_matches?year=2012&team2=Arsenal&page=2
 *  return data for match between any home team) and Chelsea(visiting team) and show page 2
 *
 *  Write a method to return total goals of a team in a given year
 *      * Include the both result where the team is home team or visiting team
 */
