package com.dazhi.game.base.service.impl;

import com.dazhi.game.base.entity.Role;
import com.dazhi.game.base.mapper.RoleMapper;
import com.dazhi.game.base.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author dazhi
 * @since 2020-05-21
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
