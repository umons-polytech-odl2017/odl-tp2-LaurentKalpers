package exercise2;

public class ProductionWorker implements Payable
{
	private int  piece=0;
	private final int retribu;

	public ProductionWorker(int retribu)
	{
		this.retribu = retribu;
	}

	public void produceOnePiece()
	{
	piece++;
	}

	public int computeSalary()
	{
		return piece*retribu;
	}
}
