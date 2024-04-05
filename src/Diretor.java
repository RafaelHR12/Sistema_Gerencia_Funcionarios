
public class Diretor extends Funcionario {

	private int acoes;
	private double valorAcao;
	
	public int getAcoes() {
		return acoes;
	}

	public void setAcoes(int acoes) {
		this.acoes = acoes;
	}

	public double getValorAcao() {
		return valorAcao;
	}

	public void setValorAcao(double valorAcao) {
		this.valorAcao = valorAcao;
	}
	
	Diretor (String nome, int idade, double salario, int acoes, double valorAcao) {
		super(nome, idade, salario);
		this.acoes = acoes;
		this.valorAcao = valorAcao;
	}
	
	@Override
	double calcularSalario() {
		// TODO Auto-generated method stub
		return super.getSalario() + (acoes * valorAcao);
	}
	
	@Override
	void exibirInformacoes () {
		super.exibirInformacoes();
		System.out.println("Quantidade de Ações: " + acoes);
		System.out.println("Valor de cada Ações: " + valorAcao);
	}

}
