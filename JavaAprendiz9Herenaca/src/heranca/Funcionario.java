package heranca;

import java.util.Date;

public class Funcionario {

	private String nome;
	private String cpf;
	private Date Datanasc;
	private float salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDatanasc() {
		return Datanasc;
	}
	public void setDatanasc(Date datanasc) {
		Datanasc = datanasc;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
