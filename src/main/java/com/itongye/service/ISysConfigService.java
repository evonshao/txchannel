package com.itongye.service;

import com.itongye.model.SysConfig;
import org.springframework.transaction.annotation.Transactional;


public interface ISysConfigService {
    SysConfig findSysConfigByConfig_key(String key) throws Exception;

    @Transactional
    SysConfig saveSysConfig(SysConfig sc) throws Exception;
}
