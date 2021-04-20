package com.hcy;

import com.hcy.agent.Select;

/**
 * 持久层接口
 * @author HCY
 * @since 2021/4/18 10:33 上午
*/
public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);
}
