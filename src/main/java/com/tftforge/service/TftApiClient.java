package com.tftforge.service;

import com.tftforge.data.MatchQueryParams;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class TftApiClient {

  @Value("${riot.api.key}")
  private String apiKey;
  private final RestTemplate restTemplate = new RestTemplate();


  public List<String> getMatchIds(MatchQueryParams params) {
    UriComponentsBuilder builder = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host("asia.api.riotgames.com")
        .path("/tft/match/v1/matches/by-puuid/{puuid}/ids")
        .queryParam("count", params.getCount())
        .encode();

    return
  }


}
