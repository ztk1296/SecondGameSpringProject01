package com.example.FirstGameSpringProject.hedge.repository;

import com.example.FirstGameSpringProject.hedge.model.TraderDTO;

import java.util.List;

public class TraderRepository {
    List<TraderDTO.Trader> findByEmail();
    List<TraderDTO.Trader> findAllByOrderByIdAsc();
}
