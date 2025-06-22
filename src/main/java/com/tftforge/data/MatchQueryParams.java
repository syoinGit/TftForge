package com.tftforge.data;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MatchQueryParams {

  private String puuid;
  private int count = 20;
  private Long startTime;
  private Long endTime;

}