
public class Start 
{
Pen pen;
Pencil pencil;
public Start(Book page) {
	pen=page.createPen();
	pencil=page.createPencil();
	
}
public void write() {
	pen.write();
	pencil.write();
	
}
}
