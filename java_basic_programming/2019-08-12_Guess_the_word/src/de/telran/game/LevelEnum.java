package de.telran.game;

public enum LevelEnum {
    SUPER_EASY(1, "This is the easiest level"),
    EASY(2, "This is second level"),
    HARD(3, "This is hardest level");

    public static LevelEnum getLevelByLevelCode(int levelCode) throws WrongLevelCodeException {
        for (LevelEnum level: LevelEnum.values()) {
            if (level.getLevelCode() == levelCode)
                return level;
        }
        throw new WrongLevelCodeException(levelCode);
    }

    private final int levelCode;
    private final String description;

    LevelEnum(int levelCode, String description) {
        this.levelCode = levelCode;
        this.description = description;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getDescription() {
        return description;
    }
}
