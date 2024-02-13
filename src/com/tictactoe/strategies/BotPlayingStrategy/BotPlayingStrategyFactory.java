package com.tictactoe.strategies.BotPlayingStrategy;

import com.tictactoe.models.Bot;
import com.tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel.equals(BotDifficultyLevel.EASY))
            return new EasyBotPlayingStrategy();
        if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM))
            return new MediumBotPlayingStrategy();
        return new EasyBotPlayingStrategy();
    }
}
