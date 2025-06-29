package com.tftforge.data.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class MetadataDto {

  @JsonProperty("data_version")
  private String dataVersion;

  private String matchId;

  private List<String> participants;
}