package com.tugas.tokoonline.service;

import com.tugas.tokoonline.model.Toko;
import com.tugas.tokoonline.repository.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokoServiceImpl implements TokoService{

 @Autowired
    private TokoRepository tokoRepository;

    @Override
    public Object getAllToko() {
        return tokoRepository.findAll();
    }

    @Override
    public Object addToko(Toko toko) {
        return tokoRepository.save(toko);
    }

    @Override
    public Object getToko(Long Id) {
        return tokoRepository.findById(Id).get();
    }

    @Override
    public Object editToko(Long Id, String name, Float price, int count, int rating, String description, boolean publish) {
        Toko toko = tokoRepository.findById(Id).get();
        toko.setName(name);
        toko.setPrice(price);
        toko.setCount(count);
        toko.setRating(rating);
        toko.setDescription(description);
        toko.setPublish(publish);
    return tokoRepository.save(toko);
    }

    @Override
    public void deleteTokoById(Long Id) {
        tokoRepository.deleteById(Id);
    }
}
