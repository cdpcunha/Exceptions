package Entidade;

import Dominio.Dominio;

public class Conta {
	protected Integer codigo;
	protected String titular;
	protected Double saldo;
	protected Double limiteSaque;
		
	public Conta(Integer codigo, String titular, Double saldo, Double limiteSaque) {
		super();
		this.codigo = codigo;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public Conta() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	
	public void deposito (double montante) {
		this.saldo += montante;
	}
	
	public void saque (double montante) {
		if (montante > getSaldo()) {
			throw new Dominio("Saldo insuficiente para o saque desejado. Saldo atual $"+getSaldo());
		}
		if (montante > getLimiteSaque()) {
			throw new Dominio("Montante de saque maior que o limite de $"+getLimiteSaque());
		}
		this.saldo -= montante;
	}
}
