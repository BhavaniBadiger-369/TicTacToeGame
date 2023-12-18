package com.secondweek;

public class LaunchGame {

	public static void main(String[] args) {

		TicTacToe t = new TicTacToe();
		t.displayBoard();
		HumanPlayer p1 = new HumanPlayer("Radha", 'X');
		AiPlayer p2 = new AiPlayer("AI", 'O');
		Player cp;
		cp = p1;

		while (true) {
			System.out.println(cp.name + " turn");
			cp.makeMove();
			t.displayBoard();
			if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkdiagWin()) {
				System.out.println(cp.name + " has won the game!");
				break;
			} else {
				if (cp == p1) {
					cp = p2;
				} else {
					cp = p1;
				}
			}
		}

	}

}
