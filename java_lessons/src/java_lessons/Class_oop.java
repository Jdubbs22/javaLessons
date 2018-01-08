package java_lessons;

import java.util.Arrays;

public class Class_oop { // in vid he calls this class "monster"

	static char[][] battleBoard = new char[10][10];

	public static void buildBattleBoard() {
		for (char[] row : battleBoard) {
			Arrays.fill(row, '*');
		} // end for
	}// end buildBattleBoard

	public static void redrawGameBoard() {
		int k = 1;
		while (k <= 30) {
			System.out.print('-');// draws 30 -----
			k++;
		} // end while
		System.out.println();
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			} // end nested for
			System.out.println();

		} // end for

		while (k <= 30) {
			System.out.print('-');// draws 30 -----
			k++;
		} // end while

	}// end redrawGameBoard

	public final String TOMBSTONE = "Here lies a dead monster";
	// Defined constant ^^^
	private int health = 500; // private fields or class variables
	private int attack = 20;
	private int movement = 2;

	private boolean alive = true;

	public String name = "Big Monster"; // public so can be changed
	public char nameChar1 = 'B'; // B as in big monster
	// always try to minimize public fields
	public int xPosition = 0;
	public int yPosition = 0;

	public static int numOfMonsters = 0;

	public int getAttack() { // allows user to see the attack strength without
								// the ability to change it refered to as
								// accesser methods

		return attack;
	}// end getAttack

	public int getMovement() {
		return movement; // lets user see the movement stat(s)
	}// end getMovement

	public int getHealth() {
		return health;
	}// end getHealth

	public boolean getAlive() {
		return alive;
	}// end getAlive

	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		} // end if
	}// end setHealth

	public void setHealth(double decrease) { // double loaded value or
												// overloaded
		// used as a way to protect against user puting a double
		// or long whatever
		int intDecreasehealth = (int) decreaseHealth;
		health = health = intDecreasehealth;
		if (health < 0) {
			alive = false;
		} // end if
	}// end setHealth

	public Class_oop(int health, int newAttack, int newMovement, String name) {
		// constructor for monster (again that's what he called the class,
		// you have to have the same name in the constructor)
		// no return value of ANY type in constuctors

		this.health = health;// another way so we don't have to rename
		// this.health is the same as the primary private one now
		attack = newAttack;
		movement = newMovement;
		this.name = name;

		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;

		int randNumX, randNumY;
		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);

		} // end do...will always do this
		while (battleBoard[randNumX][randNumY] != '*');

		this.xPosition = randNumX;
		this.yPosition = randNumY;

		this.nameChar1 = this.name.charAt(0);

		battleBoard[this.xPosition][this.yPosition] = this.nameChar1;

		numOfMonsters++;

	}// end constructor class_oop

	public Class_oop() { // allows if no input was given
							// also the default constructor if we didn't create
							// one
		numOfMonsters++;
	}// end constructor (overloaded)

	public static void main(String[] args) {
		// Class_oop Frank = new Class_oop(); // uses the above constructor
		// System.out.println(Frank.attack);

	}// end main

}// end class_oop
