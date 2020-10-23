package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccountDetailsPublisher {

	@Autowired
//	  private AmqpTemplate amqpTemplate;
	  private RabbitTemplate rabbitTemplate;
	  
	  @Value("${jsa.rabbitmq.exchange}")
	  private String exchange;
	  
	//  @Value("${jsa.rabbitmq.routingkey}")
	//  private String routingKey;
	//  
	  public void publishMsg(String msg){
//	    amqpTemplate.convertAndSend(exchange, "", msg);
		rabbitTemplate.convertAndSend(exchange, "", msg);
	    System.out.println("Send msg = " + msg);
	  }
}
