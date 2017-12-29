package com.itongye.service.impl;

import com.itongye.repository.ISysConfigRepository;
import com.itongye.model.SysConfig;
import com.itongye.service.ISysConfigService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "sysConfigService")
public class SysConfigServiceImpl implements ISysConfigService{
    private static final Logger log = LogManager.getLogger("SysConfigServiceImpl");

    @Resource
    private ISysConfigRepository sysRepository;

    @Override
    public SysConfig findSysConfigByConfig_key(String key) throws Exception {
        SysConfig result = sysRepository.findSysConfigByConfig_key(key);
        return result;
    }

    @Override
    public SysConfig saveSysConfig(SysConfig sc) throws Exception {
        return sysRepository.save(sc);
    }
}
