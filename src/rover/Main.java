package rover;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Rover rover = new Rover();
		
		File text = new File("....\\input.txt");
		Scanner scnr = new Scanner(text);
		int lineNumber = 1;
		while (scnr.hasNextLine()) {
			String line = scnr.nextLine();
			if (lineNumber == 1) {
				rover.plateau(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1]));
			}

			else if (lineNumber % 2 == 0) {

				rover.initial_position(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1]),
						line.split(" ")[2].charAt(0));

			}
			else {
				rover.movement(line);
				rover.final_position();
			}
			lineNumber++;
		}

	}

}
