package com.cao.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ʒ���ݼ۸�
 * 
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:50:13
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * ������
	 */
	private Integer fullCount;
	/**
	 * ����
	 */
	private BigDecimal discount;
	/**
	 * �ۺ��
	 */
	private BigDecimal price;
	/**
	 * �Ƿ���������Ż�[0-���ɵ��ӣ�1-�ɵ���]
	 */
	private Integer addOther;

}
