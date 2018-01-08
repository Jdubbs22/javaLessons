package java_lessons;

// Basic class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

/* The Goal of this tutorial is to make a game like this
------------------------------
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||M||F||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
|P||*||*||*||*||*||*||*||*||*|
|*||*||*||*||D||*||*||*||*||*|
|*||*||*||*||*||*||*||*||*||*|
------------------------------
[9,9]

 */

public class Progamming_logic {

	public static void main(String[] args) {

		Class_oop.buildBattleBoard();

		char[][] tempBattleBoard = new char[10][10];

		// ObjectName[] ArrayName = new ObjectName[4];

		Class_oop[] Monsters = new Class_oop[4];

		// Class_oop(int health, int attack, int movement, String name)

		Monsters[0] = new Class_oop(1000, 20, 1, "Frank");
		Monsters[1] = new Class_oop(500, 40, 2, "Drac");
		Monsters[2] = new Class_oop(1000, 20, 1, "Paul");
		Monsters[3] = new Class_oop(1000, 20, 1, "George");

		Class_oop.redrawGameBoard();

	}

}