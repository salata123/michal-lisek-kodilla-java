package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges2.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

	public static void main(String[] args) {
		OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
		OrderRequest orderRequest = orderRequestRetriever.retrieve();

		ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderRepository());
		productOrderService.process(orderRequest);
	}
}
