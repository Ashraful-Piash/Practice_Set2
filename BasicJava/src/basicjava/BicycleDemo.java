package basicjava;

public class BicycleDemo {

	public static void main(String[] args) {
		
		Bicycle bike1= new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(90);
		bike1.changeGear(2);
		bike1.speedUp(30);
		bike1.printStates();
		
		bike2.changeCadence(50);
		bike2.changeGear(3);
		bike2.speedUp(50);
		bike2.applyBrakes(20);
		bike2.changeGear(1);
		bike2.printStates();
	}

}
