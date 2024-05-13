package guessergame;

import java.util.*;

class Guesser {
	int guessNum;

	int guessingNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly Guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player1 {
	int guessNum;

	int guessingNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player !  kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessingNumber();
	}

	void collectNumFromPlayers() {
		Player1 P1 = new Player1();
		Player1 P2 = new Player1();
		Player1 P3 = new Player1();

		numFromPlayer1 = P1.guessingNumber();
		numFromPlayer2 = P2.guessingNumber();
		numFromPlayer3 = P3.guessingNumber();

	}

	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromPlayer1 == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All Give right anwer, All Players Won");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 Won ");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player  3 Won ");
			} else {
				System.out.println("Player 1 Won the game");
			}

		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 Won");
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("All Players not able guess ,Game Lost !!!");
		}

	}

}

public class LaunchGame {
	public static void main(String[] args) {
		System.out.println("Game  started");
		Umpire U = new Umpire();
		U.collectNumFromGuesser();
		U.collectNumFromPlayers();
		U.compare();

	}
}
