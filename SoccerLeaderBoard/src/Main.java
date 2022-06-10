import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {

    public static int megaExtract(String token) {
        return Integer.parseInt(token.replaceAll("[^\\d]", ""));
    }

    private static void appendScore(HashMap<String, Integer> map, String s, Integer a) {
        if(map.containsKey(s)) {
            map.put(s, map.get(s) +  a);
        }
        else map.put(s, a);
    }

    private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Create custom comparator which orders by score
        Comparator<Map.Entry<String, Integer>> compareByScore = Map.Entry.comparingByValue();

        // use and then to sort equal values in alphabetical order
        list.sort(compareByScore.reversed().thenComparing(Map.Entry.comparingByKey()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/rominalodolo/Desktop/GitHub/JAVA/SoccerApp/SoccerLeaderBoard/src/data.txt");

        HashMap<String, Integer> leaderBoard = new HashMap<>();

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String team1 = scanner.next();
            String s1 = scanner.next();

            while (s1.matches("[^\\d]+")) {
                team1 = team1.concat(s1);
                s1 = scanner.next();
            }
            int score1 = megaExtract(s1);

            String team2 = scanner.next();
            String s2 = scanner.next();
            while (s2.matches("[^\\d]+")) {
                team2 = team2.concat(s2);
                s2 = scanner.next();
            }
            int score2 = megaExtract(s2);
            if (score1 == score2) {
                appendScore(leaderBoard, team1, 1);
                appendScore(leaderBoard, team2, 1);
            } else {
                if (score1 > score2) {
                    appendScore(leaderBoard, team1, 3);
                    appendScore(leaderBoard, team2, 0);
                } else {
                    appendScore(leaderBoard, team2, 3);
                    appendScore(leaderBoard, team1, 0);
                }
            }
        }

        HashMap<String, Integer> sortedResults = sortByValue(leaderBoard);

        int x = 1;
        for (
                Map.Entry<String, Integer> map : sortedResults.entrySet()) {
            System.out.println(x++ + ".)" + map.getKey() + ": " + map.getValue());
        }
    }
}

// code by E.Heynike, R.Lodolo 
