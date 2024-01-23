package heranca;


public class Vendedor extends Funcionario{
	
	private int totalItensVendidos;
	private float comissaoporItem;
	
	public Vendedor() {
		super();
	}
	
	public float calcularSalario() {
		return super.getSalario() + (this.comissaoporItem * totalItensVendidos);
	}

	public int getTotalItensVendidos() {
		return totalItensVendidos;
	}

	public void setTotalItensVendidos(int totalItensVendidos) {
		this.totalItensVendidos = totalItensVendidos;
	}

	public float getComissaoporItem() {
		return comissaoporItem;
	}

	public void setComissaoporItem(float comissaoporItem) {
		this.comissaoporItem = comissaoporItem;
	}
	
	

}
