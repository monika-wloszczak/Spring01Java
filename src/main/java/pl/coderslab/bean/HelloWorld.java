package pl.coderslab.bean;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class HelloWorld {

	public void hello(){
		System.out.println((new Date()).toString());
	}
}
