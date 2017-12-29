package com.itongye.controller;

import com.itongye.model.SysConfig;
import com.itongye.service.ISysConfigService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sysconfig")
public class SysConfigController {
    private static final Logger log = LogManager.getLogger("SysConfigController");
    @Resource
    private ISysConfigService sysConfigService;

    @RequestMapping("/savedata")
    public ModelAndView savedata(){
        ModelAndView mov = new ModelAndView();
        try {
            SysConfig sc = new SysConfig();
            sc.setConfig_key("111");
            sc.setConfig_value1("test1");
            sc.setConfig_value2("test2");
            sc.setConfig_name("test");
            sysConfigService.saveSysConfig(sc);
        }catch (Exception e) {
            log.error(e);
        }
        return mov;
    }

    @RequestMapping("/showdata")
    public ModelAndView showdata(){
        ModelAndView mov = new ModelAndView();
        try {
            SysConfig sc = sysConfigService.findSysConfigByConfig_key("111");
            mov.addObject("sysconfig", sc);
        }catch (Exception e) {
            log.error(e);
        }
        return mov;
    }
}
