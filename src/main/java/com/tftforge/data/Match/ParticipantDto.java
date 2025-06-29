package com.tftforge.data.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tftforge.data.Match.MatchDto.CompanionDto;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ParticipantDto {
  private CompanionDto companion;

  @JsonProperty("traits")
  private List<TraitDto> traits;

  @JsonProperty("puuid")
  private String puuid;

  @JsonProperty("placement")
  private int placement;

}
