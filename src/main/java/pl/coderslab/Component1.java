package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component1 {
	Component2 component2;
	public Component1(){
		
	}
	public Component2 getComponent2() {
		return component2;
	}
	
	@Autowired
	public void setComponent2(Component2 component2) {
		this.component2 = component2;
	}
	
	
}
