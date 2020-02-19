
public class PlasticBook implements Book {

	@Override
	public Pen createPen() {
		// TODO Auto-generated method stub
		return new PlasticPen();
	}

	@Override
	public Pencil createPencil() {
		// TODO Auto-generated method stub
		return new PlasticPencil();
	}

}
