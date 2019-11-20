package Dado;

import java.util.Random;

public class Dado {

	public int rolar() {
		return new Random().nextInt(6) + 1;
	}

}
