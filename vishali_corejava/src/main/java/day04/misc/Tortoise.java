package day04.misc;
import day04.misc.hare.Hare;

	public class Tortoise extends Hare {

		protected void race(Hare hare) {

		hare.init(); // x1

		hare.race(); // x2

		System.out.print("tortoise-");

		}
	

		public static void main(String[] args) {

		Tortoise tortoise = new Tortoise();

		Hare hare = new Hare();

		tortoise.race(hare);

		}
	}


