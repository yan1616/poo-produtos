import java.util.Locale;
import java.util.Scanner;

import produtos.Produto;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();

		p.dados();
		System.out.println("");
		p.valorTotalEstoque();
		System.out.println("");
		p.adicionarEstoque();
		System.out.println("");
		p.removerProduto();
		
		sc.close();
	}

}
