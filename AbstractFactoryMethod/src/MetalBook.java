
public class MetalBook implements Book{

	@Override
	public Pen createPen() {
		
		return new MetalPen();
	}

	@Override
	public Pencil createPencil() {
		// TODO Auto-generated method stub
		return new MetalPencil();
	}

}
