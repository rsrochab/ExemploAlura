package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {

	public static void main(String[] args) {
		
		int idade = 29; // Integer
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); //Unboxing
		String s = args[0]; 
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>(); //forma correta de ser utilizada
		numeros.add(29); //Autoboxing

	}

}
