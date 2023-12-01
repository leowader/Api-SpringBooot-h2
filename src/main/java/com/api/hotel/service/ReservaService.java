package com.api.hotel.service;
import com.api.hotel.model.Reserva;
import com.api.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    //mostrar huespedest
    public List<Reserva> getAllReservas(){
        return  reservaRepository.findAll();
    }
    //crear huesped
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }
    //editar huesped
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }
    //eliminar huesped
    public void deleteReservaById(Long reservaId){
        reservaRepository.deleteById(reservaId);

    }
}
