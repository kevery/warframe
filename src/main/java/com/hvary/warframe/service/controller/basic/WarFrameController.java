package com.hvary.warframe.service.controller.basic;


import com.hvary.warframe.entity.basic.WarframeAbility;
import com.hvary.warframe.service.basic.IWarframeAbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 战甲controller
 */
@RestController
@RequestMapping("/data/warframe")
public class WarFrameController {


    @Autowired
    private IWarframeAbilityService warframeAbilityServiceImpl;

    /**
     * 查询单个战甲数据
     *
     * @return
     */
    @RequestMapping("/query")
    public WarframeAbility query() {
        WarframeAbility warframeAbilityServiceImplById = warframeAbilityServiceImpl.getById(1);

        return warframeAbilityServiceImplById;
    }
}
