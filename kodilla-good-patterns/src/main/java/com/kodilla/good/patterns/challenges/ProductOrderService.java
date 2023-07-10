package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        if (orderRequest.isInStock()) {
            informationService.inform(orderRequest.getOrder());
            orderRepository.addOrder(orderRequest.getOrder());
            return new OrderDto(orderRequest.getOrder(), true);
        } else {
            informationService.informOutOfStock(orderRequest.getOrder());
            return new OrderDto(orderRequest.getOrder(), false);
        }
    }
}