package principal;

public class TV extends Eletronico
{
	public double polegadas;


	public TV(int voltagem, double preco,double polegadas,String marca)
	{
		super(voltagem, preco,marca);
		this.polegadas = polegadas;

	}

	public double getPolegadas()
	{
		return  polegadas;
	}


	public double getPreco()
	{
		return this.preco;

	}

	public int getVoltagem()
	{
		return this.voltagem;
	}

	public String getMarca() {
		return marca;
	}

	public  String toString()
	{
		return "TV\nMarca :" + this.getMarca() + "\nPolegadas: " + this.getPolegadas() + "\nPreço : " + this.getPreco() + "\n";
	}




}
