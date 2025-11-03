package springboo.example.spring_mybatis.mapper;

import org.apache.ibatis.annotations.*;
import springboo.example.spring_mybatis.pojo.Emp;

import java.util.List;

/*
@author zhang
@Date   2025/10/17 11:14
@description
*/
@Mapper
public interface EmpMapper {
//    @Select("select *from tb_emp")
//    public List<Emp> em();
//
//    @Delete("delete from tb_emp where id=#{id}")
//    public int delete(int id);
//
//    @Options(keyProperty = "id", useGeneratedKeys = true)
//    @Insert("insert into tb_emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " + "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
//    public void insert(Emp emp);
//    @Options(keyProperty = "id", useGeneratedKeys = true)
//    @Update("update tb_emp set username=#{username},name=#{name},gender=#{gender},image=#{image},job=#{job},dept_id=#{deptId},update_time=#{updateTime} " + "where id=#{id}")
//    public void update(Emp em);
//
//    @Select("select  * from tb_emp where id=#{id}")
//    public Emp Findid(int id);
//    @Select("select *" +
//            "from tb_emp where name  like concat('%',#{name},'%') and gender = #{gender} and entrydate between '2010-01-01' and '2020-01-01'" +
//            "order by create_time desc")
    public List<Emp> getByequis(Emp em);



}
