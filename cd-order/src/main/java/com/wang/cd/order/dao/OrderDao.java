package com.wang.cd.order.dao;

import com.wang.cd.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-29 21:35:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
