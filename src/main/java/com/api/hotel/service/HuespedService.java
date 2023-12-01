package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {
    @Autowired
    private HuespedRepository huespedRepository;
    //mostrar huespedest
    public List<Huesped> getAllHuespedes(){
        return  huespedRepository.findAll();
    }
    //crear huesped
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }
    //editar huesped
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }
    //eliminar huesped
    public void deleteHuespedById(Long huespedId){
        huespedRepository.deleteById(huespedId);

    }
}
