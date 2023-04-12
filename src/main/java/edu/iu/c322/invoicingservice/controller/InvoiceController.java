package edu.iu.c322.invoicingservice.controller;

import edu.iu.c322.invoicingservice.model.Invoice;
import edu.iu.c322.invoicingservice.model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/invoicing")
public class InvoiceController {
    private final WebClient orderService;
    public InvoiceController(WebClient.Builder webClientBuilder){
        orderService = webClientBuilder.baseUrl("http://localhost:8083").build();
    }

    public Invoice findByOrderId(@PathVariable int orderId){
        Order order = orderService.get().uri("/orders/order/{orderId}", orderId)
                .retrieve().bodyToMono(Order.class).block();
        Invoice invoice = new Invoice();
        invoice.setTotal(order.total());
        invoice.setPayment(order.payment());
        return invoice;
    }
}