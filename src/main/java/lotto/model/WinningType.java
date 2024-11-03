package lotto.model;

import java.util.Arrays;

public enum WinningType {
    FIRST(6, true, 2000000000),
    SECOND(5, true, 30000000),
    THIRD(5, false, 1500000),
    FOURTH(4, false, 50000),
    FIFTH(3, false, 5000),
    NONE(0, false, 0);

    private final int matchCount;
    private final boolean matchBonus;
    private final long prize;

    WinningType(int matchCount, boolean matchBonus, long prize) {
        this.matchCount = matchCount;
        this.matchBonus = matchBonus;
        this.prize = prize;
    }

    public static WinningType of(int matchCount, boolean matchBonus) {
        return Arrays.stream(WinningType.values())
                .filter(winningType -> hasSameMatchCount(matchCount, winningType) 
                        && hasSameMatchBonus(matchBonus, winningType))
                .findFirst()
                .orElse(NONE);
    }

    public long getPrize() {
        return prize;
    }

    private static boolean hasSameMatchBonus(boolean matchBonus, WinningType winningType) {
        return winningType.matchBonus == matchBonus;
    }

    private static boolean hasSameMatchCount(int matchCount, WinningType winningType) {
        return winningType.matchCount == matchCount;
    }
}
