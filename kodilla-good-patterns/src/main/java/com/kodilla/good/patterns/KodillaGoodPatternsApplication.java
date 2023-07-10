package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

	public static void main(String[] args) {
		OrderRequestRetriever orderRequestRetreiver = new OrderRequestRetriever();
		OrderRequest orderRequest = orderRequestRetreiver.retrieve();

		ProductOrderService productOrderService = new ProductOrderService(
				new InformationService(), new OrderRepository());
		productOrderService.process(orderRequest);
	}
}
