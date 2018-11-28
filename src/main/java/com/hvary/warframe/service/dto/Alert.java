package com.hvary.warframe.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 警报
 * 2018/11/25
 */
@NoArgsConstructor
@Data
public class Alert {

    /**
     * id : 5bf9aeb159db5fd764554f1e
     * activation : 2018-11-24T20:08:45.648Z
     * startString : -27m 56s
     * expiry : 2018-11-24T20:44:50.871Z
     * active : true
     * mission : {"node":"Ani (Void)","type":"Extermination","faction":"Orokin","reward":{"items":[],"countedItems":[{"count":20,"type":"Void Traces"}],"credits":9800,"asString":"20 Void Traces + 9800cr","itemString":"20 Void Traces","thumbnail":"https://i.imgur.com/vvZGMPv.png","color":6923485},"minEnemyLevel":23,"maxEnemyLevel":28,"nightmare":false,"archwingRequired":false}
     * eta : 8m 9s
     * rewardTypes : ["traces"]
     */

    private String id;
    private String activation;
    private String startString;
    private String expiry;
    private boolean active;
    private MissionBean mission;
    private String eta;
    private List<String> rewardTypes;

    @NoArgsConstructor
    @Data
    public static class MissionBean {
        /**
         * node : Ani (Void)
         * type : Extermination
         * faction : Orokin
         * reward : {"items":[],"countedItems":[{"count":20,"type":"Void Traces"}],"credits":9800,"asString":"20 Void Traces + 9800cr","itemString":"20 Void Traces","thumbnail":"https://i.imgur.com/vvZGMPv.png","color":6923485}
         * minEnemyLevel : 23
         * maxEnemyLevel : 28
         * nightmare : false
         * archwingRequired : false
         */

        private String node;
        private String type;
        private String faction;
        private RewardBean reward;
        private int minEnemyLevel;
        private int maxEnemyLevel;
        private boolean nightmare;
        private boolean archwingRequired;

        @NoArgsConstructor
        @Data
        public static class RewardBean {
            /**
             * items : []
             * countedItems : [{"count":20,"type":"Void Traces"}]
             * credits : 9800
             * asString : 20 Void Traces + 9800cr
             * itemString : 20 Void Traces
             * thumbnail : https://i.imgur.com/vvZGMPv.png
             * color : 6923485
             */

            private int credits;
            private String asString;
            private String itemString;
            private String thumbnail;
            private int color;
            private List<?> items;
            private List<CountedItemsBean> countedItems;

            @NoArgsConstructor
            @Data
            public static class CountedItemsBean {
                /**
                 * count : 20
                 * type : Void Traces
                 */

                private int count;
                private String type;
            }
        }
    }
}
