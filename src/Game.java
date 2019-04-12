class Game {

    private int[] scorePerRoll = new int[21];
    private int rollIndex = 0;
    private int[] frame = new int[10];

    int score() {
        int score = 0;

        for (int frameIndex = 0, roll = 0; frameIndex < frame.length; frameIndex++) {
            if (scorePerRoll[roll] + scorePerRoll[roll + 1] == 10) {
                score += 10 + scorePerRoll[roll + 2];
                roll += 2;
            } else if (scorePerRoll[roll] == 10) {
                score += 10 + scorePerRoll[roll + 1] + scorePerRoll[roll + 2];
                roll++;
            } else {
                score += scorePerRoll[roll] + scorePerRoll[roll + 1];
                roll += 2;
            }
        }
        return score;
    }

    void roll(int downedPins) {
        scorePerRoll[rollIndex] = downedPins;
        rollIndex++;
    }
}
