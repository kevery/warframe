package com.hvary.warframe.entity.basic;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 战甲技能
 * </p>
 *
 * @author kever
 * @since 2018-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WarframeAbility implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 战甲ID
     */
    private Long warframeId;

    /**
     * 图片
     */
    private String pic;

    /**
     * 技能名
     */
    private String abilityName;

    /**
     * 简介
     */
    private String abilityDesc;

    /**
     * 能量
     */
    private Integer energy;

    /**
     * 强度
     */
    private String strength;

    /**
     * 范围
     */
    private Integer abilityRange;

    /**
     * 持续时间
     */
    private String duration;

    /**
     * 其他
     */
    private String misc;

    /**
     * 详细描述
     */
    private String descDtl;

    /**
     * 排序
     */
    private Integer sort;


}
