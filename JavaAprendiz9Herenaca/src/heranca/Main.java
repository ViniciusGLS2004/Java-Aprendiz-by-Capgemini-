package heranca;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vendedor  v = new Vendedor();
		v.setNome("Marcio");
		v.setCpf("2478944849");
		v.setSalario(100.0f);
		v.setDatanasc(new Date());
		v.setComissaoporItem(10.0f);
		v.setTotalItensVendidos(10);
		
		System.out.println("O salario do vendedor é: " + v.calcularSalario());
		
		Motorista m = new Motorista();
		
		
		
	}

}
