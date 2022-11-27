package com.cao.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * �Ż�ȯ��Ϣ
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:50:13
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

