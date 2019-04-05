class Game {

    private int score = 0;

    int score() {
        return score;
    }

    void roll(int downedPins) {
        score += downedPins;
    }
}
