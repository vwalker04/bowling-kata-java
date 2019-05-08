import java.util.ArrayList;

class Game {
    private int score = 0;
    ArrayList<Integer> rolls = new ArrayList<>();

    int score() {
        for(int i = 0; i < rolls.size(); i++) {
            score += rolls.get(i);
        }
        return score;
    }

    void roll(int pinsDowned) {
        rolls.add(pinsDowned);
    }
}
