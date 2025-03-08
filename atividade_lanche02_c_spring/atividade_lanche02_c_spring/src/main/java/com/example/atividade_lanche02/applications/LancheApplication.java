package com.example.atividade_lanche02.applications;


import java.util.List;

import com.example.atividade_lanche02.entities.Lanche;
import com.example.atividade_lanche02.repositories.LancheRepositoryImpl;
import com.example.atividade_lanche02.services.LancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LancheApplication {
    private LancheRepositoryImpl lancheRepositoryImpl;
    private LancheService lancheService;

    @Autowired
    public LancheApplication(
        LancheRepositoryImpl lancheRepositoryImpl,
        LancheService lancheService) {
        this.lancheRepositoryImpl = lancheRepositoryImpl;
        this.lancheService = lancheService;
    }

    public void cadastrar(Lanche lanche){
        lancheRepositoryImpl.addLanches(lanche);
        lancheService.save(lanche);
        System.out.println(lancheService.save(lanche));
    }

    public void atualizar(int codigo, Lanche lanche){
        lancheRepositoryImpl.updateLanche(codigo, lanche);
        lancheService.save(lanche);
    }

    public void remover(int codigo){
        Lanche lanche = lancheRepositoryImpl.searchByCode(codigo);
        lancheRepositoryImpl.removeLanche(codigo);
        lancheService.delete(lanche);
    }

    public List<Lanche> buscar(){
        return this.lancheRepositoryImpl.buscar();
    }

    public Lanche buscarPorCodigo(int codigo){
        return this.lancheRepositoryImpl.searchByCode(codigo);
    }

    public double calcularLanche(Lanche lanche, int quantidade){
        return lanche.getPreco() * quantidade;
    }

    public boolean estaVazio(){
        return lancheRepositoryImpl.estaVazio();
    }
}
