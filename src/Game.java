import java.util.ArrayList;

class Game {
    private int totalScore = 0;
    ArrayList<Integer> rolls = new ArrayList<>();
    int frames[] = new int[10];

    int score() {
        int totalScore = 0;
        for (int rollIndex = 0, frameIndex = 0; frameIndex < frames.length; frameIndex++) {
            if (rolls.get(rollIndex) + rolls.get(rollIndex + 1) == 10) {
                totalScore += 10 + rolls.get(rollIndex + 2);
                rollIndex += 2;
            } else {
                totalScore += rolls.get(rollIndex) + rolls.get(rollIndex + 1);
                rollIndex += 2;
            }
        }
        return totalScore;
    }

    void roll(int pinsDowned) {
        rolls.add(pinsDowned);
    }
}
