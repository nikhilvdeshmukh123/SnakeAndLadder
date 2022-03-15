package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class SnakeNLadder {

	public static void main(String[] args) {
		SnakeNLadder1 s = new SnakeNLadder1();
		s.startGame();
		s.rollDice();
	}
}

class SnakeNLadder1 {
	final static int WINPOINT = 100;

	public int rollDice() {
		int n = 0;
		Random r = new Random();
		n = r.nextInt(7);
		return (n == 0 ? 1 : n);

	}

	public String snake() {
		return "Snake";
	}

	public String ladder() {
		return "Ladder";
	}

	public void startGame() {
		int player1 = 0;
		int currentPlayer = -1;
		Scanner s = new Scanner(System.in);
		String str;
		int diceValue = 0;
		int count = 0;
		do {
			System.out.println(currentPlayer == -1 ? "\n\nFIRST PLAYER TURN" : "\n\nSECOND PLAYER TURN");
			System.out.println("Press r to roll Dice");
			str = s.next();
			diceValue = rollDice();
			if (currentPlayer == -1) {
				player1 = calculatePlayerValue(player1, diceValue);
				System.out.println("First Player :: " + player1);
				System.out.println("------------------");
				count++;
				System.out.println("No of Dice Played :" + count);
				if (isWin(player1)) {
					System.out.println("First player wins");

					return;
				}
			}
			currentPlayer = -currentPlayer;
		} while ("r".equals(str));
	}

	public int calculatePlayerValue(int player, int diceValue) {
		player = player + diceValue;
		if (player > WINPOINT) {
			player = player - diceValue;
			return player;
		}
		if (null != snake()) {
			System.out.println("swallowed by snake");
			player = player - diceValue;
		}
		if (null != ladder()) {
			System.out.println("climb up the ladder");
			player = player + diceValue;
		}
		return player;

	}

	public boolean isWin(int player) {
		return WINPOINT == player;
	}

}