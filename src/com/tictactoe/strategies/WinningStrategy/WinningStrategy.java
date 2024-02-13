package com.tictactoe.strategies.WinningStrategy;

import com.tictactoe.models.Board;
import com.tictactoe.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
    public void undo(Board board, Move move);


}
