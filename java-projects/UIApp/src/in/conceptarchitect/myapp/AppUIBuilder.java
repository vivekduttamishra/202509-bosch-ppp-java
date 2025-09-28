package in.conceptarchitect.myapp;
import in.conceptarchitect.ui.core.Component;
import in.conceptarchitect.ui.core.Form;
import in.conceptarchitect.ui.core.Panel;
import in.conceptarchitect.ui.core.UIFactory;

public class AppUIBuilder {
	
	UIFactory factory;
	
	AppUIBuilder setFactory(UIFactory ui) {
		factory=ui;
		return this;
	}
	
	
	
	public Component build() {
		
		Panel textBoxPanel= factory.createPanel();
		
		textBoxPanel
				.add(factory.createTextBox())
				.add(factory.createTextBox())
				.add(factory.createTextBox());
		
			
		
		var buttonPanel = factory
								.createPanel()
								.add(factory.createButton())
								.add(factory.createButton());
		
		Panel mainPanel=factory.createPanel();
		mainPanel.add(textBoxPanel);
		mainPanel.add(buttonPanel);
		
		Form form= factory.createForm();
		form.add(mainPanel);
		form.add(factory.createButton());
		
		
		return form;
	}

}
