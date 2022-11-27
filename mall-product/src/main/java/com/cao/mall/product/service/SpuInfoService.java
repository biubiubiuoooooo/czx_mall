package com.cao.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu��Ϣ
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-11-25 16:18:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

