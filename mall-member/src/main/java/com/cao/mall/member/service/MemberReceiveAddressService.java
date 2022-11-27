package com.cao.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cao.common.utils.PageUtils;
import com.cao.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * ��Ա�ջ���ַ
 *
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:53:49
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

