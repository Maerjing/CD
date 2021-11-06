package com.wang.cd.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.cd.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-29 21:35:31
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

