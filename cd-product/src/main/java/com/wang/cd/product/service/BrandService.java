package com.wang.cd.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.cd.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-29 20:47:59
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

