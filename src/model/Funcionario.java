package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "funcionarios")
public class Funcionario {

	@Id
	private Integer matricula;
	private String nome;
	private String email;
	private String cidade;
	private String uf;
	private Double salario;

	public Funcionario(Integer matricula, String nome, String email, String cidade, String uf, Double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.uf = uf;
		this.salario = salario;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
