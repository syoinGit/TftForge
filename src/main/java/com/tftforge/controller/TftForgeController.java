package com.tftforge.controller;

import com.tftforge.data.MatchQueryParams;
import com.tftforge.data.Player;
import com.tftforge.service.TftForgeService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TftForgeController {

  private final TftForgeService service;

  public TftForgeController(TftForgeService service) {
    this.service = service;
  }

  @GetMapping("/getMatches")
  private List<String> getCampData(MatchQueryParams params) {
    return service.getMatch(params);
  }

  @GetMapping("/getPuuid")
  public Player getPuuid(@RequestParam String gameName, @RequestParam String tagLine) {
    Player player = new Player();
    player.setGameName(gameName);
    player.setTagLine(tagLine);
    return service.getPuuid(player);
  }

}
