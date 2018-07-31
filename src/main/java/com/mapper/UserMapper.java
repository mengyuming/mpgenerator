package com.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.beans.User;

public interface UserMapper extends BaseMapper<User>{

	public void deleteAll();
}
