package principal;

public class Radio extends Eletronico
{

	public Radio(int voltagem, double preco,String marca)
	{
		super(voltagem, preco,marca);
	}

	public double getPreco() {

		return this.preco;
	}

	public int getVoltagem() {

		return this.voltagem;
	}
	public String getMarca()
	{
		return this.marca;
	}

	public  String toString()
	{
		return "radio\nMarca :" + this.getMarca() +  "\nPreço : " + this.getPreco() + "\n";
	}

}
