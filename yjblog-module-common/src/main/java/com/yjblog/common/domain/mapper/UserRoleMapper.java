package com.yjblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yjblog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @author 木白
 * @date 2024/5/22
 * @description
 */
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {
    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    default List<UserRoleDO> selectByUsername(String username) {
        LambdaQueryWrapper<UserRoleDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserRoleDO::getUsername, username);

        return selectList(wrapper);
    }
}