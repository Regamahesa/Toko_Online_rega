package com.tugas.tokoonline.service;

import com.tugas.tokoonline.model.Toko;

public interface TokoService {

Object getAllToko();

Object addToko(Toko toko);

Object getToko(Long Id);

Object editToko(Long Id, String name, Float price, int count, int rating, String description, boolean publish);

void deleteTokoById(Long Id);

}
