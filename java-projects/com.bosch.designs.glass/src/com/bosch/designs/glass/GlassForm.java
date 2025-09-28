package com.bosch.designs.glass;

import java.util.ArrayList;

import in.conceptarchitect.ui.core.Component;
import in.conceptarchitect.ui.core.Container;
import in.conceptarchitect.ui.core.Form;

public class GlassForm extends Form {

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
		System.out.println("Glass Form Drawn");
		for(var component:components) {
			component.draw(context+1);
		}
		
	}

	

}
