package com.hxkj.zncrm.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hxkj.zncrm.dao.domain.ReceiveEntity;

public interface YingfuMapper {

    public List<ReceiveEntity> getPaymentList(Map<String, String> input);

    public String getPaymentCount(Map<String, String> input);

    public long addPayment(Map<String, String> input);

    public int delPayment(Map<String, String> input);

    public int updatePayment(Map<String, String> input);
}
