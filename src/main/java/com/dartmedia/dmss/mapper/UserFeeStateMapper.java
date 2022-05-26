package com.dartmedia.dmss.mapper;

import java.util.List;

import com.dartmedia.dmss.core.IMapper;
import com.dartmedia.dmss.core.MapperInterface;
import com.dartmedia.dmss.dto.UserFeeState;

@MapperInterface
public interface UserFeeStateMapper extends IMapper<UserFeeState> {
  public List<UserFeeState> findAllByDate(String date) throws Exception;

  public List<UserFeeState> findAllByUser(String accountId) throws Exception;
}