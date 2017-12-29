package com.itongye.repository;

import com.itongye.model.SysConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name="txbus_sys_config")
@Qualifier("sysRepository")
public interface ISysConfigRepository extends CrudRepository<SysConfig, Long> {
    SysConfig findOne(Long id);

    @Query("select t from SysConfig t where t.config_key=:config_key")
    SysConfig findSysConfigByConfig_key(@Param("config_key") String config_key);
}
