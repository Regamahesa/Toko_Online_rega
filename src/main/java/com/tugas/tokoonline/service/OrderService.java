package com.tugas.tokoonline.service;

import com.tugas.tokoonline.model.Order;

public interface OrderService {

    Object getAllOrder();

    Object addOrder(Order order);

    Object getOrder(Long No);

    Object editOrder(Long No, String namaBarang, String harga, String pemilik);


    void deleteOrderById(Long No);
}
