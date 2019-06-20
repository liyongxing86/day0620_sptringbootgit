package com.qf.lyx.Mapper;

import com.qf.lyx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 李永星 on 2019/6/20.
 */
@Mapper
public interface UserMapper {
    public List<User> fndAll();
}
