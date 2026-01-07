package com.example.FirstGameSpringProject.hedge.service;

public class TraderService {
    public Trader updateName(String email, String name) {
        Trader trader = repository.findByEmail(email)
                .orElseThrow(() -> new NotFoundException("Trader not found"));

        trader.setName(name);
        return repository.save(trader);
    }
}
