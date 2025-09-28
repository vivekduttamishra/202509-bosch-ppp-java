package com.bosch.designs.glass;
import in.conceptarchitect.ui.core.Button;

public class GlassButton extends Button {

	@Override
	public void draw(int context) {
		// TODO Auto-generated method stub
		for(var i=0;i<context;i++)
			System.out.print("\t");
		System.out.println("Glass  Button Drawn");
		
	}

}
