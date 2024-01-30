package LacoFor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ContadorIntervalo = 0;
		
		for (int i = 1; i < 81; i++) {
			System.out.println(i);
			
			if(i >= 10 && i <= 150) {
				ContadorIntervalo ++; 
			}
		}
        System.out.println("Quantidade de números no intervalo: " + ContadorIntervalo);

	

}
}