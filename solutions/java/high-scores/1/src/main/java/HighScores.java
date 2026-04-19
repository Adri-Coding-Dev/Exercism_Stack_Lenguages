import java.util.*;

class HighScores {

    private List<Integer> highScore;

    public HighScores(List<Integer> highScores) {
        this.highScore = highScores;
    }

    List<Integer> scores() {
        return highScore;
    }

    Integer latest() {
        return highScore.get(highScore.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(highScore);

    }

    List<Integer> personalTopThree() {
        return highScore.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
    }

}
