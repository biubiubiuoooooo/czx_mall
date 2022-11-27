package com.cao.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * ��Ա��¼��¼
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:53:50
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

