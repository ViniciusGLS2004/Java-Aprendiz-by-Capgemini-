package temperatura;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float tempC = 25.0f;
		float tempF;
		
		// formula de ceucisu para farenheit
		tempF = (9 * tempC + 160)/5;
		
		System.out.println("A temperatura em celcius de " + tempC + " graus ,para farenheit seria de " + tempF + " graus");
	}

}
