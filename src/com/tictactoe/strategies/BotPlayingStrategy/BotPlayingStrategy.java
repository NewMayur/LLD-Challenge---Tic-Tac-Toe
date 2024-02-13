package com.tictactoe.strategies.BotPlayingStrategy;

import com.tictactoe.models.Board;
import com.tictactoe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
