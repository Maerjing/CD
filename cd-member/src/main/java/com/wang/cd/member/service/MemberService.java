package com.wang.cd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.cd.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-29 21:26:57
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

