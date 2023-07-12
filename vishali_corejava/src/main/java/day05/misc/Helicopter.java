package day05.misc;

abstract class Rotorcraft{

protected final int height = 5;



abstract int fly();

}



interface CanFly{}



public class Helicopter extends Rotorcraft implements CanFly {

private int height = 10;

protected int fly() {

return super.height;

}



public static void main(String[] args) {
//
//Helicopter h = (Helicopter new Rotorcraft();
//
//System.out.println(h.fly());

}

}
