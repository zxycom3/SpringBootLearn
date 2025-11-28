package springboo.example.taliapro.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import springboo.example.taliapro.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
     @Select("select *from talias.dept")
     public List<Dept> FindAllDept();
     @Delete("delete from talias.dept where id=#{id}")
     public void DeleteById(Integer id);
     @Insert("insert into talias.dept(name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
     public void InsertByDept(Dept dept);
}
