package com.wang.cd.product.dao;

import com.wang.cd.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangchen
 * @email 2213768002@qq.com
 * @date 2021-10-28 21:46:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
