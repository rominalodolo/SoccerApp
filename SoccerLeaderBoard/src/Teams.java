import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Teams {

    public static void String Teams throws IOExcepton {

        Stream<String> rows5 = Files.lines(Paths.get("/Users/rominalodolo/Desktop/GitHub/JAVA/SoccerApp/SoccerLeaderBoard/src/data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows5
                .map(x -> x.split(" ,"))
                .
        List<Team> Teams = new ArrayList<>();

        teams.add(new Team())
        String[] team = {"Tarantulas2", "Lions", "FCAwesome", "МanchesterUnited", "Liverpool", "Grouches"};
        Arrays.stream(team)
                .sorted()
                .ifPresent();
    }
}

//public boolean contains(Arrays team) throws ClassCastException {
//        Arrays.asList("Tarantulas2", "Lions", "FCAwesome", "МanchesterUnited", "Liverpool", "Grouches");
