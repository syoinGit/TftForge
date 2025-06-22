package com.tftforge.service;

import com.tftforge.repository.TftForgeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TftForgeService {

  private final TftForgeRepository repository;
  private final RestTemplate restTemplate = new RestTemplate();

  private TftForgeService(TftForgeRepository repository) {
    this.repository = repository;


  }


  private getMBattle(String gameId) {










  }


}
