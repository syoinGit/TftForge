package com.tftforge.service;

import com.tftforge.data.Match.MatchDto;
import com.tftforge.data.MatchQueryParams;
import com.tftforge.data.Player;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

    String url = builder.buildAndExpand(params.getPuuid(), params.getCount()).toUriString();

    HttpHeaders headers = new HttpHeaders();
    headers.set("X-RIOT-Token", apiKey);
    HttpEntity<Void> entity = new HttpEntity<>(headers);

    ResponseEntity<List<String>> response = restTemplate.exchange(
        url,
        HttpMethod.GET,
        entity,
        new ParameterizedTypeReference<List<String>>() {
        });

    return response.getBody();
  }

  public Player getPuuid(Player player) {
    UriComponentsBuilder builder = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host("asia.api.riotgames.com")
        .path("/riot/account/v1/accounts/by-riot-id/{gameName}/{tagLine}")
        .encode();

    String url = builder.buildAndExpand(player.getGameName(), player.getTagLine()).toUriString();

    HttpHeaders headers = new HttpHeaders();
    headers.set("X-Riot-Token", apiKey);
    HttpEntity<Void> entity = new HttpEntity<>(headers);

    ResponseEntity<Player> response = restTemplate.exchange(
        url,
        HttpMethod.GET,
        entity,
        Player.class
    );

    return response.getBody();
  }

  public MatchDto getMatchDate(String matchId) {
    UriComponentsBuilder builder = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host("asia.api.riotgames.com")
        .path("/tft/match/v1/matches/{matchId}")
        .encode();

    String url = builder.buildAndExpand(matchId).toUriString();

    HttpHeaders headers = new HttpHeaders();
    headers.set("X-Riot-Token", apiKey);
    HttpEntity<Void> entity = new HttpEntity<>(headers);

    ResponseEntity<MatchDto> response = restTemplate.exchange(
        url,
        HttpMethod.GET,
        entity,
        MatchDto.class
    );
    return response.getBody();
  }
}