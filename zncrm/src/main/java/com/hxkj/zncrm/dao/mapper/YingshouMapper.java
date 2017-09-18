package com.hxkj.zncrm.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hxkj.zncrm.dao.domain.ReceiveEntity;

public interface YingshouMapper {

    public List<ReceiveEntity> getReceiveList(Map<String, String> input);

    public String getReceiveCount(Map<String, String> input);

    public long addReceive(Map<String, String> input);

    public int delReceive(Map<String, String> input);

    public int updateReceive(Map<String, String> input);
}
