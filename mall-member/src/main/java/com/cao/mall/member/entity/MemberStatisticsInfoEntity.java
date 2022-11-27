package com.cao.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Աͳ����Ϣ
 * 
 * @author cao
 * @email cao@gmail.com
 * @date 2022-11-26 17:53:49
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ��Աid
	 */
	private Long memberId;
	/**
	 * �ۼ����ѽ��
	 */
	private BigDecimal consumeAmount;
	/**
	 * �ۼ��Żݽ��
	 */
	private BigDecimal couponAmount;
	/**
	 * ��������
	 */
	private Integer orderCount;
	/**
	 * �Ż�ȯ����
	 */
	private Integer couponCount;
	/**
	 * ������
	 */
	private Integer commentCount;
	/**
	 * �˻�����
	 */
	private Integer returnOrderCount;
	/**
	 * ��¼����
	 */
	private Integer loginCount;
	/**
	 * ��ע����
	 */
	private Integer attendCount;
	/**
	 * ��˿����
	 */
	private Integer fansCount;
	/**
	 * �ղص���Ʒ����
	 */
	private Integer collectProductCount;
	/**
	 * �ղص�ר������
	 */
	private Integer collectSubjectCount;
	/**
	 * �ղص���������
	 */
	private Integer collectCommentCount;
	/**
	 * �������������
	 */
	private Integer inviteFriendCount;

}
