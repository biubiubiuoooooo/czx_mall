package com.cao.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * ר����Ʒ
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:50:13
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

