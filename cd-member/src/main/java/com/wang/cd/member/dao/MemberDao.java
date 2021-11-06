package com.wang.cd.member.dao;

import com.wang.cd.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-29 21:26:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
