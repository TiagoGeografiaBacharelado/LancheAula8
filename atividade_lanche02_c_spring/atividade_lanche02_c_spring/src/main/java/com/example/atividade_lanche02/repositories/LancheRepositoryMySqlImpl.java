package com.example.atividade_lanche02.repositories;

import com.example.atividade_lanche02.entities.Lanche;
import com.example.atividade_lanche02.interfaces.LancheRepository;

import java.util.List;

public class LancheRepositoryMySqlImpl implements LancheRepository {

    @Override
    public Lanche searchByCode(int code) {
        return null;
    }

    @Override
    public List<Lanche> buscar() {
        return List.of();
    }

    @Override
    public void addLanches(Lanche lanche) {

    }

    @Override
    public void removeLanche(int code) {

    }

    @Override
    public void updateLanche(int code, Lanche lanche) {

    }

    @Override
    public boolean estaVazio() {
        return false;
    }
}
