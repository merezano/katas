
public class TennisGame1 implements TennisGame {

    private static final int MINIMUM_POINTS_TO_WIN = 4;
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;
    private static final String[] POINT_CALLS = { "Love", "Fifteen", "Thirty",
            "Forty" };

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        String score = "";
        if (isTied()) {
            score = tieScore();
        } else if (playersHaveScoredEnoughtPointsToWin()) {
            score = advantageOrWinScore();
        } else {
            score = regularPointScore();
        }
        return score;
    }

    public String regularPointScore() {
        return POINT_CALLS[player1Score] + "-" + POINT_CALLS[player2Score];
    }

    public String advantageOrWinScore() {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1)
            score = "Advantage " + player1Name;
        else if (minusResult == -1)
            score = "Advantage " + player2Name;
        else if (minusResult >= 2)
            score = "Win for " + player1Name;
        else
            score = "Win for " + player2Name;
        return score;
    }

    public String tieScore() {
        String score;
        if (player1Score < 3)
            score = POINT_CALLS[player1Score] + "-All";
        else
            score = "Deuce";
        return score;
    }

    public boolean isTied() {
        return player1Score == player2Score;
    }

    public boolean playersHaveScoredEnoughtPointsToWin() {
        return player1Score >= MINIMUM_POINTS_TO_WIN
                || player2Score >= MINIMUM_POINTS_TO_WIN;
    }
}
