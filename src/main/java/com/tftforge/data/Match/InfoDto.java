package com.tftforge.data.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class InfoDto {

  @JsonProperty("gameCreation")
  private long gameCreation;

  @JsonProperty("participants")
  private List<ParticipantDto> participants;

}