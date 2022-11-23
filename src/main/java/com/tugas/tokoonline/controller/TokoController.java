package com.tugas.tokoonline.controller;

import com.tugas.tokoonline.model.Toko;
import com.tugas.tokoonline.response.ResponHelper;
import com.tugas.tokoonline.service.TokoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/barang")
public class TokoController {

    @Autowired
    private TokoService tokoService;

    @GetMapping
    public Object getAllToko() {
    return ResponHelper.ok(tokoService.getAllToko());
    }

    @GetMapping("/{Id}")
    public Object getToko(@PathVariable("Id") Long Id) {
    return ResponHelper.ok(tokoService.getToko(Id));
    }

    @PostMapping
    public Object addToko(@RequestBody Toko toko) {
    return ResponHelper.ok(tokoService.addToko(toko));
    }

    @PutMapping("/{Id}")
    public Object editTokoById(@PathVariable("Id") Long Id, @RequestBody Toko toko) {
        return ResponHelper.ok(tokoService.editToko(Id, toko.getName(), toko.getPrice(), toko.getCount(),toko.getRating(), toko.getDescription(), toko.isPublish()));
    }

    @DeleteMapping("/{Id}")
    public void deleteById(@PathVariable("Id") Long Id) {
    tokoService.deleteTokoById(Id);
    }


}
