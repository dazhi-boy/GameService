package com.dazhi.game.base.entity;

import javax.validation.constraints.NotNull;

import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

//import com.baomidou.mybatisplus.annotation.Version;

public class User {
    private Long id;
    
	@Version
    private Integer version;
	@JsonIgnore
    private Boolean flag;
	@NotNull
	@ApiModelProperty(value = "用户名", example = "张三", required = true)
    private String username;
	@NotNull
	@ApiModelProperty(value = "密码", example = "123", required = true)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

    public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}