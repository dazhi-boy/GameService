package com.dazhi.game.base.entity;

import javax.validation.constraints.NotEmpty;

import com.dazhi.game.common.BaseEntity;
import com.dazhi.game.common.annotations.ExceptionCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "user", description = "用户参数类")
public class User extends BaseEntity {
    @NotEmpty(message = "用户名不能为空")
    @ExceptionCode(value = 10001, message = "用户名不能为空")
	@ApiModelProperty(value = "用户名", example = "张三", required = true)
    private String username;
    @NotEmpty(message = "密码不能为空")
    @ExceptionCode(value = 10002, message = "密码不能为空")
	@ApiModelProperty(value = "密码", example = "123", required = true)
    private String password;

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