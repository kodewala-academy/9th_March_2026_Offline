package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.config.SpringConfig;
import com.amazon.payment.PaymentService;

public class App 
{
    public static void main( String[] args )
    {

      ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      
      PaymentService paymentService =   context.getBean(PaymentService.class);
      paymentService.doPayment();
    	
    }
}
