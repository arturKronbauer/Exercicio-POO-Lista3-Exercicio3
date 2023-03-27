package aplicacao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Fisico;
import entidades.Juridico;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		List<Contribuinte> lista = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados da forma #" + i);
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual:  ");
			double rendaAnual = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Despesas com saúde:  ");
				double despesaSaude = sc.nextDouble();
				lista.add(new Fisico(nome, rendaAnual, despesaSaude));
			} else {
				System.out.print("Número de empregados: ");
				int numeroEmpregados = sc.nextInt();
				lista.add(new Juridico(nome, rendaAnual, numeroEmpregados));
			}
		}

		double soma = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (Contribuinte c : lista) {
			double valorImposto = c.imposto();
			System.out.println(c.getNome() + ": R$ " + String.format("%.2f", valorImposto));
			soma += valorImposto;
		}

		System.out.println();
		System.out.println("IMPOSTOS TOTAIS: R$ " + String.format("%.2f", soma));

		sc.close();
	}
}