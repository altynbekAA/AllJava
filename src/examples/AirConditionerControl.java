package examples;

public class AirConditionerControl {
	public static void main(String[] args) {
		AirConditioner value = new AirConditioner();
		value.model = "LG";
		value.isOn = false;
		value.temperature = 88;
		System.out.println(value.temperature);

		
		System.out.println(value.isOn);
		
		value.turnOn();
		System.out.println(value.isOn);
		
		value.turnOff();
		System.out.println(value.isOn);
		value.setTemperature(70);
		
		System.out.println(value.temperature);
		value.turnUpTemperature(10);
		System.out.println(value.temperature);
		
	}

}
