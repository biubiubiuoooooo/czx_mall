package com.cao.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * ��Աͳ����Ϣ
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:53:49
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

