package com.bridgelabz;

import java.util.Random;

public class SnakeNLadder {
	

	public static void main(String[] args) {
		SnakeNLadder1 s = new SnakeNLadder1();
		s.startGame();
		s.rollDice();
	}
}
class SnakeNLadder1
{
public int rollDice()
{
	int n = 0;
	Random r = new Random();
	n=r.nextInt(7);
	return (n == 0 ? 1:n);
}
	public void startGame()
	{
		int player1 =0;
		int currentPlayer=-1;
	}
}