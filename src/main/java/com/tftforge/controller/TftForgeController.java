package com.tftforge.controller;

import com.tftforge.service.TftForgeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TftForgeController {


  private final TftForgeService service;

  public TftForgeController(TftForgeService service) {
    this.service = service;
  }

  @GetMapping("/allCamp")
  public getCampData(){
    service.
  }





}