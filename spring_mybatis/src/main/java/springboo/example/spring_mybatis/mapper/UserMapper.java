package springboo.example.spring_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import springboo.example.spring_mybatis.pojo.User;

import java.util.List;

/*
@author zhang
@Date   2025/10/13 14:21
@description
*/
@Mapper
public interface UserMapper
{
//    @Select("select *from tb_user")
    public List<User> list();
}

