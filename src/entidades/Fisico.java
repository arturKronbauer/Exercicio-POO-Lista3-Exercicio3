package entidades;

public class Fisico extends Contribuinte {

	private Double despesaSaude;

	public Fisico(String nome, Double rendimentoAnual, Double despesaSaude) {
		super(nome, rendimentoAnual);
		this.despesaSaude = despesaSaude;
	}

	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public Double imposto() {
		if (getRendimentoAnual() < 20000.0) {
			return getRendimentoAnual() * 0.15 - despesaSaude * 0.5;
		}
		else {
			return getRendimentoAnual() * 0.25 - despesaSaude * 0.5;
		}
	}
}
