
public class WoodenBook implements Book{

	@Override
	public Pen createPen()
	{
		return new WoodenPen();
	}

	@Override
	public Pencil createPencil()
	{
		return new WoodenPencil();
	}

}
