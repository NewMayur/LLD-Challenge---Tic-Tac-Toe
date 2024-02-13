package com.tictactoe.controllers;

import com.tictactoe.Exceptions.BotCountException;
import com.tictactoe.Exceptions.PlayerCountException;
import com.tictactoe.Exceptions.SymbolCountException;
import com.tictactoe.models.Game;
import com.tictactoe.models.GameState;
import com.tictactoe.models.Player;
import com.tictactoe.strategies.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimensions, List<Player> players, List<WinningStrategy> winningStrategies) throws PlayerCountException, BotCountException, SymbolCountException {
        return Game.getBuilder().setDimension(dimensions).setPlayers(players).setWinningStrategies(winningStrategies).build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public void undo(Game game) {
        game.undo();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}
