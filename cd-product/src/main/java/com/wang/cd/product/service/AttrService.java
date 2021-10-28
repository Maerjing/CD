package com.wang.cd.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.cd.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-27 23:03:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

