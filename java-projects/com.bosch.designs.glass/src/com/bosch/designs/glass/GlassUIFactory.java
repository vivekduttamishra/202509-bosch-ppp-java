package com.bosch.designs.glass;
import in.conceptarchitect.ui.core.Button;
import in.conceptarchitect.ui.core.Form;
import in.conceptarchitect.ui.core.Panel;
import in.conceptarchitect.ui.core.TextBox;
import in.conceptarchitect.ui.core.UIFactory;

public class GlassUIFactory extends UIFactory{

	@Override
	public Form createForm() {
		// TODO Auto-generated method stub
		return new GlassForm();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new GlassButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new GlassTextBox();
	}

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new GlassPanel();
	}

}
