package in.conceptarchitect.ui.steel;
import java.util.ArrayList;

import in.conceptarchitect.ui.core.Component;
import in.conceptarchitect.ui.core.Container;
import in.conceptarchitect.ui.core.Panel;

public class SteelPanel extends Panel {

ArrayList<Component> components= new ArrayList<>();
	
	@Override
	public Container add(Component component) {
		// TODO Auto-generated method stub
		components.add(component);
		return this;
	}

	@Override
	public void draw(int context) {
		// TODO Auto-generated method stub
		for(var i=0;i<context;i++)
			System.out.print("\t");
		System.out.println("Steel Form Drawn");
		for(var component:components) {
			component.draw(context+1);
		}
		
	}


}
