package com.tugas.tokoonline.service;

import com.tugas.tokoonline.exception.InternalErrorException;
import com.tugas.tokoonline.model.Order;
import com.tugas.tokoonline.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Object getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Object addOrder(Order order) {
        String pemilik = order.getPemilik();
        var validasi = orderRepository.findByPemilik(pemilik);
        if (validasi.isPresent()) {
            throw new InternalErrorException("Email Already Axist");
        }else {
            return orderRepository.save(order);
        }
    }

    @Override
    public Object getOrder(Long No) {
        return orderRepository.findById(No).get();
    }

    @Override
    public Object editOrder(Long No, String namaBarang, String harga, String pemilik) {
       Order order = orderRepository.findById(No).get();
       order.setNamaBarang(namaBarang);
       order.setHarga(harga);
       order.setPemilik(pemilik);
       return orderRepository.save(order);
    }


    @Override
    public void deleteOrderById(Long No) {
    orderRepository.deleteById(No);
    }
}
