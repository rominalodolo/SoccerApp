public class finalScore {
    public static int  calculate ( int Score1, int Score2 ){
        // calculate total score of teams to put on the leader board log
        if ( Score1 == Score2 ){
            return new finalScore((Score1 +1) & (Score2 + 1));
        } if ( Score1 > Score2 ){
            return new finalScore( Score1 + 3 );
        } if ( Score1 < Score2 ){
            return new finalScore((Score1 + 0) & (Score2 + 0));
        } else {
            return + 0;
        }

        finalScore.calculate( 3, 3 );
        finalScore.calculate( 1, 0 );
        finalScore.calculate( 1, 1 );
        finalScore.calculate( 3, 1 );
        finalScore.calculate( 4, 0 );
    }

}
