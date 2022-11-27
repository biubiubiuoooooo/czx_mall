package com.cao.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * ���ֱ仯��ʷ��¼
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:53:50
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

