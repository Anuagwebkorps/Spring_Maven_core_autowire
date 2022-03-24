package com.springcore.autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
   	ApplicationContext cx=new ClassPathXmlApplicationContext("com/springcore/autowire/configAuto.xml");

    	/*Emp s=(Emp)cx.getBean("emp1");*/
	    Emp s=cx.getBean("emp1",Emp.class);

    	System.out.println(s);
    }
}
