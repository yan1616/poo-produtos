package produtos;

import java.util.Scanner;

public class Produto {
	
	Scanner sc = new Scanner(System.in);
	
	public String nome;
	public double preco;
	public int quantidade;
	double precoTotal;
	int QA;
	double PA;
	int QR;
	double PR;
	
	public void dados() {
		System.out.println("Entre com os dados do produto: ");
		//nomeProduto
		System.out.print("Produto: ");
		nome = sc.next();
		//valorPreco
		System.out.print("Preço: ");
		preco = sc.nextDouble();
		//quantidadeProdutos
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
		//precoTotal
		precoTotal = preco * quantidade;
	}
	
	public double valorTotalEstoque() {
		System.out.printf("Dados do produto: Produto: %s; Preço: R$%.2f; Quantidade: %d; Preço total: R$%.2f %n",
				nome, preco, quantidade, precoTotal);
		return precoTotal;
	}
		
	public void adicionarEstoque() {
		System.out.print("Entre com o numero de produtos que deseja adicionar no estoque: ");
		int atualizado = sc.nextInt();
		QA = quantidade + atualizado; 
		PA = preco * QA;
		System.out.printf("Atualização do produto: Produto: %s; Preço: R$%.2f; Quantidade: %d; Preço total: R$%.2f %n",
				nome, preco, QA, PA);
	}
	
	public void removerProduto() {
		System.out.print("Entre com o numero de produtos que deseja remover no estoque: ");
		int remocao = sc.nextInt();
		QR = QA - remocao;
		PR = preco * QR; 
		System.out.printf("Atualização do produto: Produto: %s; Preço: R$%.2f; Quantidade: %d; Preço total: R$%.2f %n",
				nome, preco, QR, PR);
	}
	
}
