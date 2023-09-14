package OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String item, double preco, int quantidade) {
		itemList.add(new Item (item, preco, quantidade));
	}
	
	public void removerItem(String item) {
		List<Item> itensParaRemover = new ArrayList<>();
		if (!itemList.isEmpty()) {
			for (Item i : itemList) {
				if (i.getItem().equalsIgnoreCase(item)) {
					itensParaRemover.add(i);
				}
			}
			itemList.removeAll(itensParaRemover);
		} else {
			System.out.println("O carrinho de compras está vazio!");
		}
	}
	public double calcularValorTotal() {
		double valorTotal = 0d;
	    if (!itemList.isEmpty()) {
	      for (Item item : itemList) {
	        double valorItem = item.getPreço() * item.getQuantidade();
	        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
	      }
	      return valorTotal;
		} else {
			System.out.println("O carrinho de compras está vazio!");
		}
		return valorTotal;
	}
	public void exibirItens() {
		if (!itemList.isEmpty()) {
			System.out.println("Estes são os itens do seu carrinho: " + itemList);
		} else {
			System.out.println("O carrinho de compras está vazio!");
		}
	}

	//TESTE MAIN
	public static void main(String[] args){
		
		CarrinhoDeCompras listaitem = new CarrinhoDeCompras();
		//ADICIONANDO ITENS NO CARRINHO
		listaitem.adicionarItem("Lápis", 2.50, 4);
		listaitem.adicionarItem("Lápis", 2.50, 4);
		listaitem.adicionarItem("Borracha", 1.50, 2);
		listaitem.adicionarItem("Apontador", 6.00, 2);
		listaitem.adicionarItem("Caderno", 30.00, 3);
		listaitem.adicionarItem("Régua", 4.50, 2);
		//EXIBINDO ITENS DO CARRINHO
		listaitem.exibirItens();
		//EXCLUINDO ITENS DO CARRINHO
		listaitem.removerItem("Lápis");
		//EXIBINDO LISTA ATUALIZADA
		listaitem.exibirItens();
		//CALCULANDO VALOR TOTAL DAS COMPRAS
		listaitem.calcularValorTotal();
		
		
	}
}