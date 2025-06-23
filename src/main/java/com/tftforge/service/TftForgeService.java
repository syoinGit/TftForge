package com.tftforge.service;

import com.tftforge.TftforgeApplication;
import com.tftforge.data.MatchQueryParams;
import com.tftforge.repository.TftForgeRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TftForgeService {

  private final TftApiClient application;
  private final RestTemplate restTemplate = new RestTemplate();

  public TftForgeService(TftApiClient application) {
    this.application = application;
  }

  public List<String> getMatch(MatchQueryParams params) {
    return application.getMatchIds(params);
  }
}