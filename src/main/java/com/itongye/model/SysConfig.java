package com.itongye.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author shaoliang
 */
@Entity
@Table(name="txbus_sys_config")
public class SysConfig implements Serializable{

	private static final long serialVersionUID = -2570065679168056149L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=128,nullable=false)
	private String config_name;

	@Column(length=128,nullable=false)
	private String config_key;
	
	@Column(nullable=false)
	@Type(type="text")
	private String config_value1;

	@Column(nullable=false)
	@Type(type="text")
	private String config_value2;
	
	@Column(updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
	private Date updatedate=new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConfig_name() {
		return config_name;
	}

	public void setConfig_name(String config_name) {
		this.config_name = config_name;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getConfig_value1() {
		return config_value1;
	}

	public void setConfig_value1(String config_value1) {
		this.config_value1 = config_value1;
	}

	public String getConfig_value2() {
		return config_value2;
	}

	public void setConfig_value2(String config_value2) {
		this.config_value2 = config_value2;
	}

	public String getConfig_key() {
		return config_key;
	}

	public void setConfig_key(String config_key) {
		this.config_key = config_key;
	}
}
