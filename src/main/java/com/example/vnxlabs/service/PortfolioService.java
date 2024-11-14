package com.example.vnxlabs.service;

import com.example.vnxlabs.entity.Portfolio;
import com.example.vnxlabs.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {
   @Autowired
    private PortfolioRepository portfolioRepository;

   public List<Portfolio> getAll(){
       return portfolioRepository.findAll();
   }

   public Portfolio save(Portfolio portfolio){
       return portfolioRepository.save(portfolio);
   }
   public void delete(Long id){
       portfolioRepository.deleteById(id);
   }
}
