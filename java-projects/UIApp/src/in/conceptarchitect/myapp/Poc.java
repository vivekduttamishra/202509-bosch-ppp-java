package in.conceptarchitect.myapp;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.rubber.RubberUIFactory;
import in.conceptarchitect.ui.steel.SteelUIFactory;

class UIFactoryCreator{
	public static final UIFactoryCreator instance=new UIFactoryCreator();
	
	public UIFactory getFactory(String name) {
//		if(name.equals("steel")) {
//			return new SteelUIFactory();
//		}else if(name.equals("rubber")){
//			return new RubberUIFactory();
//		} else {
//			throw new RuntimeException("Invalid UI Type:"+name);
//		}
		
		
		try {
			return (UIFactory) Class.forName(name).getDeclaredConstructors()[0].newInstance();
		}catch(Exception ex) {
			throw new RuntimeException("Invalid UI "+name, ex);
		}
		
	}
	
	ArrayList<UIFactory> factories=new ArrayList<>();
	
	public UIFactoryCreator register(UIFactory factory) {
		factories.add(factory);
		
		return this;
	}
	
	public ArrayList<String> getFactories(){
		return factories.stream().map(f->f.getClass().getName()).collect(ArrayList.class);
	}
}


public class Poc {

	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		//var ui=new RubberUIFactory();
		//var ui=new SteelUIFactory();
		
		var properties= new Properties();
				
		properties.load(new FileReader("app.properties"));
		
		var uiName= (String) properties.get("ui");		
		
		
		
		var ui = UIFactoryCreator.instance.getFactory(uiName);
		
		
		new AppUIBuilder()
			.setFactory(ui)
			.build()
			.draw(0);
		
		
		

	}
	
	static void Version1() {
		// TODO Auto-generated method stub
				//UIFactory ui= new SteelUIFactory();

//				Form      form      = ui.createForm(); 
//				Button   button   = ui.createButton();  
//				TextBox textBox =  ui.createTextBox(); 
//				
//				form.add(button);
//				form.add(textBox);
				
				
//				var builder=new AppUIBuilder();
				
//				var form = builder.build(ui);
//				
//				form.draw(0);

//				
//				ui
//					.createForm()
//					.add(ui.createButton())
//					.add(ui.createTextBox())
//					.draw(0);
	}
}


