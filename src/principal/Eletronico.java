package principal;

public abstract class Eletronico
{
	public int voltagem;
	public double preco;
	public String marca;


	public Eletronico(int voltagem, double preco,String marca)
	{
		super();
		this.voltagem = voltagem;
		this.preco = preco;
		this.marca = marca;

	}
	public abstract double getPreco();
	public abstract int getVoltagem();

}
