package OperacoesBasicasList;

public class Item {

	private String item;
	private double preço;
	private int quantidade;

	public Item(String item, double preço, int quantidade) {
		this.item = item;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	public String getItem() {
		return item;
	}
	public double getPreço() {
		return preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	@Override
	public String toString() {
		return "item= " + item + ", preço= " + preço + ", quantidade= " + quantidade + " -";
	}
	
}
