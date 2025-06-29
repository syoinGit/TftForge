package com.tftforge.data.Match;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDto {
    private MetadataDto metadata;
    private InfoDto info;

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MetadataDto {
        @JsonProperty("data_version")
        private String dataVersion;

        @JsonProperty("match_id")
        private String matchId;

        private List<String> participants;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class InfoDto {
        private String endOfGameResult;

        private long gameCreation;
        private long gameId;

        @JsonProperty("game_datetime")
        private long gameDatetime;

        @JsonProperty("game_length")
        private float gameLength;

        @JsonProperty("game_version")
        private String gameVersion;

        @JsonProperty("game_variation")
        private String gameVariation;

        private int mapId;
        private int queue_id;

        @JsonProperty("queueId")
        private Integer queueId; // deprecated

        @JsonProperty("tft_game_type")
        private String tftGameType;

        @JsonProperty("tft_set_core_name")
        private String tftSetCoreName;

        @JsonProperty("tft_set_number")
        private int tftSetNumber;

        private List<ParticipantDto> participants;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ParticipantDto {
        private CompanionDto companion;

        @JsonProperty("gold_left")
        private int goldLeft;

        @JsonProperty("last_round")
        private int lastRound;

        private int level;
        private int placement;

        @JsonProperty("players_eliminated")
        private int playersEliminated;

        private String puuid;
        private String riotIdGameName;
        private String riotIdTagline;

        @JsonProperty("time_eliminated")
        private float timeEliminated;

        @JsonProperty("total_damage_to_players")
        private int totalDamageToPlayers;

        private List<TraitDto> traits;
        private List<UnitDto> units;

        private boolean win;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CompanionDto {
        @JsonProperty("content_ID")
        private String contentId;

        @JsonProperty("item_ID")
        private int itemId;

        @JsonProperty("skin_ID")
        private int skinId;

        private String species;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TraitDto {
        private String name;

        @JsonProperty("num_units")
        private int numUnits;

        private int style;

        @JsonProperty("tier_current")
        private int tierCurrent;

        @JsonProperty("tier_total")
        private int tierTotal;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UnitDto {
        private List<Integer> items;

        @JsonProperty("character_id")
        private String characterId;

        private List<String> itemNames;
        private String chosen;
        private String name;
        private int rarity;
        private int tier;
    }
}
