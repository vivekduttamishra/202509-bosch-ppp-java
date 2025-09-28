package in.conceptarchitect.ui.rubber;
import in.conceptarchitect.ui.core.Button;
import in.conceptarchitect.ui.core.Form;
import in.conceptarchitect.ui.core.Panel;
import in.conceptarchitect.ui.core.TextBox;
import in.conceptarchitect.ui.core.UIFactory;

public class RubberUIFactory extends UIFactory{

	@Override
	public Form createForm() {
		// TODO Auto-generated method stub
		return new RubberForm();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new RubberButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new RubberTextBox();
	}

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new RubberPanel();
	}

}
