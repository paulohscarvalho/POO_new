package ocjp.java.certification.outro;

import ocjp.java.certification.Funcionario;

public class Outro extends Funcionario {
	private void liderar() {
		System.out.println("Liderando");
	}
	
	@Override
	protected void trabalhar() {
		System.out.println("Trabalhando - classe Outro");
	}
	
}
