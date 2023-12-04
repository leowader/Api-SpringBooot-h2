package com.api.hotel.controller;

import com.api.hotel.error.HuespedNotFound;
import com.api.hotel.model.Huesped;
import com.api.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {
    @Autowired
    private HuespedService huespedService;//inyeccion huesped service
    //GET
    @GetMapping
    public List<Huesped> getAll(){
        return huespedService.getAllHuespedes();
    }
    //POST
    @GetMapping("buscar/{id}")
    public Huesped findById(@PathVariable Long id) throws HuespedNotFound {
        return huespedService.findById(id);
    }
    @PostMapping
    public Huesped createHuesped(@RequestBody   Huesped huesped){
        return  huespedService.createHuesped(huesped);
    }
    //PUT
    @PutMapping("editar/{id}")
    public Huesped updateHuesped(@RequestBody Huesped huesped,@PathVariable Long id){

        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }
    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void deleteHuesped(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }

}
