package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.bean.HelloWorld;

public class SpringDiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =

				new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		helloWorld.hello();
		
		
		
//-------------zad3---------------------		
		Component1 component1 = context.getBean("component1", Component1.class);
		System.out.println(component1.getComponent2()!=null);
		
		
//----------------zad4--------------
		System.out.println(context.getBean("scope1", Scope1.class).toString());
		System.out.println(context.getBean("scope1", Scope1.class).toString());
		System.out.println(context.getBean("scope1", Scope1.class).toString());
		System.out.println(context.getBean("scope2", Scope2.class).toString());
		System.out.println(context.getBean("scope2", Scope2.class).toString());
		System.out.println(context.getBean("scope2", Scope2.class).toString());
		
		context.close();
	}
}