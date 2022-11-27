package com.cao.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * ֧����Ϣ��
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:45:25
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

