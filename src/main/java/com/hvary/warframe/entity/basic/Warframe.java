package com.hvary.warframe.entity.basic;

import lombok.Data;

/**
 * 战甲
 */
@Data
public class Warframe {

    /**
     * 官方名称
     */
    private String name;

    /**
     * 别名
     */
    private String aliasName;

    /**
     * 简介
     */
    private String desc;

}
