package com.tftforge.data.Match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TraitDto {

  @JsonProperty("name")
  private String name;

  @JsonProperty("num_units")
  private int numUnits;

  @JsonProperty("style")
  private int style;

  @JsonProperty("tier_current")
  private int tierCurrent;

  @JsonProperty("tier_total")
  private int tierTotal;

}