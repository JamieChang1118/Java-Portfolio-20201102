package com.spring.mvc.portfolio.controller;

import com.spring.mvc.portfolio.repository.AssetRepository;
import com.spring.mvc.portfolio.repository.ProfitRepository;
import com.spring.mvc.portfolio.service.PortfolioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("portfolio/chart")
public class ChartController {
    @Autowired
    private AssetRepository assetRepository;
    
    @Autowired
    private ProfitRepository profitRepository;
    
    
    @GetMapping(value = {"/asset/{id}"})
    public List asset(@PathVariable("id") Optional<Integer> id){
        return assetRepository.findById(id.get());
    }
    
    
    @GetMapping(value = {"/profit/{id}"})
    public List profit(@PathVariable("id") Optional<Integer> id){
        return profitRepository.findById(id.get());
    }
    
}