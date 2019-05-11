import java.util.ArrayList;

class Game {
    private int totalScore = 0;
    private ArrayList<Integer> rolls = new ArrayList<>();
    private int[] frames = new int[10];

    int score() {
        for (int rollIndex = 0, frameIndex = 0; frameIndex < frames.length; frameIndex++) {
            if (isSpare(rollIndex)) {
                totalScore += scoreSpare(rollIndex);
                rollIndex += 2;
            } else if (isStrike(rollIndex)) {
                totalScore += scoreStrike(rollIndex);
                rollIndex++;
            } else {
                totalScore += scoreFrame(rollIndex);
                rollIndex += 2;
            }
        }
        return totalScore;
    }

    void roll(int pinsDowned) {
        rolls.add(pinsDowned);
    }

    private int scoreFrame(int rollIndex) {
        return rolls.get(rollIndex) + rolls.get(rollIndex + 1);
    }

    private int scoreSpare(int rollIndex) {
        return 10 + rolls.get(rollIndex + 2);
    }

    private int scoreStrike(int rollIndex) {
        return 10 + rolls.get(rollIndex + 1) + rolls.get(rollIndex + 2);
    }

    private boolean isSpare(int rollIndex) {
        return rolls.get(rollIndex) + rolls.get(rollIndex + 1) == 10;
    }

    private boolean isStrike(int rollIndex) {
        return rolls.get(rollIndex) == 10;
    }
}
