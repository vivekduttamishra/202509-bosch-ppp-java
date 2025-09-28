package in.conceptarchitect.ui.steel;
import in.conceptarchitect.ui.core.Button;
import in.conceptarchitect.ui.core.Form;
import in.conceptarchitect.ui.core.Panel;
import in.conceptarchitect.ui.core.TextBox;
import in.conceptarchitect.ui.core.UIFactory;

public class SteelUIFactory extends UIFactory{

	@Override
	public Form createForm() {
		// TODO Auto-generated method stub
		return new SteelForm();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SteelButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new SteelTextBox();
	}

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new SteelPanel();
	}

}
