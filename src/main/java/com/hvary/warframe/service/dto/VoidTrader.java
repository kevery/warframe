package com.hvary.warframe.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 虚空商人
 * 2018/11/25
 */
@NoArgsConstructor
@Data
public class VoidTrader {

    /**
     * id : 5b3f70c1be87e4524f04d5ec
     * activation : 2018-11-30T14:00:00.000Z
     * startString : 5d 17h 34m 18s
     * expiry : 2018-12-02T14:00:00.000Z
     * active : false
     * character : Baro Ki'Teer
     * location : Kronia Relay (Saturn)
     * inventory : []
     * psId : 5b3f70c1be87e4524f04d5ec0
     * endString : 7d 17h 34m 18s
     */

    private String id;
    private String activation;
    private String startString;
    private String expiry;
    private boolean active;
    private String character;
    private String location;
    private String psId;
    private String endString;
    private List<?> inventory;
}
