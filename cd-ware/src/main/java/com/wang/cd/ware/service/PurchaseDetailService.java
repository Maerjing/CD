package com.wang.cd.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.cd.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-29 21:43:16
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

