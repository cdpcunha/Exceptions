package Programa;

import java.util.Scanner;

import Dominio.Dominio;
import Entidade.Conta;

public class Programa {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try {
	System.out.println("  Entre com os dados da conta  ");
	System.out.print("Número : ");
	int codigo = sc.nextInt();
	sc.nextLine();
	System.out.print("Titular : ");
	String titular = sc.nextLine();
	System.out.print("Saldo inicial : ");
	double saldo = sc.nextDouble();
	System.out.print("Limite de Saque : ");
	double limite = sc.nextDouble();
	
	Conta conta = new Conta(codigo, titular, saldo, limite);
	
	System.out.println("Entre com o montade de Saque : ");
	double saque = sc.nextDouble();
	conta.saque(saque);
	}
	catch (Dominio e) {
		System.out.println("Erro : " + e.getMessage());
	}
	catch(RuntimeException e) {
		System.out.println("Erro de entrada.");
	}
	sc.close();
	}
}
