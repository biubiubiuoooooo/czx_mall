package com.cao.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * �����˻�����
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:45:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

