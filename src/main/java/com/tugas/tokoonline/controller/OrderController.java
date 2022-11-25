package com.tugas.tokoonline.controller;

import com.tugas.tokoonline.dto.OrderDto;
import com.tugas.tokoonline.model.Order;
import com.tugas.tokoonline.response.ResponHelper;
import com.tugas.tokoonline.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public Object getAllOrder() {
        return ResponHelper.ok(orderService.getAllOrder());
    }

    @PostMapping
    public Object addOrder(@RequestBody OrderDto orderDto) {
        return ResponHelper.ok(orderService.addOrder(modelMapper.map(orderDto, Order.class)));
    }

    @GetMapping("/{No}")
    public Object getOrder(@PathVariable("No") Long No) {
        return ResponHelper.ok(orderService.getOrder(No));
    }

    @PutMapping("/{No}")
    public Object editOrderById(@PathVariable("No")Long No, @RequestBody Order order) {
        return ResponHelper.ok(orderService.editOrder(No, order.getNamaBarang(), order.getHarga(), order.getPemilik()));
    }

    @DeleteMapping("/{No}")
    public void deleteOrderById(@PathVariable("No") Long No) {
        orderService.deleteOrderById(No);
    }

}
