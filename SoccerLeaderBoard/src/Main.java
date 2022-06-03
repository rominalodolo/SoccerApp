import java.util.Scanner;
import java.util.HashMap;

import com.spire.doc.*;
import com.spire.doc.documents.*;

import javax.xml.transform.Result;


public class Main {
    public static void main(String[] args) {
        Scanner Goals = new Scanner(System.in);
            // user inputs this data:
            //       Liverpool 3, ManchesterUnited 3
            //       Tarantulas2 1, FC Awesome 0
            //       Lions 1, FCAwesome 1
            //       Tarantulas2 3, ManchesterUnited 1
            //       Lions 4, Grouches 0

        // remove white spaces in the team name.
        for (String Team : Teams) {
            System.out.format("[%s]%n",
                    Team.replaceAll("^ +| +$|( )+", "$1")
            );
        }

        HashMap<String, Integer> map = new HashMap<>(team, score);



        Team winner = score.addResult();
        Team second = score.addResult();
        Team third = score.addResult();
        Team fourth = score.addResult();
        Team fifth = score.addResult();
        Team sixth = score.addResult();

        for(int i = 1; i < 6; i++){
            Result score = Team.getScore().get(i);
            score.getListFormat().applyNumberedStyle();
            score.getListFormat().getCurrentListLevel().setNumberPosition(-10);
        }



        System.out.println(leaderBoard);
    }
}






        result.put("liverpool", 3);
                result.put("manchesterunited", 3);
                result.put("taranyulas2", 2 1);
                result.put("lions", 1);
                result.put("fcAwsome", 1);
                result.put("lions", 4);
                result.put("grouches", 0);