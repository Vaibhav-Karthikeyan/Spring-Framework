package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.app.entity.Contact;
import com.masai.app.entity.Customer;
import com.masai.app.entity.RateInfo;
import com.masai.app.entity.RateUpdate;
import com.masai.app.entity.RateUpdateDetails;
import com.masai.app.entity.SenderInfo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Contact contact=ctx.getBean(Contact.class,"con");
		System.out.println(contact);
		SenderInfo info=ctx.getBean(SenderInfo.class,"sen");
		System.out.println(info);
		Customer cus=ctx.getBean(Customer.class,"cus");
		System.out.println(cus);
		RateInfo ri=ctx.getBean(RateInfo.class,"ri");
		System.out.println(ri);
		RateUpdate ru=ctx.getBean(RateUpdate.class,"ru");
		System.out.println(ru);
		RateUpdateDetails rud1=ctx.getBean("rud1",RateUpdateDetails.class);	
		System.out.println(rud1);
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
