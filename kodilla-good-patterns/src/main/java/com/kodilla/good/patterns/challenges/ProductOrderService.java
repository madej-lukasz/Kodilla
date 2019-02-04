package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean ordered = orderService.order(order.getUser(), order.getProduct(), order.getQuantity(), order.getOrderDate());
        if (ordered) {
            informationService.inform(order.getUser(), order.getProduct(), order.getQuantity());
            orderRepository.makeOrder(order.getUser(), order.getProduct(), order.getQuantity(), order.getOrderDate());

            return new OrderDto(order.getProduct(), order.getUser(), true);
        } else {
            System.out.println("Order not complete.");
        } return null;
    }
}
