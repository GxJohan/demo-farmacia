package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Medicamento;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento,Integer>{
    //Clase vacía por el momento
}
