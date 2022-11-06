package _03_Intro_to_Enums;
import java.util.Random;

import javax.swing.JOptionPane;

enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);

	private double celsiusTemp;

	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	
	public double convertToFahrenheit(double celsiusTemp) {		
		return (celsiusTemp * 9/5) +32;
	}
	
//	private Random ran = new Random(StatesOfMatter.values().length);
	
	public static void main(String[] args) {
		System.out.println("length " +StatesOfMatter.values().length);
		System.out.println(StatesOfMatter.values());
		StatesOfMatter[] States = new StatesOfMatter[StatesOfMatter.values().length];
		States[0] = SOLID;
		States[1] = LIQUID;
		States[2] = GAS;
		String x = JOptionPane.showInputDialog("Please enter a State of Matter");

		for (int i = 0; i < States.length; i++) {
	
			if (States[i].name().equals(x)) {
				System.out.println("You chose " + States[i]);
				System.out.println(States[i].ordinal());
			} else {

			}
		}
		Random ran = new Random(States.length);
		StatesOfMatter randomState = States[ran.nextInt()];
		System.out.println("Random State " +randomState);
		System.out.println(randomState.celsiusTemp);
		System.out.println(randomState.convertToFahrenheit(0));
		switch (randomState) {

		case SOLID:
			System.out.println("Burrito");
			break;
		case LIQUID:
			System.out.println("Fruit Smoothie");
			break;
		case GAS:
			System.out.println("Water Vapor");
			break;
		default:
			System.out.println("No State of Matter. :(");
			break;
		}
	}


}