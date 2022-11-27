package com.cao.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * �ɹ���Ϣ
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:56:23
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

