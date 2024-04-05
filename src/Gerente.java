
public class Gerente extends Funcionario {

	private double bonusAnual;
	
	public double getBonus() {
		return bonusAnual;
	}

	public void setBonus(double bonus) {
		this.bonusAnual = bonus;
	}
	
	Gerente (String nome, int idade, double salario, double bonusAnual) {
		super(nome, idade, salario);
		this.bonusAnual = bonusAnual;
	}
	
	@Override
	double calcularSalario() {
		return super.getSalario() + (bonusAnual / 12);
	}
	
	@Override
	void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Bonus: " + bonusAnual);
	}
	
	
}
