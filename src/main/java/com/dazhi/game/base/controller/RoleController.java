package com.dazhi.game.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.base.entity.Role;
import com.dazhi.game.base.service.IRoleService;
import com.dazhi.game.common.BaseController;

import io.swagger.annotations.Api;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-21
 */
@RestController
@RequestMapping("/base/role")
@Api(value = "/base/role", tags = "RoleController", description = "权限管理接口")
public class RoleController extends BaseController<Role> {
	@Autowired
	public void setiService(IRoleService roleService) {
		super.setiService(roleService);
	}
}
