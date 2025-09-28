package com.bosch.designs.glass;
import in.conceptarchitect.ui.core.TextBox;

public class GlassTextBox extends TextBox {

	@Override
	public void draw(int context) {
		// TODO Auto-generated method stub
		for(var i=0;i<context;i++)
			System.out.print("\t");
		System.out.println("Glass TextBox Drawn");
		
	}

}
