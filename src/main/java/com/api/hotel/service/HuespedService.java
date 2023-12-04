package com.api.hotel.service;

import com.api.hotel.error.HuespedNotFound;
import com.api.hotel.model.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Huesped findById(Long    huespedId) throws HuespedNotFound {
        Optional<Huesped> huesped = huespedRepository.findById(huespedId);

        if (huesped.isEmpty()) {
            throw new HuespedNotFound("huesped is not avaliable");
        }
        return huesped.get();
    }
}
