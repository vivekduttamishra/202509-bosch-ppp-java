package in.conceptarchitect.ui.rubber;
import in.conceptarchitect.ui.core.TextBox;

public class RubberTextBox extends TextBox {

	@Override
	public void draw(int context) {
		// TODO Auto-generated method stub
		for(var i=0;i<context;i++)
			System.out.print("\t");
		System.out.println("Rubber TextBox Drawn");
		
	}

}
